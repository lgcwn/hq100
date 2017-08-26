/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.StarRankingResp;
import com.up72.hq.model.StarRanking;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * (明星排行)DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface StarRankingMapper {

    void insert(StarRanking entity);

    void update(StarRanking entity);

    void delete(java.lang.Long id);

    StarRankingResp findById(java.lang.Long id);

    PageList<StarRankingResp> findPage(Map params, PageBounds rowBounds);

    PageList<StarRankingResp> findPageHt(Map params, PageBounds rowBounds);

    PageList<StarRankingResp> findStarRankPage(Map params, PageBounds rowBounds);

    Long countNumber(Map params);

    PageList<StarRankingResp> findStarPageByPopularity(Map params, PageBounds rowBounds);

}
