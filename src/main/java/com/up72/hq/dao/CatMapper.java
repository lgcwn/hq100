/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.CatRankingResp;
import com.up72.hq.dto.resp.CatResp;
import com.up72.hq.dto.resp.CatTwoLevelResp;
import com.up72.hq.dto.resp.CatUsingCntResp;
import com.up72.hq.model.Cat;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 分类DAO
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface CatMapper {

    void insert(Cat entity);

    void update(Cat entity);

    void delete(Long id);

    Cat findById(Long id);

    CatResp findRespById(Long id);

    PageList<Cat> findPage(Map params, PageBounds rowBounds);

    PageList<CatResp> findPageResp(Map params, PageBounds rowBounds);

    List<CatResp> findTopLevelList(Integer type);

    List<CatResp> findTopLevelListById(Long id);

    List<CatResp> findListByParentId(Long parentId);

    List<Cat> findAllLeafByRootId(Long rootId);

    int cntSub(Long parentId);

    CatUsingCntResp findUsingCnt(Long catId);

    List<CatTwoLevelResp> findTowLevelList();

    CatTwoLevelResp findTowLevelCat(Long id);

    List<CatUsingCntResp> findTop10OfToday(Map params);

    List<Cat> findLeafList();

    /**
     * 根据ids查找数据
     * @param ids
     * @return
     */
    public List<CatResp> findAndOrderByIds(@Param("ids") String ids);

    /**
     * 根据名称搜索
     * @param name
     * @return
     */
    public List<CatResp> findByName(String name);
    /**
     * 搜索收藏的商品所属分类
     * @param map
     * @return
     */
    public List<Cat> findFavouriteCatList(Map map);

    List<Cat> findListByParams(Map params);

    /**
     * 根据分类获取明星排行榜
     * @param params
     * @return
     */
    List<CatRankingResp> findListByRanking(Map params);
}
