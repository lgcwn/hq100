/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiLabelResp;
import com.up72.busi.model.BusiLabel;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 标签库DAO
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiLabelMapper {

    void insert(BusiLabel entity);

    void update(BusiLabel entity);

    void delete(java.lang.Long id);

    BusiLabel findById(java.lang.Long id);

    PageList<BusiLabel> findPage(Map params, PageBounds rowBounds);

    List<BusiLabelResp> findList(Map params, PageBounds rowBounds);

    void deleteByCompanyId(Long companyId);
}
