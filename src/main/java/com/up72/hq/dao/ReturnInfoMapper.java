/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ReturnInfoResp;
import com.up72.hq.model.ReturnInfo;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 回报信息DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ReturnInfoMapper {
	
	void insert(ReturnInfo entity);

    void update(ReturnInfo entity);
	
	void delete(java.lang.Long id);

	void deleteByCrowdId(java.lang.Long id);

    ReturnInfo findById(java.lang.Long id);

    List<ReturnInfoResp> findByCrowdId(java.lang.Long crowdId);

    PageList<ReturnInfo> findPage(Map params, PageBounds rowBounds);
	

}
