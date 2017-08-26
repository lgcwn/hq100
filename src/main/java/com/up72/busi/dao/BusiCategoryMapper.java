/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dao;


import com.up72.busi.dto.resp.BusiCategoryResp;
import com.up72.busi.dto.resp.BusiSiteMenuResp;
import com.up72.busi.model.BusiCategory;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 类别DAO
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface BusiCategoryMapper {

    void insert(BusiCategory entity);

    void update(BusiCategory entity);

    void delete(java.lang.Long id);

    BusiCategory findById(java.lang.Long id);

    PageList<BusiCategory> findPage(Map params, PageBounds rowBounds);

    List<BusiCategoryResp> findList(Map params, PageBounds pageBounds);

    List<BusiCategoryResp> findList4TmplFile(Map params, PageBounds pageBounds);

    List<BusiCategoryResp> findList4Tree(Map params);

    List<BusiCategoryResp> findNoteListByPid(String pid);

    List<BusiCategory> findByPid(Long pid);

    Long findCountByPid(Long pid);

    void deleteByCompanyId(Long companyId);

    int cntFilePath(@Param(value = "id")Long id, @Param(value = "staticFilePath") String staticFilePath);

    BusiCategory findByFilePath(@Param(value = "staticFilePath") String staticFilePath);
}
