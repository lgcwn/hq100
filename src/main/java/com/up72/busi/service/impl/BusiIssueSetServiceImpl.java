/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.service.impl;

import com.up72.busi.dao.BusiIssueSetMapper;
import com.up72.busi.dao.BusiResourceMapper;
import com.up72.busi.model.BusiIssueSet;
import com.up72.busi.service.IBusiIssueSetService;
import com.up72.framework.util.page.Page;
import com.up72.framework.util.page.PageBounds;
import com.up72.framework.util.page.PageList;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.MessageFormat;
import java.util.Map;

/**
 * 发布配置DAO实现
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class BusiIssueSetServiceImpl implements IBusiIssueSetService {
	Logger logger = Logger.getLogger(BusiIssueSetServiceImpl.class);

	@Autowired
	private BusiIssueSetMapper busiIssueSetMapper;
	@Autowired
	private BusiResourceMapper busiResourceMapper;

	public void save(BusiIssueSet busiIssueSet){
		busiIssueSetMapper.insert(busiIssueSet);
	}

    public void update(BusiIssueSet busiIssueSet){
		busiIssueSetMapper.update(busiIssueSet);
	}
	
    public void delete(Long id){
		busiIssueSetMapper.delete(id);
	}

    @Transactional(readOnly=true)
    public BusiIssueSet getById(Long id){
		return busiIssueSetMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<BusiIssueSet> getPage(Map params, PageBounds rowBounds){
        PageList list = busiIssueSetMapper.findPage(params, rowBounds);
		return new Page<BusiIssueSet>(list,list.getPagination());
	}

	@Override
	@Transactional(readOnly = true)
	public BusiIssueSet getByCompanyIdSiteMenuId(Map params) {
		return busiIssueSetMapper.findByCompanyIdSiteMenuId(params);
	}

	@Override
	public void autoIssue(Long siteMenuId) {
		System.out.println("定时发布...");
		busiResourceMapper.autoIssue(siteMenuId);
	}

	/**
	 * 设置定时器发布
	 * @param busiIssueSet
	 * @throws Exception
	 */
	@Override
	public void setIssueSetScheduleJob(BusiIssueSet busiIssueSet) throws Exception {
		String baseTaskTypeName = "busi_Article_IssueSet_" + busiIssueSet.getSiteMenuId();
		/*
		while(tbScheduleManagerFactory.isZookeeperInitialSucess() == false){
			Thread.sleep(1000);
		}
		tbScheduleManagerFactory.stopServer(baseTaskTypeName+"-Strategy");
		Thread.sleep(1000);
		try {
			tbScheduleManagerFactory.getScheduleDataManager().deleteTaskType(baseTaskTypeName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 创建任务调度DemoTask的基本信息
		ScheduleTaskType baseTaskType = new ScheduleTaskType();
		baseTaskType.setBaseTaskType(baseTaskTypeName);
		baseTaskType.setDealBeanName("issueSetJob");
		baseTaskType.setHeartBeatRate(2000);
		baseTaskType.setJudgeDeadInterval(10000);
		baseTaskType.setTaskParameter("siteMenuId=" + busiIssueSet.getSiteMenuId());
	//		baseTaskType.setTaskItems(ScheduleTaskType.splitTaskItem(
	//				"0:{TYPE=A,KIND=1},1:{TYPE=A,KIND=2},2:{TYPE=A,KIND=3},3:{TYPE=A,KIND=4}," +
	//						"4:{TYPE=A,KIND=5},5:{TYPE=A,KIND=6},6:{TYPE=A,KIND=7},7:{TYPE=A,KIND=8}," +
	//						"8:{TYPE=A,KIND=9},9:{TYPE=A,KIND=10}"));
		baseTaskType.setTaskItems(ScheduleTaskType.splitTaskItem("0,1,2,3,4,5,6,7,8,9"));

		//任务调度开始时间
		baseTaskType.setPermitRunStartTime(setCronExpression(busiIssueSet.getIssueHours(), busiIssueSet.getIssueMinutes()));

		tbScheduleManagerFactory.getScheduleDataManager().createBaseTaskType(baseTaskType);
		logger.info("创建调度任务成功:" + baseTaskType.toString());

		// 创建任务DemoTask的调度策略
		String taskName = baseTaskTypeName;
		String strategyName = baseTaskTypeName +"-Strategy";
		try {
			tbScheduleManagerFactory.getScheduleStrategyManager().deleteMachineStrategy(strategyName,true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ScheduleStrategy strategy = new ScheduleStrategy();
		strategy.setStrategyName(strategyName);
		strategy.setKind(ScheduleStrategy.Kind.Schedule);
		strategy.setTaskName(taskName);
		strategy.setTaskParameter("");

		strategy.setNumOfSingleServer(1);
		strategy.setAssignNum(10);
		strategy.setIPList("127.0.0.1".split(","));
		tbScheduleManagerFactory.getScheduleStrategyManager().createScheduleStrategy(strategy);
		logger.info("创建调度策略成功:" + strategy.toString());
		*/
	}

	/**
	 * 生成每天几点几分的表达式
	 * @param hours
	 * @param minutes
	 * @return
	 */
	private String setCronExpression(int hours, int minutes){
		String result = "0 {0} {1} * * ?";
		result = MessageFormat.format(result, minutes, hours).toString();
		return result;
	}
}
