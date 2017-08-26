/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiSiteTemplateResp;
import com.up72.busi.model.BusiSiteTemplate;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 文章模板表DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteTemplateMapper {
	
	void insert(BusiSiteTemplate entity);

    void update(BusiSiteTemplate entity);
	
	void delete(Long id);
	
    BusiSiteTemplate findById(Long id);

    PageList<BusiSiteTemplate> findPage(Map params, PageBounds rowBounds);

    PageList<BusiSiteTemplateResp> findRespPage(Map params, PageBounds pageBounds);

    BusiSiteTemplateResp findRespById(Long id);

    List<BusiSiteTemplateResp> findListByType(Map params);

    void deleteByCompanyId(Long companyId);
}
