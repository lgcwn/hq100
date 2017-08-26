package com.up72.busi.tag;

import com.up72.busi.dto.resp.BusiSiteMenuResp;
import com.up72.busi.service.IBusiSiteMenuService;
import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.framework.util.page.PageBounds;

import javax.servlet.jsp.JspException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiteMenuTag extends BaseTag{

    /**标签名称,如果"var"未启用的话，使用此变量*/
    private static final String tagName = "siteMenu";

    /** 业务字段*/
    private Long companyId;
    private Long siteMenuId;
    private Long parentId;
    private Integer isPc;
    private Integer isWap;

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
    private List<BusiSiteMenuResp> initItems(){
        List<BusiSiteMenuResp> list = new ArrayList<BusiSiteMenuResp>();
        if(companyId == null && siteMenuId == null && parentId == null){
            return list;
        }
        try {
            IBusiSiteMenuService busiSiteMenuService = (IBusiSiteMenuService)ApplicationContextHolder.getBean("busiSiteMenuService");
            param.put("isShow",1);
            param.put("isDel",0);
            param.put("limit",getLimit());
            list = busiSiteMenuService.getList(param, new PageBounds(Integer.MAX_VALUE));
            if(siteMenuId != null){
                if(ObjectUtils.isNotEmpty(list)){
                    pageContext.getRequest().setAttribute(itemId,list.get(0));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        if(companyId != null && companyId != 0L){
            this.companyId = companyId;
            param.put("companyId",companyId);
        }
    }

    public Long getSiteMenuId() {
        return siteMenuId;
    }

    public void setSiteMenuId(Long siteMenuId) {
        if(siteMenuId != null && siteMenuId != 0L){
            this.siteMenuId = siteMenuId;
            param.put("id",siteMenuId);
        }
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
        param.put("parentId",parentId);
    }

    public Integer getIsPc() {
        return isPc;
    }

    public void setIsPc(Integer isPc) {
        this.isPc = isPc;
        param.put("isPc",isPc);
    }

    public Integer getIsWap() {
        return isWap;
    }

    public void setIsWap(Integer isWap) {
        this.isWap = isWap;
        param.put("isWap",isWap);
    }
}
