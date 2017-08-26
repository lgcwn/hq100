/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.FavouriteResp;
import com.up72.hq.model.Favourite;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 我的收藏DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface FavouriteMapper {

    void insert(Favourite entity);

    void update(Favourite entity);

    void delete(java.lang.Long id);

    Favourite findById(java.lang.Long id);

    Favourite findByParam(Map params);

    PageList<Favourite> findPage(Map params, PageBounds rowBounds);

    PageList<FavouriteResp> findPageCrowd(Map params, PageBounds rowBounds);
    PageList<FavouriteResp> findPageChoose(Map params, PageBounds rowBounds);
    PageList<FavouriteResp> findPageVideo(Map params, PageBounds rowBounds);
    PageList<FavouriteResp> findPageNew(Map params, PageBounds rowBounds);
    PageList<FavouriteResp> findPageStarRanking(Map params, PageBounds rowBounds);
    PageList<FavouriteResp> findPageRoleSelect(Map params, PageBounds rowBounds);

    int findFavouriteCountByNewId(Long newsId);

    List<Favourite> findFavouriteList(Favourite entity);

    List<FavouriteResp> findFavouriteRespList(Favourite entity);


}
