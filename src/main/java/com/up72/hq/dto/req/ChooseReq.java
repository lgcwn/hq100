/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dto.req;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Choose;


/**
 * (评选之最)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ChooseReq extends Choose {

	private  String startTimeStr;
	private  String endTimeStr;
	private  String addTimeStr;
	private  String sumVotes;//总票数
	private  String [] imgsArr;
	private  String [] chooseNameArr;
	private  String [] virtualVotesArr;
	private  String [] introsArr;

	public String getStartTimeStr() {
		return Cnst.getFormatTime(super.getStartTime());
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	public String getEndTimeStr() {
		return Cnst.getFormatTime(super.getEndTime());
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}

	public String getSumVotes() {
		return sumVotes;
	}

	public void setSumVotes(String sumVotes) {
		this.sumVotes = sumVotes;
	}

	public String getAddTimeStr() {
		return Cnst.getFormatTime(super.getAddTime());
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public String[] getImgsArr() {
		return imgsArr;
	}

	public void setImgsArr(String[] imgsArr) {
		this.imgsArr = imgsArr;
	}

	public String[] getChooseNameArr() {
		return chooseNameArr;
	}

	public void setChooseNameArr(String[] chooseNameArr) {
		this.chooseNameArr = chooseNameArr;
	}

	public String[] getVirtualVotesArr() {
		return virtualVotesArr;
	}

	public void setVirtualVotesArr(String[] virtualVotesArr) {
		this.virtualVotesArr = virtualVotesArr;
	}

	public String[] getIntrosArr() {
		return introsArr;
	}

	public void setIntrosArr(String[] introsArr) {
		this.introsArr = introsArr;
	}
}

