package com.up72.busi.tag;

import com.up72.busi.dto.resp.BusiCategoryResp;
import com.up72.busi.service.IBusiCategoryService;
import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.framework.util.page.PageBounds;

import javax.servlet.jsp.JspException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryTag extends BaseTag{

    /**标签名称,如果"var"未启用的话，使用此变量*/
    private static final String tagName = "category";

    /** 业务字段*/
    private Long siteMenuId;
    private Long categoryId;
    private Long parentId;

    private Map<String,Object> param = new HashMap<String,Object>();
    /** 初始化业务数据 */
    public int doStartTag() throws JspException {
        if(ObjectUtils.isEmpty(itemId)){
            itemId = tagName;
        }
        //业务数据
        if(items == null && begin == 0 && end == -1){
            rawItems = initItems();
        }
        //如果有带入数据，则优先
        if(items != null){
            rawItems = items;
        }
        return super.doStartTag();
    }

    /**
     * 分类
     * @return
     */
    private List<BusiCategoryResp> initItems(){
        List<BusiCategoryResp> list = new ArrayList<BusiCategoryResp>();
        if(categoryId == null
                && siteMenuId == null
                && parentId == null){
            return list;
        }
        try {
            IBusiCategoryService busiCategoryService = (IBusiCategoryService)ApplicationContextHolder.getBean("busiCategoryService");
            param.put("isEnable",1);
            param.put("isDel",0);
            PageBounds pageBounds = new PageBounds(getLimit());
            list = busiCategoryService.getList4TmplFile(param, pageBounds);
            if(categoryId != null){
                if(ObjectUtils.isNotEmpty(list)){
                    pageContext.getRequest().setAttribute(itemId,list.get(0));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Long getCategoryId() {

        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        if(categoryId != null && categoryId != 0L){
            this.categoryId = categoryId;
            param.put("id",categoryId);
        }
    }

    public Long getSiteMenuId() {
        return siteMenuId;
    }

    public void setSiteMenuId(Long siteMenuId) {
        if(siteMenuId != null && siteMenuId != 0L){
            this.siteMenuId = siteMenuId;
            param.put("siteMenuId",siteMenuId);
        }
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
        param.put("parentId",parentId);
    }
}
