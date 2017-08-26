/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.PayList;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 支付清单DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface PayListMapper {

    void insert(PayList entity);

    void update(PayList entity);

    void delete(java.lang.Long id);

    PayList findById(java.lang.Long id);

    PageList<PayList> findPage(Map params, PageBounds rowBounds);

    PayList findBySnCode(String sn);  //根据单号查询此表


}
