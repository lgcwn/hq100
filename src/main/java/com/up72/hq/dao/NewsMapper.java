/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.NewsResp;
import com.up72.hq.model.News;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 资讯DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface NewsMapper {
	
	void insert(News entity);

    void update(News entity);
	
	void delete(java.lang.Long id);
	
    News findById(java.lang.Long id);

    NewsResp findByIdResp(java.lang.Long id);

    PageList<NewsResp> findPage(Map params, PageBounds rowBounds);

    PageList<NewsResp> findPageTour(Map params, PageBounds rowBounds);


}
