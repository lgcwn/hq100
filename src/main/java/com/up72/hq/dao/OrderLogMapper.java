/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.OrderLog;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 订单操作日志DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface OrderLogMapper {
	
	void insert(OrderLog entity);

    void update(OrderLog entity);
	
	void delete(java.lang.Long id);
	
    OrderLog findById(java.lang.Long id);

    PageList<OrderLog> findPage(Map params, PageBounds rowBounds);
	

}
