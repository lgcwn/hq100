/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.Votes;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 我的投票DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface VotesMapper {
	
	void insert(Votes entity);

    void update(Votes entity);
	
	void delete(java.lang.Long id);
	
    Votes findById(java.lang.Long id);

    PageList<Votes> findPage(Map params, PageBounds rowBounds);

    Long statHighestVotes(Map params);

    Long statLowestVotes(Map params);

    List<Votes> findYearList(Map params);
	

}
