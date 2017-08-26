/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.ExchangePoints;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 人名币兑换积分DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ExchangePointsMapper {
	
	void insert(ExchangePoints entity);

    void update(ExchangePoints entity);
	
	void delete(java.lang.Long id);
	
    ExchangePoints findById(java.lang.Long id);

    PageList<ExchangePoints> findPage(Map params, PageBounds rowBounds);
	

}
