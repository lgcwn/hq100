/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.OrderRefundLog;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface OrderRefundLogMapper {
	
	void insert(OrderRefundLog entity);

    void update(OrderRefundLog entity);
	
	void delete(java.lang.Long id);
	
    OrderRefundLog findById(java.lang.Long id);

    PageList<OrderRefundLog> findPage(Map params, PageBounds rowBounds);

    OrderRefundLog findByRefundId(Long refundId);

    OrderRefundLog findByRefundTradeNo(String refundTradeNo);


}
