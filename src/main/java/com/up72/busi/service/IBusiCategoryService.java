/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiCategoryResp;
import com.up72.busi.model.BusiCategory;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.utils.issue.HtmlGenerator;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 类别接口
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiCategoryService {

    BusiCategory save(BusiCategory busiCategory);

    void update(BusiCategory busiCategory);

    void delete(java.lang.Long id);

    BusiCategory getById(java.lang.Long id);

    Page<BusiCategory> getPage(Map params, PageBounds rowBounds);

    BusiCategory saveCategory(BusiCategory busiCategory);

    List<BusiCategoryResp> getList(Map params, PageBounds rowBounds);

    List<BusiCategoryResp> getList4TmplFile(Map params, PageBounds pageBounds);

    void deleteCategory(Long id);

    /***
     * List以树形展示
     * @param params
     * @return
     */
    List<BusiCategoryResp> getList4Tree(Map params);

    List<BusiCategoryResp> getNoteListByPid(String pid);

    /**
     * 发布--分类
     * @param strDirPath 文件跟路径
     * @param host 请求路径
     * @param sm 菜单
     */
    void issueHtml(HtmlGenerator htmlGenerator,String strDirPath,String host,BusiSiteMenu sm);

    /**
     * 定时发布
     * @param sm 菜单
     */
    void taskIssueHtml(BusiSiteMenu sm);

    /**
     * 发布分类
     * @param bc
     * @param type 模板类型，列表页，首页，详情页
     */
    void issueCategory(BusiCategory bc,int type) throws Exception;

    // 重写路径是否存在
    boolean existsFilePath(Long id, String staticFilePath);

    BusiCategory getByFilePath(String filePath);
}
