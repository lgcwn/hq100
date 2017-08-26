/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.Keyword;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 搜索关键字DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface KeywordMapper {

	void insert(Keyword entity);

    void update(Keyword entity);

	void delete(Long id);

    Keyword findById(Long id);

    PageList<Keyword> findPage(Map params, PageBounds rowBounds);

	Keyword findByKeyword(String keyword);

}
