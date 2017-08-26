/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.model.BusiResource;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 文章DAO
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiResourceMapper {

    void insert(BusiResource entity);

    void update(BusiResource entity);

    void delete(java.lang.Long id);

    BusiResource findById(java.lang.Long id);

    PageList<BusiResource> findPage(Map params, PageBounds rowBounds);

    List<BusiResource> findList(Map params);

    BusiResource findByUUID(java.lang.String uuid);

    void autoIssue(Long siteMenuId);

    void deleteByCompanyId(Long companyId);
}
