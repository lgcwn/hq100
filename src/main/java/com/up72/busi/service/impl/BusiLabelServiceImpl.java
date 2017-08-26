/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.dao.BusiLabelMapper;
import com.up72.busi.dto.resp.BusiLabelResp;
import com.up72.busi.model.BusiLabel;
import com.up72.busi.service.IBusiLabelService;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 标签库DAO实现
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiLabelServiceImpl implements  IBusiLabelService{

	@Autowired
	private BusiLabelMapper busiLabelMapper;

	public void save(BusiLabel busiLabel){
		busiLabelMapper.insert(busiLabel);
	}

	public void update(BusiLabel busiLabel){
		busiLabelMapper.update(busiLabel);
	}

	public void delete(java.lang.Long id){
		busiLabelMapper.delete(id);
	}

	@Transactional(readOnly=true)
	public BusiLabel getById(java.lang.Long id){
		return busiLabelMapper.findById(id);
	}

	@Transactional(readOnly=true)
	public Page<BusiLabel> getPage(Map params, PageBounds rowBounds){
		PageList list = busiLabelMapper.findPage(params, rowBounds);
		return new Page<BusiLabel>(list,list.getPagination());
	}

	@Transactional(readOnly=true)
	@Override
	public List<BusiLabelResp> getList(Map params, PageBounds pageBounds) {
		return busiLabelMapper.findList(params, pageBounds);
	}
}
