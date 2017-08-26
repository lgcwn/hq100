/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiSiteCtrlResp;
import com.up72.busi.model.BusiSiteCtrl;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;

/**
 * 站点控件接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteCtrlService {

    BusiSiteCtrl save(BusiSiteCtrl busiSiteCtrl);

    void update(BusiSiteCtrl busiSiteCtrl);
	
	void delete(Long id);
	
    BusiSiteCtrl getById(Long id);

    Page<BusiSiteCtrl> getPage(Map params, PageBounds rowBounds);

    List<BusiSiteCtrlResp> getBySiteMenuId(Long siteMenuId);
}
