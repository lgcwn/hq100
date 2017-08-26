/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.QuizSelect;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 竞猜选项DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface QuizSelectMapper {
	
	void insert(QuizSelect entity);

    void update(QuizSelect entity);
	
	void delete(java.lang.Long id);
	
    QuizSelect findById(java.lang.Long id);

    PageList<QuizSelect> findPage(Map params, PageBounds rowBounds);
	
    List<QuizSelect> findList(Map params);

    List<QuizSelect> findByQuestioIdLimit(java.lang.Long hqQuizQuestioId);

    List<QuizSelect> findByQuestioId(java.lang.Long hqQuizQuestioId);
}
