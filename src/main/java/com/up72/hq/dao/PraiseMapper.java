/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.Praise;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 我的点赞DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface PraiseMapper {
	
	void insert(Praise entity);

    void update(Praise entity);
	
	void delete(java.lang.Long id);
	
    Praise findById(java.lang.Long id);
    Praise findByParam(Map map);


    PageList<Praise> findPage(Map params, PageBounds rowBounds);
	

}
