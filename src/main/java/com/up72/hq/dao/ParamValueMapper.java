/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.ParamValue;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 参数值DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ParamValueMapper {

    void insert(ParamValue entity);

    void update(ParamValue entity);

    void delete(Long id);

    ParamValue findById(Long id);

    PageList<ParamValue> findPage(Map params, PageBounds rowBounds);

    List<ParamValue> findListByParamId(Long paramId);

    void deleteByParamId(Long paramId);

    int cntUsing(Long paramValueId);
	

}
