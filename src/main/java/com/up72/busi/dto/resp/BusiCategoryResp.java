/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.resp;

import com.up72.busi.model.BusiCategory;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.model.BusiSiteTemplateFile;


/**
 * 类别输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiCategoryResp  extends  BusiCategory{
    private Long countSize;

    public Long getCountSize() {
        return countSize;
    }

    public void setCountSize(Long countSize) {
        this.countSize = countSize;
    }

    private BusiSiteTemplateFile tmplIndex;
    private BusiSiteTemplateFile tmplList;
    private BusiSiteTemplateFile tmplDetail;

    private BusiSiteTemplateFile tmplIndexWap;
    private BusiSiteTemplateFile tmplListWap;
    private BusiSiteTemplateFile tmplDetailWap;

    private BusiSiteMenu busiSiteMenu;

    public BusiSiteTemplateFile getTmplIndex() {
        return tmplIndex;
    }

    public void setTmplIndex(BusiSiteTemplateFile tmplIndex) {
        this.tmplIndex = tmplIndex;
    }

    public BusiSiteTemplateFile getTmplList() {
        return tmplList;
    }

    public void setTmplList(BusiSiteTemplateFile tmplList) {
        this.tmplList = tmplList;
    }

    public BusiSiteTemplateFile getTmplDetail() {
        return tmplDetail;
    }

    public void setTmplDetail(BusiSiteTemplateFile tmplDetail) {
        this.tmplDetail = tmplDetail;
    }

    public BusiSiteTemplateFile getTmplIndexWap() {
        return tmplIndexWap;
    }

    public void setTmplIndexWap(BusiSiteTemplateFile tmplIndexWap) {
        this.tmplIndexWap = tmplIndexWap;
    }

    public BusiSiteTemplateFile getTmplListWap() {
        return tmplListWap;
    }

    public void setTmplListWap(BusiSiteTemplateFile tmplListWap) {
        this.tmplListWap = tmplListWap;
    }

    public BusiSiteTemplateFile getTmplDetailWap() {
        return tmplDetailWap;
    }

    public void setTmplDetailWap(BusiSiteTemplateFile tmplDetailWap) {
        this.tmplDetailWap = tmplDetailWap;
    }

    public BusiSiteMenu getBusiSiteMenu() {
        return busiSiteMenu;
    }

    public void setBusiSiteMenu(BusiSiteMenu busiSiteMenu) {
        this.busiSiteMenu = busiSiteMenu;
    }
}