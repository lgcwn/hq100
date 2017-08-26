/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.CrowdOrderResp;
import com.up72.hq.model.CrowdOrder;

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
public interface CrowdOrderMapper {

    void insert(CrowdOrder entity);

    void update(CrowdOrder entity);

    void delete(Long id);

    CrowdOrderResp findById(Long id);

    CrowdOrder findId(Long id);

    CrowdOrderResp findByIdCrowd(Long id);

    PageList<CrowdOrder> findPage(Map params, PageBounds rowBounds);

    PageList<CrowdOrderResp> findByCrowdPage(Map params, PageBounds rowBounds);

    CrowdOrder findByTradeNo(Map params);


    CrowdOrderResp findBySn(String sn);
    CrowdOrder findBySn1(String sn);

    /**
     * 扩展Resp
     * @author haiyi
     * @param params
     * @param rowBounds
     * @return
     */
    PageList<CrowdOrderResp> findPageResp(Map params, PageBounds rowBounds);

    /**
     * 扩展Resp
     * @author zhangdongdong
     * @param entity
     * @return
     */
    List<CrowdOrderResp> findOrderLists(CrowdOrder entity);

    /**
     * 查询个状态下的订单数量
     * @return
     */
    List<CrowdOrderResp> findOrderStatusSize(CrowdOrder entity);


    /**
     * 获取已过期的订单
     * @param time
     * @return
     */
    public List<CrowdOrder> findExpiredOrder(Map time);

    /**
     * SQL修改过期订单为取消
     * @param params
     */
    public void updateExpireOrder(Map params);


    List<CrowdOrderResp> getOrderStatusCount(Map map);

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
    List<CrowdOrder> findnewOrder(CrowdOrder Order);

    /**
     * 获取退款拒收订单
     */
    PageList<CrowdOrderResp> findCanCelOrder(Map params, PageBounds rowBounds);

    /**
     * 订单自动确认收货
     * @param now
     */
    public void autoConfirmReceived(Map now);

    Long findOrderCnt(Map params);

    /**
     * 获取用户公益订单
     */
    List<CrowdOrderResp> findByCrowd(Long memberId);

}
