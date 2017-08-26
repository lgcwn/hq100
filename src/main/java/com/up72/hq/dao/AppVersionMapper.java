/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.AppVersion;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 版本管理DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface AppVersionMapper {
	
	void insert(AppVersion entity);

    void update(AppVersion entity);
	
	void delete(java.lang.Long id);
	
    AppVersion findById(java.lang.Long id);

    PageList<AppVersion> findPage(Map params, PageBounds rowBounds);

    AppVersion findLastestVersionByType(Integer type);
	

}
