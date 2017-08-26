/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiSiteTemplateResp;
import com.up72.busi.model.BusiSiteTemplate;
import com.up72.busi.model.BusiSiteTemplateFile;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 文章模板表接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteTemplateService {
	
	void save(BusiSiteTemplate busiSiteTemplate);

    void update(BusiSiteTemplate busiSiteTemplate);
	
	void delete(Long id);
	
    BusiSiteTemplate getById(Long id);

    Page<BusiSiteTemplate> getPage(Map params, PageBounds rowBounds);


    Page<BusiSiteTemplateResp> getRespPage(Map params, PageBounds pageBounds);

    List<BusiSiteTemplateResp> getListByType(Integer type, Long companyId);

    void copy(BusiSiteTemplateResp busiSiteTemplateResp) throws Exception;

    BusiSiteTemplateResp getRespById(Long id);

    void backup(List<BusiSiteTemplateFile> fileList);
}
