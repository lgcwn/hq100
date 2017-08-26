/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.AttrValue;

import com.up72.framework.util.page.PageBounds;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 属性值DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface AttrValueMapper {
    void insert(AttrValue entity);

    void update(AttrValue entity);

    void delete(Long id);

    AttrValue findById(Long id);

    PageList<AttrValue> findPage(Map params, PageBounds rowBounds);

    List<AttrValue> findListByAttrId(Long attrId);

    void deleteByAttrId(Long attrId);

    int cntUsing(Long attrValueId);

    /**
     * 根据ids查找并排序
     * @param ids
     * @return
     */
    public List<AttrValue> findAndOrderByIds(@Param("ids") String ids);
	

}
