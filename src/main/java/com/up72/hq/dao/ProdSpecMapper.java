/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ProdSpecResp;
import com.up72.hq.model.ProdSpec;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 产品规格中间表DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ProdSpecMapper {

    void insert(ProdSpec entity);

    void update(ProdSpec entity);

    void delete(Long id);

    ProdSpec findById(Long id);

    ProdSpecResp findByParams(Map map);

    PageList<ProdSpec> findPage(Map params, PageBounds rowBounds);

    List<ProdSpec> findListByGoodsId(Long goodsId);

    List<ProdSpecResp> findListByProdId(Long prodId);

    void deleteByGoodsId(Long goodsId);

    void deleteByProdId(Long prodId);

    String findSpecValueIdsByGoodsId(Map params);

    List<ProdSpecResp> findColorListByProdId(Map map);
	

}
