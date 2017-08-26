/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.RoleManagerResp;
import com.up72.hq.model.RoleManager;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 角色管理DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface RoleManagerMapper {
	
	void insert(RoleManager entity);

    void update(RoleManager entity);
	
	void delete(java.lang.Long id);

    void deleteByRoleSelectId(java.lang.Long roleSelectId);

    RoleManagerResp findById(java.lang.Long id);

    RoleManager findId(java.lang.Long id);

    PageList<RoleManagerResp> findPage(Map params, PageBounds rowBounds);
	

}
