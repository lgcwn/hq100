/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.model.BusiEditorSet;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.Map;


/**
 * 编辑器设置接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiEditorSetService {
	
	void save(BusiEditorSet busiEditorSet);

    void update(BusiEditorSet busiEditorSet);
	
	void delete(Long id);

    BusiEditorSet getById(Long id);

    Page<BusiEditorSet> getPage(Map params, PageBounds rowBounds);
	
    BusiEditorSet getByCompanyIdSiteMenuId(Map params);
}
