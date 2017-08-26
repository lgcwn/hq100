/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.OrderPayLog;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 支付记录DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface OrderPayLogMapper {
	
	void insert(OrderPayLog entity);

    void update(OrderPayLog entity);
	
	void delete(java.lang.Long id);
	
    OrderPayLog findById(java.lang.Long id);

    PageList<OrderPayLog> findPage(Map params, PageBounds rowBounds);
	

}
