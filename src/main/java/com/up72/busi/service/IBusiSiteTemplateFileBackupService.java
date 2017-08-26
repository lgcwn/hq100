/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.model.BusiSiteTemplateFileBackup;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 文章模板文件备份记录接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteTemplateFileBackupService {
	
	void save(BusiSiteTemplateFileBackup busiSiteTemplateFileBackup);

    void update(BusiSiteTemplateFileBackup busiSiteTemplateFileBackup);
	
	void delete(Long id);
	
    BusiSiteTemplateFileBackup getById(Long id);

    Page<BusiSiteTemplateFileBackup> getPage(Map params, PageBounds rowBounds);

    List<BusiSiteTemplateFileBackup> getList(Map params);

}
