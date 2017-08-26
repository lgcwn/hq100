/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiSiteMenuBackupResp;
import com.up72.busi.model.BusiSiteMenuBackup;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;

/**
 * 站点菜单单页模板备份记录接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteMenuBackupService {
	
	void save(BusiSiteMenuBackup busiSiteMenuBackup);

    void update(BusiSiteMenuBackup busiSiteMenuBackup);
	
	void delete(Long id);
	
    BusiSiteMenuBackup getById(Long id);

    Page<BusiSiteMenuBackup> getPage(Map params, PageBounds rowBounds);
	
    List<BusiSiteMenuBackupResp> getList(Map params);
}
