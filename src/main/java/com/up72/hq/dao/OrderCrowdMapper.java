/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.OrderCrowdResp;
import com.up72.hq.model.OrderCrowd;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 众筹商品DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface OrderCrowdMapper {
	
	void insert(OrderCrowd entity);

    void update(OrderCrowd entity);
	
	void delete(java.lang.Long id);
	
    OrderCrowd findById(java.lang.Long id);

    OrderCrowdResp findByOrderId(java.lang.Long orderId);

    PageList<OrderCrowd> findPage(Map params, PageBounds rowBounds);

    PageList<OrderCrowdResp> findPageResp(Map params, PageBounds rowBounds);


}
