/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.QuizQuestioResp;
import com.up72.hq.model.QuizQuestio;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 竞猜问题DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface QuizQuestioMapper {
	
	void insert(QuizQuestio entity);

    void update(QuizQuestio entity);
	
	void delete(java.lang.Long id);
	
    QuizQuestio findById(java.lang.Long id);

    QuizQuestioResp findByIdResp(java.lang.Long id);

    PageList<QuizQuestioResp> findPage(Map params, PageBounds rowBounds);

    List<QuizQuestio> findByQuizId(java.lang.Long quizId);

    List<QuizQuestioResp> findByQuizIdResp(java.lang.Long quizId);

}
