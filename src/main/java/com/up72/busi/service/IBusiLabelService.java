/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiLabelResp;
import com.up72.busi.model.BusiLabel;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 标签库接口
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiLabelService {

    void save(BusiLabel busiLabel);

    void update(BusiLabel busiLabel);

    void delete(java.lang.Long id);

    BusiLabel getById(java.lang.Long id);

    Page<BusiLabel> getPage(Map params, PageBounds rowBounds);

    List<BusiLabelResp> getList(Map params, PageBounds rowBounds);
}
