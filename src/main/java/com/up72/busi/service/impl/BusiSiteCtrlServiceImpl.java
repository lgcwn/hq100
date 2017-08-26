/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;
import java.util.*;

import com.up72.busi.dto.resp.BusiSiteCtrlResp;
import com.up72.busi.model.*;
import com.up72.busi.dao.*;
import com.up72.busi.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.up72.busi.service.IBusiSiteCtrlService;
import com.up72.framework.util.page.*;

/**
 * 站点控件DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteCtrlServiceImpl implements  IBusiSiteCtrlService{
	@Autowired
	private BusiSiteCtrlMapper busiSiteCtrlMapper;
	@Autowired
	private BusiSiteMenuMapper busiSiteMenuMapper;

	
	public BusiSiteCtrl save(BusiSiteCtrl model){
		busiSiteCtrlMapper.insert(model);
		busiSiteMenuMapper.updateControlCnt(model.getSiteMenuId());
		return model;
	}

    public void update(BusiSiteCtrl busiSiteCtrl){
		busiSiteCtrlMapper.update(busiSiteCtrl);
	}
	
    public void delete(Long id){
		Long siteMenuId = busiSiteCtrlMapper.findById(id).getSiteMenuId();
		busiSiteCtrlMapper.delete(id);
		busiSiteMenuMapper.updateControlCnt(siteMenuId);
	}
    
    @Transactional(readOnly=true)
    public BusiSiteCtrl getById(Long id){
		return busiSiteCtrlMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiSiteCtrl> getPage(Map params, PageBounds rowBounds){
		PageList<BusiSiteCtrl> list = busiSiteCtrlMapper.findPage(params, rowBounds);
		return new Page<BusiSiteCtrl>(list,list.getPagination());
	}

	@Override
	public List<BusiSiteCtrlResp> getBySiteMenuId(Long siteMenuId) {
		return busiSiteCtrlMapper.findBySiteMenuId(siteMenuId);
	}


}
