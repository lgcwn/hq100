/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.CrowdResp;
import com.up72.hq.model.Crowd;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 众筹DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface CrowdMapper {
	
	void insert(Crowd entity);

    void update(Crowd entity);
	
	void delete(java.lang.Long id);
	
    Crowd findById(java.lang.Long id);
    CrowdResp findRespById(java.lang.Long id);

    PageList<CrowdResp> findPage(Map params, PageBounds rowBounds);

    List<CrowdResp> findList3(java.lang.Long catId);

    List<CrowdResp> findHome();

    List<CrowdResp> findHotList(java.lang.Long catId);

}
