/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.AdvertisingInfo;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 广告信息DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface AdvertisingInfoMapper {
	
	void insert(AdvertisingInfo entity);

    void update(AdvertisingInfo entity);
	
	void delete(java.lang.Long id);
	
    AdvertisingInfo findById(java.lang.Long id);

    PageList<AdvertisingInfo> findPage(Map params, PageBounds rowBounds);

    List<AdvertisingInfo> findListByColumns(Map params);

}
