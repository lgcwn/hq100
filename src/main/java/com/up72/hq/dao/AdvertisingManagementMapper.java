/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.AdvertisingManagementResp;
import com.up72.hq.model.AdvertisingManagement;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 广告位管理DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface AdvertisingManagementMapper {
	
	void insert(AdvertisingManagement entity);

    void update(AdvertisingManagement entity);
	
	void delete(java.lang.Long id);
	
    AdvertisingManagement findById(java.lang.Long id);

    PageList<AdvertisingManagement> findPage(Map params, PageBounds rowBounds);

    PageList<AdvertisingManagementResp> findRespPage(Map params, PageBounds rowBounds);
	

}
