/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import com.up72.hq.dto.resp.NoticeResp;
import com.up72.hq.model.Notice;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 活动，公告，案例DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface NoticeMapper {
	
	void insert(Notice entity);

    void update(Notice entity);
	
	void delete(Long id);

    Notice findById(Long id);

    PageList<NoticeResp> findPage(Map params, PageBounds rowBounds);

    Notice  findByType(Integer type);

}
