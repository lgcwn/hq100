/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.model.BusiIssueSet;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.Map;


/**
 * 发布配置接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiIssueSetService {
	
	void save(BusiIssueSet busiIssueSet);

    void update(BusiIssueSet busiIssueSet);
	
	void delete(Long id);

    BusiIssueSet getById(Long id);

    Page<BusiIssueSet> getPage(Map params, PageBounds rowBounds);

    BusiIssueSet getByCompanyIdSiteMenuId(Map params);

    void autoIssue(Long siteMenuId);

    void setIssueSetScheduleJob(BusiIssueSet busiIssueSet) throws Exception;
}
