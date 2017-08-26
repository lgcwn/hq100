/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.constant.BusiCnst;
//import com.up72.busi.dao.BusiLeftMenuMapper;
//import com.up72.busi.dao.BusiRoleMenuMapper;
import com.up72.busi.dao.BusiSiteMenuMapper;
import com.up72.busi.dto.resp.BusiSiteMenuResp;
//import com.up72.busi.model.BusiLeftMenu;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.service.IBusiSiteMenuService;
import com.up72.busi.utils.FileUtil;
import com.up72.busi.utils.issue.HtmlGenerator;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.*;

/**
 * 站点菜单DAO实现
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteMenuServiceImpl implements IBusiSiteMenuService {

    @Autowired
    private BusiSiteMenuMapper busiSiteMenuMapper;
//    @Autowired
//    private BusiRoleMenuMapper roleMenuMapper;
    @Autowired
    private BusiCategoryServiceImpl busiCategoryServiceImpl;
//    @Autowired
//    private BusiLeftMenuMapper busiLeftMenuMapper;

    public BusiSiteMenu save(BusiSiteMenu m) {
        busiSiteMenuMapper.insert(m);
        m.setRootId(m.getId());
        if(m.getLevel() == 1) {
            m.setIdPath("[" + m.getId() + "]");
        } else {
            m.setIdPath(m.getIdPath() + ",[" + m.getId() + "]");
        }
        busiSiteMenuMapper.update(m);
        return m;
    }

    public void update(BusiSiteMenu busiSiteMenu) {

        busiSiteMenuMapper.update(busiSiteMenu);
        /*
        if (busiSiteMenu.getLevel() != 1) return;
        // 如果级别为1，说明是文章系统菜单或者是根部的单页菜单，则相应修改左侧菜单的名称
        int type = busiSiteMenu.getType();
        Map params = new HashMap();
        params.put("companyId", busiSiteMenu.getCompanyId());
        if (type == BusiCnst.SiteMenuCnst.TYPE_ARTICLE) { // 文章系统
            params.put("linkType", BusiCnst.MenuCnst.LINK_TYPE_ARTICLE);
        } else {
            params.put("linkType", BusiCnst.MenuCnst.LINK_TYPE_SINGLE);
        }
        BusiLeftMenu leftMenu = busiLeftMenuMapper.getLeftMenu(params);
        if (leftMenu == null) {
            return;
        }
        leftMenu.setName(busiSiteMenu.getName());
        busiLeftMenuMapper.update(leftMenu);
        */
    }

    public void delete(Long id) {
        busiSiteMenuMapper.delete(id);
    }

    @Transactional(readOnly = true)
    public BusiSiteMenu getById(Long id) {
        return busiSiteMenuMapper.findById(id);
    }

    @Transactional(readOnly = true)
    public Page<BusiSiteMenu> getPage(Map params, PageBounds rowBounds) {
        PageList list = busiSiteMenuMapper.findPage(params, rowBounds);
        return new Page<BusiSiteMenu>(list, list.getPagination());
    }

    @Override
    @Transactional(readOnly = true)
    public List<BusiSiteMenuResp> getAllMenu(Long companyId) {
        List<BusiSiteMenuResp> result = new LinkedList<BusiSiteMenuResp>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("isDel", 0);
        map.put("parentId", 0);
        map.put("companyId", companyId);

        PageBounds pageBounds = new PageBounds(Integer.MAX_VALUE);
        List<BusiSiteMenuResp> parentList = getList(map, pageBounds);

        if (null != parentList && parentList.size() > 0) {
            for (BusiSiteMenuResp sr : parentList) {
                result.add(sr);
                getMenuByPid(sr.getId(), result, companyId);
            }
        }
        return result;
    }

    @Transactional(readOnly = true)
    private List<BusiSiteMenuResp> getMenuByPid(Long pid, List<BusiSiteMenuResp> result, Long companyId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("isDel", 0);
        map.put("parentId", pid);
        map.put("companyId", companyId);

        PageBounds pageBounds = new PageBounds(Integer.MAX_VALUE);
        List<BusiSiteMenuResp> childMenu = getList(map, pageBounds);

        if (null != childMenu && childMenu.size() > 0) {
            for (int i = 0; i < childMenu.size(); i++) {
                result.add(childMenu.get(i));
                getMenuByPid(childMenu.get(i).getId(), result, companyId);
            }
        }
        return result;
    }

    @Override
    @Transactional(readOnly = true)
    public List<BusiSiteMenuResp> getList(Map params, PageBounds pageBounds) {
        return busiSiteMenuMapper.findList(params, pageBounds);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BusiSiteMenuResp> getNoteListByPid(String pid) {
        return busiSiteMenuMapper.findNoteListByPid(pid);
    }

    @Override
    public void saveMenu(BusiSiteMenu siteMenu) {
        busiSiteMenuMapper.insert(siteMenu);
        if (siteMenu.getLevel() == 1 && siteMenu.getParentId() == 0) { //一级菜单
            siteMenu.setRootId(siteMenu.getId());
            siteMenu.setIdPath("[" + siteMenu.getId() + "]");
        } else if (siteMenu.getParentId() != null && siteMenu.getParentId() != 0) { //其他菜单
            BusiSiteMenu parentSiteMenu = busiSiteMenuMapper.findById(siteMenu.getParentId());
            if (parentSiteMenu != null) {
                siteMenu.setRootId(parentSiteMenu.getRootId());
                siteMenu.setIdPath(parentSiteMenu.getIdPath() + ",[" + siteMenu.getId() + "]");
            }
        }
        busiSiteMenuMapper.update(siteMenu);
    }

    @Override
    public void deleteSiteMenu(Long id) {
        busiSiteMenuMapper.cascadeDelete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BusiSiteMenuResp> getLeftMenuBySingle(Long companyId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("parentId", 0);
        params.put("companyId", companyId);

        List<BusiSiteMenuResp> result = new LinkedList<BusiSiteMenuResp>();
        List<BusiSiteMenuResp> parentList = busiSiteMenuMapper.findLeftMenuBySingle(params);
        if (null != parentList && parentList.size() > 0) {
            for (BusiSiteMenuResp categoryResp : parentList) {
                result.add(categoryResp);
                params.put("parentId", categoryResp.getId());
                getMenuByPid(categoryResp.getId(), result, companyId);
            }
        }
        return result;
    }

    @Override
    public void issueHtml(Long companyId) throws Exception {
        try {
            Map<String, Object> menuParam = new HashMap<String, Object>();
            menuParam.put("companyId", companyId);
            menuParam.put("isDel", 0);
            List<BusiSiteMenuResp> siteMenus = busiSiteMenuMapper.findList(menuParam, new PageBounds(Integer.MAX_VALUE));
            if (siteMenus != null && siteMenus.size() > 0) {
                String strDirPath = BusiCnst.ROOTPATH + "up72/" + companyId + "/";
                String host = BusiCnst.HOST + "/up72/" + companyId + "/";
                HtmlGenerator htmlGenerator = new HtmlGenerator("");
                for (BusiSiteMenu sm : siteMenus) {
                    if (sm.getIsStatic() == 1) { //静态化
                        String menuTemplate = host + "template/" + sm.getId() + "/index.jsp";
                        String menuHtml = strDirPath + "" + sm.getFileUrl() + "/index.html";
                        htmlGenerator.createHtmlPage(menuTemplate, menuHtml);
                    } else { //动态
                        String menuTemplateJsp = strDirPath + "template/" + sm.getId() + "/index.jsp";
                        String menuJsp = strDirPath + "" + sm.getFileUrl() + "/index.jsp";
                        File menuFile = new File(menuTemplateJsp);
                        FileUtil.Copy(menuFile, menuJsp);
                    }
                    busiCategoryServiceImpl.issueHtml(htmlGenerator, strDirPath, host, sm);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

    public void issueMenu(BusiSiteMenu sm) throws Exception {
        try {
            String strDirPath = BusiCnst.ROOTPATH + "up72/" + sm.getCompanyId() + "/";
            String host = BusiCnst.HOST + "/up72/" + sm.getCompanyId() + "/";
            HtmlGenerator htmlGenerator = new HtmlGenerator("");
            if (sm.getIsStatic() == 1) { //静态化
                String menuTemplate = host + "template/" + sm.getId() + "/index.jsp";
                String menuHtml = strDirPath + "" + sm.getFileUrl() + "/index.html";
                htmlGenerator.createHtmlPage(menuTemplate, menuHtml);
            } else { //动态
                String menuTemplateJsp = strDirPath + "template/" + sm.getId() + "/index.jsp";
                String menuJsp = strDirPath + "" + sm.getFileUrl() + "/index.jsp";
                File menuFile = new File(menuTemplateJsp);
                FileUtil.Copy(menuFile, menuJsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("发布" + sm.getId() + "菜单时出错");
        }
    }

    @Override
    public BusiSiteMenu getArticleSiteMenu(Long companyId) {
        return busiSiteMenuMapper.getArticleSiteMenu(companyId);
    }

    @Override
    public BusiSiteMenu getSingleSiteMenu(Long companyId) {
        return busiSiteMenuMapper.getRootSingleSiteMenu(companyId);
    }

    @Override
    public List<BusiSiteMenu> getAllSingleSiteMenu(Long companyId) {
        BusiSiteMenu rootSingleSiteMenu = busiSiteMenuMapper.getRootSingleSiteMenu(companyId);
        if (rootSingleSiteMenu == null) {
            return null;
        }
        List<BusiSiteMenuResp> children = new ArrayList<>();
        children = getMenuByPid(rootSingleSiteMenu.getId(), children, companyId);
        List<BusiSiteMenu> result = new ArrayList<>();
        result.add(rootSingleSiteMenu);
        result.addAll(children);
        return result;
    }

    @Override
    public boolean existsUrl(Long id, String fileUrl) {
        int cnt = busiSiteMenuMapper.cntUrl(id,fileUrl);
        return cnt > 0;
    }

    @Override
    public BusiSiteMenu getByUrl(String url) {
        return busiSiteMenuMapper.findByUrl(url);
    }
}
