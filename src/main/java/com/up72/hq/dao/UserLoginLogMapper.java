/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.UserLoginLog;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 用户登录日志DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface UserLoginLogMapper {
	
	void insert(UserLoginLog entity);

    void update(UserLoginLog entity);
	
	void delete(java.lang.Long id);
	
    UserLoginLog findById(java.lang.Long id);

    PageList<UserLoginLog> findPage(Map params, PageBounds rowBounds);

    UserLoginLog  findLastLoginLog(Long memberId);
	

}
