/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ChooseResp;
import com.up72.hq.model.Choose;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * (评选之最)DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ChooseMapper {

	void insert(Choose entity);

    void update(Choose entity);

	void delete(java.lang.Long id);

    ChooseResp findById(java.lang.Long id);

    PageList<ChooseResp> findPage(Map params, PageBounds rowBounds);


}
