/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.OrderGoodsCommentResp;
import com.up72.hq.model.OrderGoodsComment;

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
public interface OrderGoodsCommentMapper {
	
	void insert(OrderGoodsComment entity);

    void update(OrderGoodsComment entity);
	
	void delete(java.lang.Long id);
	
    OrderGoodsComment findById(java.lang.Long id);

    PageList<OrderGoodsComment> findPage(Map params, PageBounds rowBounds);

    PageList<OrderGoodsCommentResp> findPageResp(Map params, PageBounds rowBounds);

    Integer findCommentNumber(Map map);
	
}
