/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.VideoResp;
import com.up72.hq.model.Video;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * (视频DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface VideoMapper {
	
	void insert(Video entity);

    void update(Video entity);
	
	void delete(java.lang.Long id);

    VideoResp findById(java.lang.Long id);

    PageList<VideoResp> findPage(Map params, PageBounds rowBounds);

    List<Video> findHot();

    List<Video> findByCatId(java.lang.Long catId);
    //相关视频
    List<Video> findXgVideo(Long catId);
//首页展示
    List<Video> findHome(java.lang.Long catId);

    List<Video> findLimit9(Map params);

}
