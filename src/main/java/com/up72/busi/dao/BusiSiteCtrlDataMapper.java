/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.model.BusiSiteCtrlData;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 站点控件数据DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteCtrlDataMapper {
	
	void insert(BusiSiteCtrlData entity);

    void update(BusiSiteCtrlData entity);
	
	void delete(Long id);
	
    BusiSiteCtrlData findById(Long id);

    PageList<BusiSiteCtrlData> findPage(Map params, PageBounds rowBounds);

    List<BusiSiteCtrlData> findListByCtrlId(Long ctrlId);
}
