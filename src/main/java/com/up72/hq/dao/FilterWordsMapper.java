/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.FilterWords;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 过滤词DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface FilterWordsMapper {
	
	void insert(FilterWords entity);

    void update(FilterWords entity);
	
	void delete(java.lang.Long id);
	
    FilterWords findById(java.lang.Long id);

    FilterWords findByWords(java.lang.String id);

    PageList<FilterWords> findPage(Map params, PageBounds rowBounds);

    List<FilterWords> findAll();
}
