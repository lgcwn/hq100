/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ProjectProgressResp;
import com.up72.hq.model.ProjectProgress;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 众筹项目进展DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ProjectProgressMapper {
	
	void insert(ProjectProgress entity);

    void update(ProjectProgress entity);
	
	void delete(java.lang.Long id);
	void deleteByCrowdId(java.lang.Long id);

    ProjectProgress findId(java.lang.Long id);

    ProjectProgressResp findById(java.lang.Long id);

    List<ProjectProgressResp> findByCrowdId(java.lang.Long crowdId);

    PageList<ProjectProgressResp> findPage(Map params, PageBounds rowBounds);
	

}
