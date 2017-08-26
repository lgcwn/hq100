/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 回报信息
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ReturnInfo  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "回报信息";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_CROWD_ID = "众筹ID";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_RETURN_INFO = "回报详情";
	public static final String ALIAS_RETURN_CNT = "回报数量";
	public static final String ALIAS_RESTRICTION_NUM = "个人限购";
	public static final String ALIAS_IMG = "回报图片";
	public static final String ALIAS_SHIPPING_METHODS = "物流方式(1-无需物流;2-全国包邮(港澳台不能购买；3-全国包邮))";
	public static final String ALIAS_SEND_TIM = "发放时间";
	public static final String ALIAS_IS_POINTS = "是否支持积分抵扣(0-不支持，1-支持)";
	public static final String ALIAS_IS_TB = "是否支持T币抵扣(0-不支持，1-支持)";
	public static final String ALIAS_IS_DELETE = "是否删除（0-删除，1-不删除）";
	public static final String ALIAS_GET_POINTS = "获得积分";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 众筹ID       db_column: CROWD_ID 
     */	
	
	private java.lang.Long crowdId;
    /**
     * 标题       db_column: TITLE 
     */	
	@Length(max=100)
	private java.lang.String title;
    /**
     * 排序       db_column: SORT_ID 
     */	
	
	private java.lang.Integer sortId;
    /**
     * 回报详情       db_column: RETURN_INFO 
     */	
	@Length(max=1000)
	private java.lang.String returnInfo;
    /**
     * 回报数量       db_column: RETURN_CNT 
     */	
	
	private java.lang.Integer returnCnt;
    /**
     * 个人限购       db_column: RESTRICTION_NUM 
     */	
	
	private java.lang.Integer restrictionNum;
    /**
     * 获得积分       db_column: GIVE_POINTS
     */

	private java.lang.Integer givePoints;
    /**
     * 回报图片       db_column: IMG 
     */	
	@Length(max=500)
	private java.lang.String img;
    /**
     * 物流方式(1-无需物流;2-全国包邮(港澳台不能购买；3-全国包邮))       db_column: SHIPPING_METHODS 
     */	
	
	private Integer shippingMethods;
    /**
     * 发放时间       db_column: SEND_TIM 
     */	
	
	private java.lang.Long sendTim;
    /**
     * 是否支持积分抵扣(0-不支持，1-支持)       db_column: IS_POINTS 
     */	
	
	private Integer isPoints;
    /**
     * 是否删除(0-删除，1-不删除)       db_column: IS_DELETE
     */	
	
	private Integer isDelete;
    /**
     * 是否支持T币抵扣(0-不支持，1-支持)       db_column: IS_TB
     */

	private Integer isTb;

	/**
	 * 金额       db_column: MONEY
	 */
	@NotNull
	private java.lang.Integer money;
	//columns END

	public ReturnInfo(){
	}

	public ReturnInfo(
		java.lang.Long id
	){
		this.id = id;
	}


	public Integer getGivePoints() {
		return givePoints;
	}

	public void setGivePoints(Integer givePoints) {
		this.givePoints = givePoints;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setCrowdId(java.lang.Long value) {
		this.crowdId = value;
	}
	
	public java.lang.Long getCrowdId() {
		return this.crowdId;
	}
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setSortId(java.lang.Integer value) {
		this.sortId = value;
	}
	
	public java.lang.Integer getSortId() {
		return this.sortId;
	}
	public void setReturnInfo(java.lang.String value) {
		this.returnInfo = value;
	}
	
	public java.lang.String getReturnInfo() {
		return this.returnInfo;
	}
	public void setReturnCnt(java.lang.Integer value) {
		this.returnCnt = value;
	}
	
	public java.lang.Integer getReturnCnt() {
		return this.returnCnt;
	}
	public void setRestrictionNum(java.lang.Integer value) {
		this.restrictionNum = value;
	}
	
	public java.lang.Integer getRestrictionNum() {
		return this.restrictionNum;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setShippingMethods(Integer value) {
		this.shippingMethods = value;
	}
	
	public Integer getShippingMethods() {
		return this.shippingMethods;
	}
	public void setSendTim(java.lang.Long value) {
		this.sendTim = value;
	}
	
	public java.lang.Long getSendTim() {
		return this.sendTim;
	}
	public void setIsPoints(Integer value) {
		this.isPoints = value;
	}
	
	public Integer getIsPoints() {
		return this.isPoints;
	}
	public void setIsTb(Integer value) {
		this.isTb = value;
	}
	
	public Integer getIsTb() {
		return this.isTb;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ReturnInfo == false) return false;
		if(this == obj) return true;
		ReturnInfo other = (ReturnInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

