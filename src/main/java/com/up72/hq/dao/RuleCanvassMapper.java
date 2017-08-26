/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.RuleCanvassResp;
import com.up72.hq.model.RuleCanvass;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 角色拉票DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface RuleCanvassMapper {
	
	void insert(RuleCanvass entity);

    void update(RuleCanvass entity);
	
	void delete(java.lang.Long id);
	
    RuleCanvass findById(java.lang.Long id);

    PageList<RuleCanvassResp> findPage(Map params, PageBounds rowBounds);

    Long countNumber(Map params);

    List<RuleCanvassResp> orderByCanvassCntList();

}
