/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.AttrResp;
import com.up72.hq.model.Attr;

import com.up72.framework.util.page.PageBounds;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 属性DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface AttrMapper {

    void insert(Attr entity);

    void update(Attr entity);

    void delete(Long id);

    Attr findById(Long id);

    PageList<Attr> findPage(Map params, PageBounds rowBounds);

    PageList<AttrResp> findRespPage(Map<String, Object> params, PageBounds rowBounds);

    AttrResp findRespById(Long id);

    int cntUsing(Long attrId);

    List<AttrResp> findListByCat(Map params);

    /**
     * 获取并排序
     * @param ids
     * @return
     */
    public List<Attr> findAndOrderByIds(@Param("ids") String ids);
	

}
