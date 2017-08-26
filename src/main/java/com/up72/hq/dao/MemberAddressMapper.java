/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.MemberAddressResp;
import com.up72.hq.model.MemberAddress;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 会员收货地址DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface MemberAddressMapper {
	
	void insert(MemberAddress entity);

    void update(MemberAddress entity);
	
	void delete(java.lang.Long id);
	
    MemberAddressResp findById(java.lang.Long id);

    PageList<MemberAddress> findPage(Map params, PageBounds rowBounds);

    PageList<MemberAddressResp> findRespPage(Map params, PageBounds rowBounds);

    //获取会员默认地址
    MemberAddressResp findMemberAddress(java.lang.Long memberId);
}
