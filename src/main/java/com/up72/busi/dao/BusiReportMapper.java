/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiReportInfoResp;
import com.up72.busi.dto.resp.BusiReportResp;
import com.up72.busi.model.BusiReport;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 统计报告DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiReportMapper {
	
	void insert(BusiReport entity);

    void update(BusiReport entity);
	
	void delete(Long id);

    BusiReport findById(Long id);

    PageList<BusiReport> findPage(Map params, PageBounds rowBounds);

    BusiReport findByUnique(Map params);

    void pcInsertByDate(Map params);

    void pcUpdateByDate(Map params);

    void wapInsertByDate(Map params);

    void wapUpdateByDate(Map params);

    List<BusiReportResp> findRespList(Map params);

    BusiReportInfoResp findReportInfo(Long siteMenuId);

    void deleteByCompanyId(Long companyId);
}
