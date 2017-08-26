/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.ProdParam;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 产品参数中间表DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ProdParamMapper {
	
	void insert(ProdParam entity);

    void update(ProdParam entity);
	
	void delete(java.lang.Long id);
	
    ProdParam findById(java.lang.Long id);

    PageList<ProdParam> findPage(Map params, PageBounds rowBounds);

    List<ProdParam> findListByProdId(Long prodId);

    void deleteByProdId(Long prodId);
	

}