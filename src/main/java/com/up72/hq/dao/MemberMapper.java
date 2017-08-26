/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.MemberResp;
import com.up72.hq.model.Member;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 个人用户DAO
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface MemberMapper {
	
	void insert(Member entity);

    void update(Member entity);
	
	void delete(java.lang.Long id);

    MemberResp findById(java.lang.Long id);

    MemberResp findByPhone(java.lang.String phone);

    Member findId(java.lang.Long id);

    PageList<MemberResp> findPage(Map params, PageBounds rowBounds);

    /**
     *
     * 根据登录账号和密码查找用户数据
     * @author liuguicheng
     * @param map key值为:  loginAccount 和 password
     * @return
     */
    MemberResp findUserByLoginAccountAndPassword(Map<String,String> map);

    /**
     *
     * 根据邮箱查找是否验证
     * @author liuguicheng
     * @param map key值为:  loginAccount 和 password
     * @return
     */
    Member findUserByEmail(Map<String,String> map);


    /**
     *
     * 根据登录账户查找用户数据
     *
     * @author liuguicheng
     * @param map key值为:  loginAccount
     * @return
     */
    Member findUserByLoginAccount(Map<String,String> map);


    /**
     *
     * 根据用户名查找
     *
     * @author haiyi
     * @param userName
     * @return
     */
    Member findUserByUserName(String userName);

    Long findUserCnt(Map params);
    List<Member> findAll();

}
