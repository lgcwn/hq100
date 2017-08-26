/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ReplyResp;
import com.up72.hq.model.Reply;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 回复表DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ReplyMapper {
	
	void insert(Reply entity);

    void update(Reply entity);
	
	void delete(java.lang.Long id);
	
    Reply findById(java.lang.Long id);

    ReplyResp findByIdResp(java.lang.Long id);

    ReplyResp findByReviewId(java.lang.Long reviewId);

    PageList<ReplyResp> findPage(Map params, PageBounds rowBounds);
	

}
