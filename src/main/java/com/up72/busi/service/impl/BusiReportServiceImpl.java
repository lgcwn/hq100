/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.constant.BusiCnst;
import com.up72.busi.dao.BusiReportMapper;
import com.up72.busi.dao.BusiSiteMenuMapper;
import com.up72.busi.dto.resp.BusiReportInfoResp;
import com.up72.busi.dto.resp.BusiReportResp;
import com.up72.busi.model.BusiReport;
import com.up72.busi.service.IBusiReportService;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 统计报告DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiReportServiceImpl implements IBusiReportService {
	
	@Autowired
	private BusiReportMapper busiReportMapper;
	@Autowired
	private BusiSiteMenuMapper busiSiteMenuMapper;
	
	public void save(BusiReport busiReport){
		busiReportMapper.insert(busiReport);
	}

    public void update(BusiReport busiReport){
		busiReportMapper.update(busiReport);
	}
	
    public void delete(Long id){
		busiReportMapper.delete(id);
	}

    @Transactional(readOnly=true)
    public BusiReport getById(Long id){
		return busiReportMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiReport> getPage(Map params, PageBounds rowBounds){
        PageList list = busiReportMapper.findPage(params, rowBounds);
		return new Page<BusiReport>(list,list.getPagination());
	}

	@Transactional(readOnly=true)
	public BusiReport getByUnique(Map params){
		return this.busiReportMapper.findByUnique(params);
	}

	@Override
	public List<BusiReportResp> getRespList(Map params){
		return this.busiReportMapper.findRespList(params);
	}

	@Override
	public void updateTodayReport(Long siteMenuId){
		int reportDate = Integer.parseInt(BusiCnst.SDF.format(new Date(new Date().getTime())).replaceAll("-",""));
		Map params = new HashMap();
		params.put("reportDate", reportDate);
		params.put("siteMenuId", siteMenuId);
		this.busiReportMapper.pcInsertByDate(params);
		this.busiReportMapper.pcUpdateByDate(params);
	}

	/** 每天0点过1秒，先插入昨天未统计的记录，再修改昨天所有的统计 */
	@Override
	@Scheduled(cron = "1 0 0 * * ?")
//	@Scheduled(cron = "*/15 * * * * ?")
	public void updateYesterdayReport(){
		try {
			// 昨天的日期
			int reportDate = Integer.parseInt(BusiCnst.SDF.format(new Date(new Date().getTime() - 24 * 60 * 60 * 1000)).replaceAll("-",""));
			Map params = new HashMap();
			params.put("reportDate", reportDate);
			this.busiReportMapper.pcInsertByDate(params);
			this.busiReportMapper.pcUpdateByDate(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public BusiReportInfoResp getReportInfo(Long siteMenuId){
		return this.busiReportMapper.findReportInfo(siteMenuId);
	}


}
