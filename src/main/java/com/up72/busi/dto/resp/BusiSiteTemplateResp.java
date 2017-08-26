/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.resp;

import com.up72.busi.model.BusiSiteTemplate;
import com.up72.busi.model.BusiSiteTemplateFile;

import java.util.List;


/**
 * 文章模板表输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteTemplateResp extends BusiSiteTemplate {

    private List<BusiSiteTemplateFile> fileList;

    public List<BusiSiteTemplateFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<BusiSiteTemplateFile> fileList) {
        this.fileList = fileList;
    }
}