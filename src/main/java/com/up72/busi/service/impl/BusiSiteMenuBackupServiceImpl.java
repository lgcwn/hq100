/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.dao.BusiSiteMenuBackupMapper;
import com.up72.busi.dto.resp.BusiSiteMenuBackupResp;
import com.up72.busi.model.BusiSiteMenuBackup;
import com.up72.busi.service.IBusiSiteMenuBackupService;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 站点菜单单页模板备份记录DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteMenuBackupServiceImpl implements IBusiSiteMenuBackupService {
	
	@Autowired
	private BusiSiteMenuBackupMapper busiSiteMenuBackupMapper;
	
	public void save(BusiSiteMenuBackup busiSiteMenuBackup){
		busiSiteMenuBackupMapper.insert(busiSiteMenuBackup);
	}

    public void update(BusiSiteMenuBackup busiSiteMenuBackup){
		busiSiteMenuBackupMapper.update(busiSiteMenuBackup);
	}
	
    public void delete(Long id){
		busiSiteMenuBackupMapper.delete(id);
	}
    
    @Transactional(readOnly=true)
    public BusiSiteMenuBackup getById(Long id){
		return busiSiteMenuBackupMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiSiteMenuBackup> getPage(Map params, PageBounds rowBounds){
		PageList list = busiSiteMenuBackupMapper.findPage(params, rowBounds);
		return new Page<>(list,list.getPagination());
	}

	@Override
	@Transactional(readOnly = true)
	public List<BusiSiteMenuBackupResp> getList(Map params) {
		return busiSiteMenuBackupMapper.findList(params);
	}
}
