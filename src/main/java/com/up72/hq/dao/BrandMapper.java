/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.Brand;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 品牌表DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BrandMapper {
	
	void insert(Brand entity);

    void update(Brand entity);
	
	void delete(java.lang.Long id);
	
    Brand findById(java.lang.Long id);

    PageList<Brand> findPage(Map params, PageBounds rowBounds);
	

}
