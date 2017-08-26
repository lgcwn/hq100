/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.Report;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ReportMapper {
	
	void insert(Report entity);

    void update(Report entity);
	
	void delete(java.lang.Long id);
	
    Report findById(java.lang.Long id);

    PageList<Report> findPage(Map params, PageBounds rowBounds);
	

}
