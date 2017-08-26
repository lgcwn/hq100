/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.model.BusiSiteTemplateFileBackup;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 文章模板文件备份记录DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteTemplateFileBackupMapper {
	
	void insert(BusiSiteTemplateFileBackup entity);

    void update(BusiSiteTemplateFileBackup entity);
	
	void delete(Long id);
	
    BusiSiteTemplateFileBackup findById(Long id);

    PageList<BusiSiteTemplateFileBackup> findPage(Map params, PageBounds rowBounds);


    List<BusiSiteTemplateFileBackup> findList(Map params);

    void deleteByCompanyId(Long companyId);
}
