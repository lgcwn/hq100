/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.Goods2Resp;
import com.up72.hq.dto.resp.Goods3Resp;
import com.up72.hq.dto.resp.GoodsResp;
import com.up72.hq.model.Goods;

import com.up72.framework.util.page.PageBounds;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 商品DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface GoodsMapper {

    void insert(Goods entity);

    void update(Goods entity);

    void delete(Long id);

    GoodsResp findById(Long id);

    PageList<GoodsResp> findPage(Map params, PageBounds rowBounds);

    PageList<GoodsResp> getListByCatIdPath(Map params, PageBounds rowBounds);

    List<Goods> findList(Map params);

    Integer findStockById(Long id);
    Integer findSalesById(Long id);

    void updateStock(@Param(value = "stock") Integer stock, @Param(value = "id") Long id, @Param(value = "editTime") Date editTime);
    void updateSales(@Param(value = "sales") Integer stock, @Param(value = "id") Long id, @Param(value = "editTime") Date editTime);

    List<GoodsResp> findListByProdId(Long prodId);

    void deleteByProdId(Long prodId);

    Goods2Resp findResp2ById(Long id);

    void updateIsMarketable(Map params);

    PageList<GoodsResp> findRespPage(Map params, PageBounds rowBounds);

    PageList<Goods> findHomePage(Map params, PageBounds rowBounds);

    PageList<Goods3Resp> findResp3Page(Map params, PageBounds rowBounds);

    List<Goods> getListByGoodsIds(Map params);

    List<Goods> findTop10OfToday(Map params);

    List<GoodsResp> findListByCatId(Long catId);

    List<GoodsResp> findByProdId(Map map);

    String findGoodsIdsByProdId(Long prodId);

    GoodsResp findRespById(Long id);

    Long findMinSort(Long catId);

    PageList<GoodsResp> findMemberFavouriteList(Map map, PageBounds rowBounds);

    PageList<GoodsResp> findRecommendGoodsPage(Map map, PageBounds rowBounds);

    List<Goods> findListByGoodsName(@Param("fullName") String fullName);

    List<GoodsResp> findGoodsErrorPage(Goods goods);
	

}
