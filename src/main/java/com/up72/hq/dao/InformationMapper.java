/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dao;


import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import com.up72.hq.model.Information;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 信息表DAO
 * 
 * @author LIUGUICHENG
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface InformationMapper {
	
	void insert(Information entity);

    void update(Information entity);
	
	void delete(Long id);
	
    Information findById(Long id);

    Information findByType(Integer type);

    PageList<Information> findPage(Map params, PageBounds rowBounds);

    void batchRealDel(@Param(value = "ids") String ids);
	

}
