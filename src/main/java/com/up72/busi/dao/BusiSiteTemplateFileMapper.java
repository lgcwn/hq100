/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.model.BusiSiteTemplateFile;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 文章模板文件表DAO
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteTemplateFileMapper {

    void insert(BusiSiteTemplateFile entity);

    void update(BusiSiteTemplateFile entity);

    void delete(Long id);

    BusiSiteTemplateFile findById(@Param(value = "id") Long id);

    PageList<BusiSiteTemplateFile> findPage(Map params, PageBounds rowBounds);

    List<BusiSiteTemplateFile> findList(Map params, PageBounds pageBounds);

    int findCountBy(Map params);

    void setOthersUndefault(Map params);

    void deleteByCompanyId(Long companyId);
}
