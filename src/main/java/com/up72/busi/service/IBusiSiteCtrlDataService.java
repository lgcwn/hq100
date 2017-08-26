/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.model.BusiSiteCtrlData;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;

/**
 * 站点控件数据接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteCtrlDataService {

    BusiSiteCtrlData save(BusiSiteCtrlData busiSiteCtrlData);

    void update(BusiSiteCtrlData busiSiteCtrlData);
	
	void delete(Long id);
	
    BusiSiteCtrlData getById(Long id);

    Page<BusiSiteCtrlData> getPage(Map params, PageBounds rowBounds);
	
    List<BusiSiteCtrlData> getListByCtrlId(Long ctrlId);
}
