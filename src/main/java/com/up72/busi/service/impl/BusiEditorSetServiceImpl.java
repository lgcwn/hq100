/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.dao.BusiEditorSetMapper;
import com.up72.busi.model.BusiEditorSet;
import com.up72.busi.service.IBusiEditorSetService;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 编辑器设置DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiEditorSetServiceImpl implements IBusiEditorSetService {
	
	@Autowired
	private BusiEditorSetMapper busiEditorSetMapper;
	
	public void save(BusiEditorSet busiEditorSet){
		busiEditorSetMapper.insert(busiEditorSet);
	}

    public void update(BusiEditorSet busiEditorSet){
		busiEditorSetMapper.update(busiEditorSet);
	}
	
    public void delete(Long id){
		busiEditorSetMapper.delete(id);
	}

    @Transactional(readOnly=true)
    public BusiEditorSet getById(Long id){
		return busiEditorSetMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiEditorSet> getPage(Map params, PageBounds rowBounds){
        PageList list = busiEditorSetMapper.findPage(params, rowBounds);
		return new Page<BusiEditorSet>(list,list.getPagination());
	}

	@Override
	@Transactional(readOnly = true)
	public BusiEditorSet getByCompanyIdSiteMenuId(Map params) {
		return busiEditorSetMapper.findByCompanyIdSiteMenuId(params);
	}
}
