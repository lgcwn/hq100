/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiSiteMenuResp;
import com.up72.busi.model.BusiSiteMenu;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 站点菜单DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiSiteMenuMapper {
	
	void insert(BusiSiteMenu entity);

    void update(BusiSiteMenu entity);
	
	void delete(Long id);
	
    BusiSiteMenu findById(Long id);

    PageList<BusiSiteMenu> findPage(Map params, PageBounds rowBounds);

    List<BusiSiteMenuResp> findList(Map params, PageBounds pageBounds);

    List<BusiSiteMenuResp> findNoteListByPid(String pid);

    List<BusiSiteMenuResp> findLeftMenuBySingle(Map params);

    BusiSiteMenu getRootSingleSiteMenu(Long companyId);

    BusiSiteMenu getArticleSiteMenu(Long companyId);

    void deleteByCompanyId(Long companyId);

    void cascadeDelete(@Param(value = "id")Long id);

    int cntUrl(@Param(value = "id")Long id, @Param(value = "fileUrl")String fileUrl);

    void updateControlCnt(@Param(value = "id")Long id);

    BusiSiteMenu findByUrl(@Param(value = "fileUrl")String fileUrl);
}
