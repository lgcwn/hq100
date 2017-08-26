/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.QuizOrderResp;
import com.up72.hq.model.QuizOrder;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 竞猜订单DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface QuizOrderMapper {
	
	void insert(QuizOrder entity);

    void update(QuizOrder entity);
	
	void delete(java.lang.Long id);
	
    QuizOrder findById(java.lang.Long id);

    PageList<QuizOrder> findPage(Map params, PageBounds rowBounds);

    PageList<QuizOrderResp> findPageResp(Map params, PageBounds rowBounds);

    List<QuizOrderResp> findAll(Map params);

    List<QuizOrderResp> findListCount(Map params);

}
