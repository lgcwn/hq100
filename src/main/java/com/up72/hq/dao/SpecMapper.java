/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dao;


import com.up72.hq.dto.resp.Spec2Resp;
import com.up72.hq.dto.resp.SpecResp;
import com.up72.hq.model.Spec;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 规格DAO
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface SpecMapper {

    void insert(Spec entity);

    void update(Spec entity);

    void delete(Long id);

    Spec findById(Long id);

    PageList<Spec> findPage(Map params, PageBounds rowBounds);

    void deleteByCatId(Long catId);

    PageList<SpecResp> findRespPage(Map<String, Object> params, PageBounds pageBounds);

    int cntUsing(Long specId);

    SpecResp findRespById(Long id);

    List<SpecResp> findListByCat(Map params);

    List<Spec2Resp> findListByProdId(Long prodId);
}
