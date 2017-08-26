/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.TagResp;
import com.up72.hq.model.Tag;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 标签DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface TagMapper {

    void insert(Tag entity);

    void update(Tag entity);

    void delete(Long id);

    Tag findById(Long id);

    PageList<Tag> findPage(Map params, PageBounds rowBounds);

    PageList<TagResp> findRespPage(Map params, PageBounds rowBounds);

    int cntUsing(Map params);

    TagResp findRespById(Long id);

    List<Tag> findListByCat(Map params);
	

}
