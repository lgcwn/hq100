/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.model.BusiSiteTemplateFile;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 文章模板文件表接口
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteTemplateFileService {

    void save(BusiSiteTemplateFile busiSiteTemplateFile);

    void update(BusiSiteTemplateFile busiSiteTemplateFile);

    void delete(Long id);

    BusiSiteTemplateFile getById(Long id);

    Page<BusiSiteTemplateFile> getPage(Map params, PageBounds rowBounds);

    List<BusiSiteTemplateFile> getList(Map params, PageBounds pageBounds);

    void saveFile(BusiSiteTemplateFile file);

    void updateFile(BusiSiteTemplateFile file);

    /**
     * 发布pc模板
     *
     * 已发布完成站点，更新模板时 使用；
     * 同步更新所使用的菜单或分类等； pc 处理
     * @param file
     */
    void useTemplateFile(BusiSiteTemplateFile file) throws Exception;
}
