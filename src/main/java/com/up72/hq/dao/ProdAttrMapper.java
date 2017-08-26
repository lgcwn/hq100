/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ProdAttrResp;
import com.up72.hq.model.ProdAttr;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 产品属性中间表DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ProdAttrMapper {
	
	void insert(ProdAttr entity);

    void update(ProdAttr entity);
	
	void delete(java.lang.Long id);
	
    ProdAttr findById(java.lang.Long id);

    List<ProdAttrResp> findByAttrIdValId(Map map);

    PageList<ProdAttr> findPage(Map params, PageBounds rowBounds);

    List<ProdAttr> findListByProdId(Long prodId);

    void deleteByProdId(Long prodId);
	

}
