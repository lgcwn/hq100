/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.OrderResp;
import com.up72.hq.model.Order;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 订单DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface OrderMapper {

    void insert(Order entity);

    void update(Order entity);

    void delete(Long id);

    OrderResp findById(Long id);

    Order findId(Long id);

    OrderResp findByIdCrowd(Long id);

    PageList<Order> findPage(Map params, PageBounds rowBounds);

    PageList<OrderResp> findByCrowdPage(Map params, PageBounds rowBounds);

    Order findByTradeNo(Map params);


    OrderResp findBySn(String sn);

    /**
     * 扩展Resp
     * @author haiyi
     * @param params
     * @param rowBounds
     * @return
     */
    PageList<OrderResp> findPageResp(Map params, PageBounds rowBounds);

    /**
     * 扩展Resp
     * @author zhangdongdong
     * @param entity
     * @return
     */
    List<OrderResp> findOrderLists(Order entity);

    /**
     * 查询个状态下的订单数量
     * @return
     */
    List<OrderResp> findOrderStatusSize(Order entity);


    /**
     * 获取已过期的订单
     * @param time
     * @return
     */
    public List<Order> findExpiredOrder(Map time);

    /**
     * SQL修改过期订单为取消
     * @param params
     */
    public void updateExpireOrder(Map params);


    List<OrderResp> getOrderStatusCount(Map map);

    /**
     *
     * 查询当日并且状态为待付款的订单
     *
     * @param map
     * @return
     */
    Integer getNewOrderCount(Map map);

    /**
     *
     * 查询未评价订单数量
     *
     * @param map
     * @return
     */
    Integer getOrderNotEvaluatedCount(Map map);

    /**
     * 获取最新订单
     */
    List<Order> findnewOrder(Order Order);

    /**
     * 获取退款拒收订单
     */
    PageList<OrderResp> findCanCelOrder(Map params, PageBounds rowBounds);

    /**
     * 订单自动确认收货
     * @param now
     */
    public void autoConfirmReceived(Map now);

    Long findOrderCnt(Map params);

    /**
     * 获取用户公益订单
     */
    List<OrderResp> findByCrowd(Long memberId);

}
