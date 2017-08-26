/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiSiteMenuBackupResp;
import com.up72.busi.model.BusiSiteMenuBackup;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 站点菜单单页模板备份记录DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteMenuBackupMapper {
	
	void insert(BusiSiteMenuBackup entity);

    void update(BusiSiteMenuBackup entity);
	
	void delete(Long id);
	
    BusiSiteMenuBackup findById(Long id);

    PageList<BusiSiteMenuBackup> findPage(Map params, PageBounds rowBounds);

    PageList<BusiSiteMenuBackupResp> findList(Map params);


}
