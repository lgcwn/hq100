/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.constant.BusiCnst;
import com.up72.busi.dao.BusiCategoryMapper;
import com.up72.busi.dao.BusiSiteMenuMapper;
import com.up72.busi.dao.BusiSiteTemplateFileMapper;
import com.up72.busi.dto.resp.BusiCategoryResp;
import com.up72.busi.dto.resp.BusiSiteMenuResp;
import com.up72.busi.model.BusiCategory;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.busi.model.BusiSiteTemplateFile;
import com.up72.busi.service.IBusiSiteTemplateFileService;
import com.up72.busi.utils.issue.IssueUtil;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章模板文件表DAO实现
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiSiteTemplateFileServiceImpl implements  IBusiSiteTemplateFileService{

	@Autowired
	private BusiSiteTemplateFileMapper busiSiteTemplateFileMapper;

	@Autowired
	private BusiSiteMenuServiceImpl busiSiteMenuServiceImpl;

	@Autowired
	private BusiCategoryServiceImpl busiCategoryServiceImpl;

	public void save(BusiSiteTemplateFile busiSiteTemplateFile){
		busiSiteTemplateFileMapper.insert(busiSiteTemplateFile);
	}

	public void update(BusiSiteTemplateFile busiSiteTemplateFile){
		busiSiteTemplateFileMapper.update(busiSiteTemplateFile);
	}

	public void delete(Long id){
		busiSiteTemplateFileMapper.delete(id);
	}

	@Transactional(readOnly=true)
	public BusiSiteTemplateFile getById(Long id){
		return busiSiteTemplateFileMapper.findById(id);
	}

	@Transactional(readOnly=true)
	public Page<BusiSiteTemplateFile> getPage(Map params, PageBounds rowBounds){
		PageList list = busiSiteTemplateFileMapper.findPage(params, rowBounds);
		return new Page<BusiSiteTemplateFile>(list,list.getPagination());
	}

	@Override
	public List<BusiSiteTemplateFile> getList(Map params, PageBounds pageBounds) {
		return busiSiteTemplateFileMapper.findList(params, pageBounds);
	}

	@Override
	public void saveFile(BusiSiteTemplateFile file) {
		Map params = new HashMap();
		params.put("siteTemplateId", file.getSiteTemplateId());
		params.put("fileType", file.getFileType());
		int fileCount = this.busiSiteTemplateFileMapper.findCountBy(params);
		if(fileCount == 0) {
			file.setIsDefault(1);
			busiSiteTemplateFileMapper.insert(file);
			return;
		} else {
			busiSiteTemplateFileMapper.insert(file);
			if(file.getIsDefault() == 1) {
				params = new HashMap();
				params.put("id", file.getId());
				params.put("siteTemplateId", file.getSiteTemplateId());
				params.put("fileType", file.getFileType());
				busiSiteTemplateFileMapper.setOthersUndefault(params);
			}
		}
		createTemplateFile(file);
	}

	/**
	 * 创建模板文件---预览,域名 + /preview/ + 企业id+ /模板路径
	 * @param file
	 */
	private void createTemplateFile(BusiSiteTemplateFile file){
		String filePath = BusiCnst.ROOTPATH+"preview/"+file.getCompanyId()+file.getFileUrl();
		IssueUtil.creatTemplateFile(filePath, file.getContent());
	}



	@Override
	public void updateFile(BusiSiteTemplateFile file) {
		busiSiteTemplateFileMapper.update(file);
		if(file.getIsDefault() == 1) {
			Map params = new HashMap();
			params.put("id", file.getId());
			params.put("siteTemplateId", file.getSiteTemplateId());
			params.put("fileType", file.getFileType());
			busiSiteTemplateFileMapper.setOthersUndefault(params);
		}

		createTemplateFile(file);
	}

	@Override
	public void useTemplateFile(BusiSiteTemplateFile file) throws Exception{
		try {
			if(file.getFileType() == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_INDEX){ //菜单首页
				if(file.getIsDefault() == 1){
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("siteTemplateId",file.getSiteTemplateId());
					map.put("isDel",0L);
					List<BusiSiteMenuResp> siteMenuResps = busiSiteMenuServiceImpl.getList(map, new PageBounds(1000));
					if(siteMenuResps != null && siteMenuResps.size()>0){
						BusiSiteMenu siteMenu = siteMenuResps.get(0);
						String filePath = BusiCnst.ROOTPATH+"up72/"+siteMenu.getCompanyId()+"/template/"+siteMenu.getId()+"/index.jsp";
						IssueUtil.creatTemplateFile(filePath, file.getContent());
						busiSiteMenuServiceImpl.issueMenu(siteMenu);
					}
				}
			}else{ //分类
				Map<String,Object> map = new HashMap<String,Object>();
				String fileName = "";
				if(file.getFileType() == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_CAT_INDEX){
					map.put("templateIndex",file.getId());
					fileName = "index.jsp";
				}else if(file.getFileType() == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_LIST){ //列表页
					map.put("templateList",file.getId());
					fileName = "list.jsp";
				}else if(file.getFileType() == BusiCnst.SiteTemplateFileCnst.FILE_TYPE_DEAIL){ //详情页
					map.put("templateDetail",file.getId());
					fileName = "detail.jsp";
				}
				map.put("isEnable",1);
				map.put("isDel",0);
				List<BusiCategoryResp> busiCategories = busiCategoryServiceImpl.getList(map,new PageBounds(Integer.MAX_VALUE));
				if(busiCategories != null && busiCategories.size() > 0){
					for(BusiCategory bc : busiCategories){
						String filePath = BusiCnst.ROOTPATH+"up72/"+bc.getCompanyId()+"/template/"+bc.getSiteMenuId()+"/"+bc.getId()+"/"+fileName;
						IssueUtil.creatTemplateFile(filePath, file.getContent());
						busiCategoryServiceImpl.issueCategory(bc,file.getFileType());
					}
				}
			}
		}catch (Exception e){
			e.printStackTrace();
			throw new Exception("发布模板错误");
		}
	}
}
