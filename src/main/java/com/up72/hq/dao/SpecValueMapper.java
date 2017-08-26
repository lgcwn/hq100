/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.SpecValue;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 规格值DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface SpecValueMapper {

    void insert(SpecValue entity);

    void update(SpecValue entity);

    void delete(Long id);

    SpecValue findById(Long id);

    PageList<SpecValue> findPage(Map params, PageBounds rowBounds);

    void deleteByCatId(Long catId);

    int cntUsing(Long specValueId);

    List<SpecValue> findListBySpecId(Long specId);

    List<SpecValue> findListByProdIdAndSpecId(Map params);
	

}
