/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.Menu;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 平台菜单配置DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface MenuMapper {
	
	void insert(Menu entity);

    void update(Menu entity);
	
	void delete(java.lang.Long id);
	
    Menu findById(java.lang.Long id);

    PageList<Menu> findPage(Map params, PageBounds rowBounds);
	

}
