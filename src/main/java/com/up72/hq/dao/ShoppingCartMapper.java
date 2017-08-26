/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ShoppingCartResp;
import com.up72.hq.model.ShoppingCart;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 购物车DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ShoppingCartMapper {
	
	void insert(ShoppingCart entity);

    void update(ShoppingCart entity);
	
	void delete(java.lang.Long id);
	
    ShoppingCart findById(java.lang.Long id);

    PageList<ShoppingCart> findPage(Map params, PageBounds rowBounds);

    ShoppingCart findByShopping(ShoppingCart entity);

    /**
     *
     * 根据用户查询可用的购物车商品
     *
     * @param userId
     * @return
     */
    List<ShoppingCartResp> findByUserId(Long userId);

    /**
     *
     * 根据商品id user id查询
     *
     * @param map
     * @return
     */
    ShoppingCart findByGoodsId(Map map);

    /**
     *
     * 根据用户id查询购物车数量
     *
     * @param memberId
     * @return
     */
    Integer countShoppingCartByUserId(Long memberId);
	

}
