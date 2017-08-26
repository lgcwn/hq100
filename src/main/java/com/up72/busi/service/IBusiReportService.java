/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiReportInfoResp;
import com.up72.busi.dto.resp.BusiReportResp;
import com.up72.busi.model.BusiReport;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 统计报告接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiReportService {
	
	void save(BusiReport busiReport);

    void update(BusiReport busiReport);
	
	void delete(Long id);

    BusiReport getById(Long id);

    Page<BusiReport> getPage(Map params, PageBounds rowBounds);

    List<BusiReportResp> getRespList(Map params);

    BusiReportInfoResp getReportInfo(Long siteMenuId);

    void updateTodayReport(Long siteMenuId);

    void updateYesterdayReport();
}
