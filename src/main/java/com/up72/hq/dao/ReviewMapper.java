/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.ReviewResp;
import com.up72.hq.model.Review;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 评论DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ReviewMapper {

    void insert(Review entity);

    void update(Review entity);

    void delete(java.lang.Long id);

    Review findById(java.lang.Long id);

    PageList<Review> findPage(Map params, PageBounds rowBounds);

    PageList<ReviewResp> findPageResp(Map params, PageBounds rowBounds);

    PageList<ReviewResp> findReviewRespPage(Map params, PageBounds rowBounds);

    ReviewResp findByIdResp(java.lang.Long id);

    int findViewCountBySourceId(Map params);  //根据咨询主键Id和资讯分类Id查询得到该新闻被评论的次数

}
