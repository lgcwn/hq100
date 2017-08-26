/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.QuizResp;
import com.up72.hq.model.Quiz;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 竞猜DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface QuizMapper {

    void insert(Quiz entity);

    void update(Quiz entity);

    void delete(java.lang.Long id);

    Quiz findById(java.lang.Long id);

    QuizResp findByIdResp(java.lang.Long id);

    PageList<QuizResp> findPage(Map params, PageBounds rowBounds);

    PageList<Quiz> findPages(Map params, PageBounds rowBounds);

    PageList<Quiz> findResp(Map params, PageBounds rowBounds);

    List<QuizResp> findListBy4(java.lang.Long type);

    List<QuizResp> findListByArenaId(java.lang.Long type);

    List<QuizResp> findHot();


}
