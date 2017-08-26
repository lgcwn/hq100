/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.dao.BusiSiteTemplateFileBackupMapper;
import com.up72.busi.dao.BusiSiteTemplateFileMapper;
import com.up72.busi.dao.BusiSiteTemplateMapper;
import com.up72.busi.dto.resp.BusiSiteTemplateResp;
import com.up72.busi.model.BusiSiteTemplate;
import com.up72.busi.model.BusiSiteTemplateFile;
import com.up72.busi.model.BusiSiteTemplateFileBackup;
import com.up72.busi.service.IBusiSiteTemplateService;
import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章模板表DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteTemplateServiceImpl implements IBusiSiteTemplateService {
	
	@Autowired
	private BusiSiteTemplateMapper busiSiteTemplateMapper;
	@Autowired
	private BusiSiteTemplateFileMapper busiSiteTemplateFileMapper;
	@Autowired
	private BusiSiteTemplateFileBackupMapper busiSiteTemplateFileBackupMapper;

	public void save(BusiSiteTemplate busiSiteTemplate){
		busiSiteTemplateMapper.insert(busiSiteTemplate);
	}

    public void update(BusiSiteTemplate busiSiteTemplate){
		busiSiteTemplateMapper.update(busiSiteTemplate);
	}
	
    public void delete(Long id){
		busiSiteTemplateMapper.delete(id);
	}
    
    @Transactional(readOnly=true)
    public BusiSiteTemplate getById(Long id){
		return busiSiteTemplateMapper.findById(id);
	}
    @Transactional(readOnly=true)
    public BusiSiteTemplateResp getRespById(Long id){
		return busiSiteTemplateMapper.findRespById(id);
	}

	@Override
	public void backup(List<BusiSiteTemplateFile> fileList) {
		for (BusiSiteTemplateFile file : fileList) {
			BusiSiteTemplateFileBackup backup = new BusiSiteTemplateFileBackup();
			BeanUtils.copyProperties(file,backup);
			backup.setId(null);
			backup.setSiteTemplateFileId(file.getId());
			busiSiteTemplateFileBackupMapper.insert(backup);
			file.setBakCnt(file.getBakCnt() + 1);
			busiSiteTemplateFileMapper.update(file);
		}
	}

	@Transactional(readOnly=true)
    public Page<BusiSiteTemplate> getPage(Map params, PageBounds rowBounds){
		PageList list = busiSiteTemplateMapper.findPage(params, rowBounds);
		return new Page<>(list,list.getPagination());
	}

	@Override
	public Page<BusiSiteTemplateResp> getRespPage(Map params, PageBounds pageBounds) {
		PageList list = busiSiteTemplateMapper.findRespPage(params,pageBounds);
		return new Page<>(list,list.getPagination());
	}

	@Override
	public List<BusiSiteTemplateResp> getListByType(Integer type, Long companyId) {
		Map params = new HashMap();
		params.put("type",type);
		params.put("companyId",companyId);
		return this.busiSiteTemplateMapper.findListByType(params);
	}

	@Override
	public void copy(BusiSiteTemplateResp template) throws Exception{
		template.setId(null);
		busiSiteTemplateMapper.insert(template);
		List<BusiSiteTemplateFile> fileList = template.getFileList();
		if(ObjectUtils.isEmpty(fileList)) return;
		for (BusiSiteTemplateFile file : fileList) {
			file.setId(null);
			file.setSiteTemplateId(template.getId());
			file.setBakCnt(0);
			file.setCompanyId(template.getCompanyId());
			busiSiteTemplateFileMapper.insert(file);
		}
	}


}
