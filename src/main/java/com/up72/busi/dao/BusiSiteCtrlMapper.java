/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiSiteCtrlResp;
import com.up72.busi.model.BusiSiteCtrl;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 站点控件DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteCtrlMapper {
	
	void insert(BusiSiteCtrl entity);

    void update(BusiSiteCtrl entity);
	
	void delete(Long id);
	
    BusiSiteCtrl findById(Long id);

    PageList<BusiSiteCtrl> findPage(Map params, PageBounds rowBounds);

    List<BusiSiteCtrlResp> findAll();

    List<BusiSiteCtrlResp> findBySiteMenuId(Long siteMenuId);
}
