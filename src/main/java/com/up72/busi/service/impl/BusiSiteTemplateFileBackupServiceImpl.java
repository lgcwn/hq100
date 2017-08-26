/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.dao.BusiSiteTemplateFileBackupMapper;
import com.up72.busi.model.BusiSiteTemplateFileBackup;
import com.up72.busi.service.IBusiSiteTemplateFileBackupService;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 文章模板文件备份记录DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteTemplateFileBackupServiceImpl implements  IBusiSiteTemplateFileBackupService{
	
	@Autowired
	private BusiSiteTemplateFileBackupMapper busiSiteTemplateFileBackupMapper;
	
	public void save(BusiSiteTemplateFileBackup busiSiteTemplateFileBackup){
		busiSiteTemplateFileBackupMapper.insert(busiSiteTemplateFileBackup);
	}

    public void update(BusiSiteTemplateFileBackup busiSiteTemplateFileBackup){
		busiSiteTemplateFileBackupMapper.update(busiSiteTemplateFileBackup);
	}
	
    public void delete(Long id){
		busiSiteTemplateFileBackupMapper.delete(id);
	}
    
    @Transactional(readOnly=true)
    public BusiSiteTemplateFileBackup getById(Long id){
		return busiSiteTemplateFileBackupMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiSiteTemplateFileBackup> getPage(Map params, PageBounds rowBounds){
		PageList list = busiSiteTemplateFileBackupMapper.findPage(params, rowBounds);
		return new Page<>(list,list.getPagination());
	}

	@Override
	public List<BusiSiteTemplateFileBackup> getList(Map params) {
		return busiSiteTemplateFileBackupMapper.findList(params);
	}


}
