/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dao;


import com.up72.hq.model.PersonalImages;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import com.up72.framework.util.page.PageList;

/**
 * 投票道具DAO
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface PersonalImagesMapper {

    void insert(PersonalImages entity);

    void update(PersonalImages entity);

    void delete(Long id);

    PersonalImages findById(Long id);

    PageList<PersonalImages> findPage(Map params, PageBounds rowBounds);

    PersonalImages findLastInfo(Long memberId);

    PersonalImages findInfoByOrder(Map params);

    /**
     * 根据用户id和图片排序查询上一条数据  （如果本条数据order为2 那么查询出来的为2+）
     *
     * @param params
     * @return
     */
    PersonalImages findBeforeInfoByOrderAndId(Map params);

    /**
     * 根据用户id和图片排序查询下一条数据  （如果本条数据order为2 那么查询出来的为2-）
     *
     * @param params
     * @return
     */
    PersonalImages findAfterInfoByOrderAndId(Map params);


}
