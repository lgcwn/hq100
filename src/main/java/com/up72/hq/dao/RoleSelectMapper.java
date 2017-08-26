/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.RoleSelectResp;
import com.up72.hq.model.RoleSelect;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 角色选拔DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface RoleSelectMapper {
	
	void insert(RoleSelect entity);

    void update(RoleSelect entity);
	
	void delete(java.lang.Long id);

    RoleSelectResp findById(java.lang.Long id);

    PageList<RoleSelectResp> findPage(Map params, PageBounds rowBounds);
	

}
