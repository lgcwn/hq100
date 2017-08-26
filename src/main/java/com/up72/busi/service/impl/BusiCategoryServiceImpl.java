/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.constant.BusiCnst;
import com.up72.busi.dao.BusiCategoryMapper;
import com.up72.busi.dto.resp.BusiCategoryResp;
import com.up72.busi.model.BusiCategory;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.service.IBusiCategoryService;
import com.up72.busi.utils.FileUtil;
import com.up72.busi.utils.issue.HtmlGenerator;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 类别DAO实现
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiCategoryServiceImpl implements IBusiCategoryService {

    @Autowired
    private BusiCategoryMapper busiCategoryMapper;

    @Autowired
    private BusiResourceServiceImpl busiResourceServiceImpl;

    @Autowired
    private BusiSiteMenuServiceImpl busiSiteMenuServiceImpl;

    public BusiCategory save(BusiCategory busiCategory) {
        busiCategoryMapper.insert(busiCategory);
        return busiCategory;
    }

    public void update(BusiCategory busiCategory) {
        busiCategoryMapper.update(busiCategory);
    }

    public void delete(java.lang.Long id) {
        busiCategoryMapper.delete(id);
    }

    @Transactional(readOnly = true)
    public BusiCategory getById(java.lang.Long id) {
        return busiCategoryMapper.findById(id);
    }

    @Transactional(readOnly = true)
    public Page<BusiCategory> getPage(Map params, PageBounds rowBounds) {
        PageList list = busiCategoryMapper.findPage(params, rowBounds);
        return new Page<BusiCategory>(list, list.getPagination());
    }

    @Override
    public BusiCategory saveCategory(BusiCategory busiCategory) {
        busiCategoryMapper.insert(busiCategory);
        if (busiCategory.getLevel() == 1 && busiCategory.getParentId() == 0) { //一级菜单
            busiCategory.setRootId(busiCategory.getId());
            busiCategory.setIdPath("[" + busiCategory.getId() + "]");
        } else if (busiCategory.getParentId() != null && busiCategory.getParentId() != 0) { //其他菜单
            BusiCategory parent = busiCategoryMapper.findById(busiCategory.getParentId());
            if (parent != null) {
                busiCategory.setRootId(parent.getRootId());
                busiCategory.setIdPath(parent.getIdPath() + ",[" + busiCategory.getId() + "]");
            }
        }
        busiCategoryMapper.update(busiCategory);
        return busiCategory;
    }

    @Transactional(readOnly = true)
    @Override
    public List<BusiCategoryResp> getList(Map params, PageBounds pageBounds) {
        return busiCategoryMapper.findList(params, pageBounds);
    }

    @Transactional(readOnly = true)
    @Override
    public List<BusiCategoryResp> getList4TmplFile(Map params, PageBounds pageBounds) {
        return busiCategoryMapper.findList4TmplFile(params, pageBounds);
    }

    @Override
    public void deleteCategory(Long id) {
        //级联删除子节点
        List<BusiCategoryResp> list = getNoteListByPid(id.toString());
        HashMap<String, Object> params = new HashMap<String, Object>();
        if (list != null && list.size() > 0) {
            for (BusiCategory child : list) {
                child.setIsDel(1); //删除状态
                update(child);
            }
        }

        //删除当前节点
        BusiCategory busiCategory = getById(id);
        busiCategory.setIsDel(1);//删除状态
        update(busiCategory);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BusiCategoryResp> getNoteListByPid(String pid) {
        return busiCategoryMapper.findNoteListByPid(pid);
    }

    @Override
    public void issueHtml(HtmlGenerator htmlGenerator, String strDirPath, String host, BusiSiteMenu sm) {
        try {
            Map<String, Object> categoryParam = new HashMap<String, Object>();
            categoryParam.put("siteMenuId", sm.getId());
            categoryParam.put("isEnable", 1);
            categoryParam.put("isDel", 0);
            List<BusiCategoryResp> categories = busiCategoryMapper.findList(categoryParam, new PageBounds(100));
            if (categories != null && categories.size() > 0) {
                for (BusiCategory bc : categories) {
                    //列表页
                    String listTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/list.jsp";
                    String listJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/list.jsp";
                    File listFile = new File(listTemplateJsp);
                    FileUtil.Copy(listFile, listJsp);

                    //分类首页
                    String indexTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/index.jsp";
                    String indexJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/index.jsp";
                    File indxFile = new File(indexTemplateJsp);
                    FileUtil.Copy(indxFile, indexJsp);

                    if (bc.getIsStatic() == 1) { //静态化
                        String categoryTemplate = host + "template/" + sm.getId() + "/" + bc.getId() + "/index.jsp";
                        String categoryHtml = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/index.html";
                        htmlGenerator.createHtmlPage(categoryTemplate, categoryHtml);

                        busiResourceServiceImpl.issueHtml(htmlGenerator, strDirPath, host, sm, bc); //文章页
                    } else { //动态
                        //分类首页
                        String categoryTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/index.jsp";
                        String categoryJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/index.jsp";
                        File categoryFile = new File(categoryTemplateJsp);
                        FileUtil.Copy(categoryFile, categoryJsp);

                        busiResourceServiceImpl.issueJsp(strDirPath, host, sm, bc); //文章页
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void taskIssueHtml(BusiSiteMenu sm) {
        try {
            String strDirPath = BusiCnst.ROOTPATH + "up72/" + sm.getCompanyId() + "/";
            String host = BusiCnst.HOST + "/up72/" + sm.getCompanyId() + "/";
            Map<String, Object> categoryParam = new HashMap<String, Object>();
            categoryParam.put("siteMenuId", sm.getId());
            categoryParam.put("isEnable", 1);
            categoryParam.put("isDel", 0);
            List<BusiCategoryResp> categories = busiCategoryMapper.findList(categoryParam, new PageBounds(100));
            if (categories != null && categories.size() > 0) {
                for (BusiCategory bc : categories) {
                    if (bc.getIsStatic() == 1) { //静态化
                        HtmlGenerator htmlGenerator = new HtmlGenerator("");
                        busiResourceServiceImpl.issueHtml(htmlGenerator, strDirPath, host, sm, bc); //文章页
                    } else { //动态
                        busiResourceServiceImpl.issueJsp(strDirPath, host, sm, bc); //文章页
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void issueCategory(BusiCategory bc, int type) throws Exception {
        try {
            String strDirPath = BusiCnst.ROOTPATH + "up72/" + bc.getCompanyId() + "/";
            BusiSiteMenu sm = busiSiteMenuServiceImpl.getById(bc.getSiteMenuId());
            if (type == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_CAT_INDEX) {
                //分类首页
                String indexTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/index.jsp";
                String indexJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/index.jsp";
                File indxFile = new File(indexTemplateJsp);
                FileUtil.Copy(indxFile, indexJsp);
            }

            if (type == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_LIST) {
                //列表页
                String listTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/list.jsp";
                String listJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/list.jsp";
                File listFile = new File(listTemplateJsp);
                FileUtil.Copy(listFile, listJsp);
            }

            if (type == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_DEAIL) {
                HtmlGenerator htmlGenerator = new HtmlGenerator("");
                String host = BusiCnst.HOST + "/up72/" + sm.getCompanyId() + "/";
                if (bc.getIsStatic() == 1) { //静态化
                    String categoryTemplate = host + "template/" + sm.getId() + "/" + bc.getId() + "/index.jsp";
                    String categoryHtml = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/index.html";
                    htmlGenerator.createHtmlPage(categoryTemplate, categoryHtml);
                    busiResourceServiceImpl.issueHtml(htmlGenerator, strDirPath, host, sm, bc); //文章页
                } else { //动态
                    //分类首页
                    String categoryTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/index.jsp";
                    String categoryJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/index.jsp";
                    File categoryFile = new File(categoryTemplateJsp);
                    FileUtil.Copy(categoryFile, categoryJsp);
                    busiResourceServiceImpl.issueJsp(strDirPath, host, sm, bc); //文章页
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean existsFilePath(Long id, String staticFilePath) {
        int cnt = busiCategoryMapper.cntFilePath(id, staticFilePath);
        return cnt > 0;
    }

    @Override
    public BusiCategory getByFilePath(String filePath) {
        return busiCategoryMapper.findByFilePath(filePath);
    }


    @Transactional(readOnly = true)
    @Override
    public List<BusiCategoryResp> getList4Tree(Map params) {
        List<BusiCategoryResp> result = new LinkedList<BusiCategoryResp>();
        List<BusiCategoryResp> parentList = busiCategoryMapper.findList4Tree(params);
        if (null != parentList && parentList.size() > 0) {
            for (BusiCategoryResp categoryResp : parentList) {
                result.add(categoryResp);
                params.put("parentId", categoryResp.getId());
                getCategoryByPid(result, params);
            }
        }
        return result;
    }

    @Transactional(readOnly = true)
    private List<BusiCategoryResp> getCategoryByPid(List<BusiCategoryResp> result, Map params) {
        List<BusiCategoryResp> childMenu = busiCategoryMapper.findList4Tree(params);
        if (null != childMenu && childMenu.size() > 0) {
            for (int i = 0; i < childMenu.size(); i++) {
                result.add(childMenu.get(i));
                params.put("parentId", childMenu.get(i).getId());
                getCategoryByPid(result, params);
            }
        }
        return result;
    }
}
