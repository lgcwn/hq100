/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.Prod2Resp;
import com.up72.hq.dto.resp.ProdResp;
import com.up72.hq.model.Prod;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 产品DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ProdMapper {

    void insert(Prod entity);

    void update(Prod entity);

    void delete(Long id);

    Prod findById(Long id);

    PageList<Prod> findPage(Map params, PageBounds rowBounds);

    PageList<ProdResp> findRespPage(Map params, PageBounds rowBounds);

    PageList<ProdResp> findListByCatIdPath(Map params, PageBounds rowBounds);

    ProdResp findRespById(Long id);

    int cntResp2(Map params);

    Double findMinPriceById(Long id);

    Double findMaxPriceById(Long id);

    List<Prod2Resp> findResp2List(Map params);

    ProdResp findByGoodsId(Long goodsId);

    /**
     * 更新产品总评论数
     */
    public void updateCommentCount();

    /**
     * 更新产品库存
     * @param prodId
     */
    public void updateStock(Long prodId);

}
