/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.model.BusiEditorSet;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 编辑器设置DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiEditorSetMapper {
	
	void insert(BusiEditorSet entity);

    void update(BusiEditorSet entity);
	
	void delete(Long id);

    BusiEditorSet findById(Long id);

    PageList<BusiEditorSet> findPage(Map params, PageBounds rowBounds);

    BusiEditorSet findByCompanyIdSiteMenuId(Map params);

    void deleteByCompanyId(Long companyId);
}
