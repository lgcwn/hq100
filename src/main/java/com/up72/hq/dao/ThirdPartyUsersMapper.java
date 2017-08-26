/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.ThirdPartyUsers;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 第三方用户DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface ThirdPartyUsersMapper {
	
	void insert(ThirdPartyUsers entity);

    void update(ThirdPartyUsers entity);
	
	void delete(java.lang.Long id);
	
    ThirdPartyUsers findById(java.lang.Long id);

    ThirdPartyUsers findParam(Map params);

    PageList<ThirdPartyUsers> findPage(Map params, PageBounds rowBounds);

    /**
     *
     * 根据第三方用户编码查询实体
     *
     *
     * @author liuguicheng
     * @param map  key:thirdUserSn   第三方用户编码
     * @return
     */
    ThirdPartyUsers findThirdPartyUsersByUserSn(Map<String,Object> map);



}
