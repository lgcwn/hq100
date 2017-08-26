/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service;

import com.up72.busi.dto.resp.BusiSiteMenuResp;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;

import java.util.List;
import java.util.Map;


/**
 * 站点菜单接口
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public interface IBusiSiteMenuService {

    BusiSiteMenu save(BusiSiteMenu busiSiteMenu);

    void update(BusiSiteMenu busiSiteMenu);
	
	void delete(Long id);
	
    BusiSiteMenu getById(Long id);

    Page<BusiSiteMenu> getPage(Map params, PageBounds rowBounds);

    List<BusiSiteMenuResp> getList(Map params, PageBounds pageBounds);

    /**
     * 查询所有菜单及子菜单
     * @return
     */
    List<BusiSiteMenuResp> getAllMenu(Long companyId);

    /**
     * 根据父菜单获取其所有子菜单
     * @param pid 父节点id
     * @return
     */
    List<BusiSiteMenuResp> getNoteListByPid(String pid);

    void saveMenu(BusiSiteMenu siteMenu);

    void deleteSiteMenu(Long id);

    List<BusiSiteMenuResp> getLeftMenuBySingle(Long companyId);

    /**
     * 发布--全部菜单
     * @param companyId 企业id
     */
    void issueHtml(Long companyId) throws Exception;

    /**
     * 发布菜单
     * @param sm
     * @throws Exception
     */
    public void issueMenu(BusiSiteMenu sm) throws Exception;

    /** 获取企业下的文章系统菜单 */
    BusiSiteMenu getArticleSiteMenu(Long companyId);

    /** 获取企业下的单页菜单 */
    BusiSiteMenu getSingleSiteMenu(Long companyId);

    /**
     * 获取企业下所有的单页站点菜单
     * @param companyId
     * @return
     */
    List<BusiSiteMenu> getAllSingleSiteMenu(Long companyId);

    boolean existsUrl(Long id, String fileUrl);

    BusiSiteMenu getByUrl(String url);


}
