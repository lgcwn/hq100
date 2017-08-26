/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.RuleManagerOrderResp;
import com.up72.hq.model.RuleManagerOrder;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 角色报名订单DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface RuleManagerOrderMapper {
	
	void insert(RuleManagerOrder entity);

    void update(RuleManagerOrder entity);
	
	void delete(java.lang.Long id);

    void deleteByRoleSelectId(java.lang.Long roleSelectId);

    RuleManagerOrderResp findById(java.lang.Long id);

    PageList<RuleManagerOrderResp> findPage(Map params, PageBounds rowBounds);

    Long countNumber(Map params);

    List<RuleManagerOrderResp> findListByRoleSelectId(Long roleSelectId);

    List<RuleManagerOrderResp> findListByRoleManagerId(Long roleManagerId);

    RuleManagerOrder findBySn(String sn);

    Integer countSignUp(Map params);


}
