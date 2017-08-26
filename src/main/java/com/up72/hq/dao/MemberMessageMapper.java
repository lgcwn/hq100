/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.MemberMessageResp;
import com.up72.hq.model.MemberMessage;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 用户消息DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface MemberMessageMapper {
	
	void insert(MemberMessage entity);

    void update(MemberMessage entity);
	
	void delete(java.lang.Long id);
	
    MemberMessage findById(java.lang.Long id);

    MemberMessageResp findByIdResp(java.lang.Long id);

    PageList<MemberMessageResp> findPage(Map params, PageBounds rowBounds);
    //获取用户消息信息
    MemberMessageResp findByMemberId(java.lang.Long memberId);
}
