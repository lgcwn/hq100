/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.OrderGoodsResp;
import com.up72.hq.model.OrderGoods;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 订单商品DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface OrderGoodsMapper {

    void insert(OrderGoods entity);

    void update(OrderGoods entity);

    void delete(Long id);

    OrderGoods findById(Long id);

    OrderGoodsResp findRespById(Long id);

    PageList<OrderGoodsResp> findPage(Map params, PageBounds rowBounds);

    /**
     *
     * 根据订单id查询
     *
     * @author liuguicheng
     * @param id
     * @return
     */
    List<OrderGoods> findByOrderId(Long id);

    /**
     * 根据用户查询评价商品
     *
     * @author haiyi
     * @param params
     * @param rowBounds
     * @return
     */
    PageList<OrderGoodsResp> findCommentResp(Map params, PageBounds rowBounds);

    List<OrderGoods> findOrderGoodsList(OrderGoods entity);
}
