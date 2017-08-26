/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.constant.BusiCnst;
import com.up72.busi.dao.BusiCategoryMapper;
import com.up72.busi.dao.BusiResourceMapper;
import com.up72.busi.dao.BusiSiteMenuMapper;
import com.up72.busi.model.BusiCategory;
import com.up72.busi.model.BusiResource;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.service.IBusiResourceService;
import com.up72.busi.utils.FileUtil;
import com.up72.busi.utils.issue.HtmlGenerator;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章DAO实现
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiResourceServiceImpl implements IBusiResourceService {

    @Autowired
    private BusiResourceMapper busiResourceMapper;

    @Autowired
    private BusiSiteMenuMapper busiSiteMenuMapper;

    @Autowired
    private BusiCategoryMapper busiCategoryMapper;

    public BusiResource save(BusiResource busiResource) {
        busiResourceMapper.insert(busiResource);
        return busiResource;
    }

    public void update(BusiResource busiResource) {
        busiResourceMapper.update(busiResource);
    }

    public void delete(java.lang.Long id) {
        busiResourceMapper.delete(id);
    }

    @Transactional(readOnly = true)
    public BusiResource getById(java.lang.Long id) {
        return busiResourceMapper.findById(id);
    }

    @Transactional(readOnly = true)
    public Page<BusiResource> getPage(Map params, PageBounds rowBounds) {
        PageList list = busiResourceMapper.findPage(params, rowBounds);
        return new Page<BusiResource>(list, list.getPagination());
    }

    @Override
    public List<BusiResource> getList(Map params) {
        return busiResourceMapper.findList(params);
    }

    @Override
    public BusiResource getByUUID(String uuid) {
        return busiResourceMapper.findByUUID(uuid);
    }

    @Override
    public void issueResource(String uuid) {
        try {
            BusiResource busiResource = busiResourceMapper.findByUUID(uuid);
            BusiSiteMenu sm = busiSiteMenuMapper.findById(busiResource.getSiteMenuId());
            BusiCategory bc = busiCategoryMapper.findById(busiResource.getCategoryId());
            String strDirPath = BusiCnst.ROOTPATH + "up72/" + sm.getCompanyId() + "/";
            String host = BusiCnst.HOST + "/up72/" + sm.getCompanyId() + "/";
            HtmlGenerator htmlGenerator = new HtmlGenerator("");
            if (bc.getIsStatic() != null && bc.getIsStatic() == 1) {
                this.createHtml(htmlGenerator, strDirPath, host, sm, bc, busiResource);
            } else {
                String detailJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/detail.jsp";
                File df = new File(detailJsp);
                if (!df.exists()) {
                    String detailTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/detail.jsp";
                    File detailFile = new File(detailTemplateJsp);
                    FileUtil.Copy(detailFile, detailJsp);
                }

                String resourcePath = sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/detail.jsp?siteMenuId=" + sm.getId() + "&resourceId=" + busiResource.getId() + "&categoryId=" + bc.getId();
                busiResource.setIssueTime(new Date().getTime());
                busiResource.setIssueLink("/" + resourcePath);
                busiResource.setIsIssue(1);
                busiResourceMapper.update(busiResource);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void issueHtml(HtmlGenerator htmlGenerator, String strDirPath, String host, BusiSiteMenu sm, BusiCategory bc) {
        try {
            Map<String, Object> resourceParam = new HashMap<>();
            resourceParam.put("siteMenuId", sm.getId());
            resourceParam.put("isAuditing", 1);
            resourceParam.put("isDel", 0);
            List<BusiResource> resources = busiResourceMapper.findList(resourceParam);
            if (resources != null && resources.size() > 0) {
                for (BusiResource br : resources) {
                    this.createHtml(htmlGenerator, strDirPath, host, sm, bc, br);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createHtml(HtmlGenerator htmlGenerator, String strDirPath, String host, BusiSiteMenu sm, BusiCategory bc, BusiResource br) {
        String date = BusiCnst.SDF.format(new Date(br.getAddTime()));
        String resourceTemplate = host + "template/" + sm.getId() + "/" + bc.getId() + "/detail.jsp?siteMenuId=" + sm.getId() + "&resourceId=" + br.getId() + "&categoryId=" + bc.getId();
        String resourcePath = sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/" + date + "/detail_" + br.getId() + ".html";
        String resourceHtml = strDirPath + resourcePath;
        htmlGenerator.createHtmlPage(resourceTemplate, resourceHtml);
        br.setIssueTime(new Date().getTime());
        br.setIssueLink("/" + resourcePath);
        br.setIsIssue(1);
        busiResourceMapper.update(br);
    }

    @Override
    public void issueJsp(String strDirPath, String host, BusiSiteMenu sm, BusiCategory bc) {
        try {
            String detailTemplateJsp = strDirPath + "template/" + sm.getId() + "/" + bc.getId() + "/detail.jsp";
            String detailJsp = strDirPath + "" + sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/detail.jsp";
            File detailFile = new File(detailTemplateJsp);
            FileUtil.Copy(detailFile, detailJsp);

            Map<String, Object> resourceParam = new HashMap<>();
            resourceParam.put("siteMenuId", sm.getId());
            resourceParam.put("isAuditing", 1);
            resourceParam.put("isDel", 0);
            List<BusiResource> resources = busiResourceMapper.findList(resourceParam);
            if (resources != null && resources.size() > 0) {
                for (BusiResource br : resources) {
                    String resourcePath = sm.getFileUrl() + "/" + bc.getStaticFilePath() + "/detail.jsp?siteMenuId=" + sm.getId() + "&resourceId=" + br.getId() + "&categoryId=" + bc.getId();
                    br.setIssueTime(new Date().getTime());
                    br.setIssueLink("/" + resourcePath);
                    br.setIsIssue(1);
                    busiResourceMapper.update(br);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
