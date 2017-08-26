/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.model.BusiIssueSet;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 发布配置DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiIssueSetMapper {
	
	void insert(BusiIssueSet entity);

    void update(BusiIssueSet entity);
	
	void delete(Long id);

    BusiIssueSet findById(Long id);

    PageList<BusiIssueSet> findPage(Map params, PageBounds rowBounds);
	
    BusiIssueSet findByCompanyIdSiteMenuId(Map params);

    void deleteByCompanyId(Long companyId);
}
