package com.up72.busi.tag;

import com.up72.busi.model.BusiResource;
import com.up72.busi.service.IBusiResourceService;
import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.ParamUtils;
import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceTag extends BaseTag{

    /**标签名称,如果"var"未启用的话，使用此变量*/
    private static final String tagName = "resource";

    /** 业务字段*/
    private Long categoryId;
    private Long siteMenuId;
    private String type = "PC";
    private Long resourceId;
    private String labels;

    private Map<String,Object> param = new HashMap<>();
    /** 初始化业务数据 */
    public int doStartTag() throws JspException {
        if(ObjectUtils.isEmpty(itemId)){
            itemId = tagName;
        }
        //业务数据
        if(items == null && begin == 0 && end == -1){
            if(type.equals("PC")){
                rawItems = initPC();
            }else{
                // rawItems = initMobile();
            }
        }
        //如果有带入数据，则优先
        if(items != null){
            rawItems = items;
        }
        return super.doStartTag();
    }

    /**
     * pc文章
     * @return
     */
    private List<BusiResource> initPC(){
        List<BusiResource> list = new ArrayList<BusiResource>();
        if(siteMenuId == null && categoryId == null && resourceId == null){
            return list;
        }
        try {
            IBusiResourceService busiResourceService = (IBusiResourceService)ApplicationContextHolder.getBean("busiResourceService");
            param.put("categoryId",categoryId);
            param.put("siteMenuId",siteMenuId);
            param.put("resourceId",resourceId);
            param.put("isIssue",1);
            param.put("isDel",0);
            if(isPage()){ //分页
                int pageNumber = ParamUtils.getIntParameter((HttpServletRequest) pageContext.getRequest(), "pageNumber", 1);
                PageBounds rowBounds = new PageBounds(pageNumber,getLimit());
                Page<BusiResource> page = busiResourceService.getPage(param, rowBounds);
                list = page.getResult();
                pageContext.getRequest().setAttribute("pagination",page.getPagination());
            }else{//列表
                param.put("limit",getLimit());
                list = busiResourceService.getList(param);
                if(resourceId != null){
                    if(ObjectUtils.isNotEmpty(list)){
                        pageContext.getRequest().setAttribute(itemId,list.get(0));
                    }
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
            param.put("categoryId",categoryId);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        if(resourceId != null && resourceId != 0L){
            this.resourceId = resourceId;
            param.put("id",resourceId);
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

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        param.put("labels",labels);
    }
}
