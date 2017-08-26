/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.req.BusiResourceReq;
import com.up72.busi.model.BusiCategory;
import com.up72.busi.model.BusiResource;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.utils.issue.HtmlGenerator;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 文章接口
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiResourceService {

    BusiResource save(BusiResource busiResource);

    void update(BusiResource busiResource);

    void delete(java.lang.Long id);

    BusiResource getById(java.lang.Long id);

    Page<BusiResource> getPage(Map params, PageBounds rowBounds);

    List<BusiResource> getList(Map params);

    BusiResource getByUUID(String uuid);


    /**
     * 发布--文章静态
     * @param htmlGenerator 静态化工具类
     * @param strDirPath 文件跟路径
     * @param host 请求路径
     * @param sm 菜单
     * @param bc 分类
     */
    void issueHtml(HtmlGenerator htmlGenerator,String strDirPath,String host,BusiSiteMenu sm,BusiCategory bc);

    /**
     * 发布--文章动态
     * @param strDirPath 文件跟路径
     * @param host 请求路径
     * @param sm 菜单
     * @param bc 分类
     */
    void issueJsp(String strDirPath,String host,BusiSiteMenu sm,BusiCategory bc);

    /**
     * bc端发布文章
     * @param uuid
     */
    public void issueResource(String uuid);
}
