/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.CatBrand;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 品牌分类关系DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface CatBrandMapper {
	
	void insert(CatBrand entity);

    void update(CatBrand entity);
	
	void delete(java.lang.Long id);
	
    CatBrand findById(java.lang.Long id);

    PageList<CatBrand> findPage(Map params, PageBounds rowBounds);
	

}
