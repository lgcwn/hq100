/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ParamResp;
import com.up72.hq.model.Param;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 参数DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ParamMapper {

    void insert(Param entity);

    void update(Param entity);

    void delete(Long id);

    Param findById(Long id);

    PageList<Param> findPage(Map params, PageBounds rowBounds);


    PageList<ParamResp> findRespPage(Map<String, Object> params, PageBounds pageBounds);

    ParamResp findRespById(Long id);

    int cntUsing(Long paramId);

    List<ParamResp> findListByCat(Map params);
	

}
