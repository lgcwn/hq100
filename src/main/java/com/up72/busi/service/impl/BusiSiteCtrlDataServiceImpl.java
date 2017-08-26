/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;
import java.util.*;

import com.up72.busi.model.*;
import com.up72.busi.dao.*;
import com.up72.busi.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.up72.busi.service.IBusiSiteCtrlDataService;
import com.up72.framework.util.page.*;

/**
 * 站点控件数据DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteCtrlDataServiceImpl implements  IBusiSiteCtrlDataService{
	@Autowired
	private BusiSiteCtrlDataMapper busiSiteCtrlDataMapper;
	
	public BusiSiteCtrlData save(BusiSiteCtrlData model){
		busiSiteCtrlDataMapper.insert(model);
		return model;
	}

    public void update(BusiSiteCtrlData busiSiteCtrlData){
		busiSiteCtrlDataMapper.update(busiSiteCtrlData);
	}
	
    public void delete(Long id){
		busiSiteCtrlDataMapper.delete(id);
	}
    
    @Transactional(readOnly=true)
    public BusiSiteCtrlData getById(Long id){
		return busiSiteCtrlDataMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiSiteCtrlData> getPage(Map params, PageBounds rowBounds){
		PageList<BusiSiteCtrlData> list = busiSiteCtrlDataMapper.findPage(params, rowBounds);
		return new Page<BusiSiteCtrlData>(list,list.getPagination());
	}

	@Override
	public List<BusiSiteCtrlData> getListByCtrlId(Long ctrlId) {
		return busiSiteCtrlDataMapper.findListByCtrlId(ctrlId);
	}


}
