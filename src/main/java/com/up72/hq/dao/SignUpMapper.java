/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.SignUp;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * APP注册DAO
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface SignUpMapper {
	
	void insert(SignUp entity);

    void update(SignUp entity);
	
	void delete(java.lang.Long id);
	
    SignUp findById(java.lang.Long id);

    SignUp findByAppId(java.lang.String appId);

    PageList<SignUp> findPage(Map params, PageBounds rowBounds);
	

}
