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
 * 支付记录
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderPayLog  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "支付记录";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_ID = "订单id";
	public static final String ALIAS_PAY_MONEY = "支付金额";
	public static final String ALIAS_PAY_CHANNEL = "支付渠道（1支付宝，2银联，3微信,4余额）";
	public static final String ALIAS_PAY_CARD_TYPE = "支付银行卡的类型，根据支付渠道获取(0未知;1借记卡;2信用卡)";
	public static final String ALIAS_PAY_SN = "支付流水号（返回的第三方支付渠道的订单流水号）";
	public static final String ALIAS_PAY_TIME = "支付时间";
	public static final String ALIAS_CONTENT = "支付日志内容";
	public static final String ALIAS_HQ_USER_ID = "支付人(电商用户)";
	public static final String ALIAS_SCORE = "积分(支付所返现的积分)";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 订单id       db_column: ORDER_ID 
     */	
	@NotNull 
	private java.lang.Long orderId;
    /**
     * 支付金额       db_column: PAY_MONEY 
     */	
	@NotNull 
	private java.lang.Double payMoney;
    /**
     * 支付渠道（1支付宝，2银联，3微信,4余额）       db_column: PAY_CHANNEL 
     */	
	@NotNull 
	private Integer payChannel;
    /**
     * 支付银行卡的类型，根据支付渠道获取(0未知;1借记卡;2信用卡)       db_column: PAY_CARD_TYPE 
     */	
	
	private Integer payCardType;
    /**
     * 支付流水号（返回的第三方支付渠道的订单流水号）       db_column: PAY_SN 
     */	
	@Length(max=100)
	private java.lang.String paySn;
    /**
     * 支付时间       db_column: PAY_TIME 
     */	
	@NotNull 
	private java.lang.Long payTime;
    /**
     * 支付日志内容       db_column: CONTENT 
     */	
	@Length(max=200)
	private java.lang.String content;
    /**
     * 支付人(电商用户)       db_column: MEMBER_ID
     */	
	
	private java.lang.Long memberId;
    /**
     * 积分(支付所返现的积分)       db_column: SCORE 
     */	
	
	private java.lang.Long score;
	//columns END

	public OrderPayLog(){
	}

	public OrderPayLog(
		java.lang.Long id
	){
		this.id = id;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setOrderId(java.lang.Long value) {
		this.orderId = value;
	}
	
	public java.lang.Long getOrderId() {
		return this.orderId;
	}
	public void setPayMoney(java.lang.Double value) {
		this.payMoney = value;
	}
	
	public java.lang.Double getPayMoney() {
		return this.payMoney;
	}
	public void setPayChannel(Integer value) {
		this.payChannel = value;
	}
	
	public Integer getPayChannel() {
		return this.payChannel;
	}
	public void setPayCardType(Integer value) {
		this.payCardType = value;
	}
	
	public Integer getPayCardType() {
		return this.payCardType;
	}
	public void setPaySn(java.lang.String value) {
		this.paySn = value;
	}
	
	public java.lang.String getPaySn() {
		return this.paySn;
	}
	public void setPayTime(java.lang.Long value) {
		this.payTime = value;
	}
	
	public java.lang.Long getPayTime() {
		return this.payTime;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setScore(java.lang.Long value) {
		this.score = value;
	}
	
	public java.lang.Long getScore() {
		return this.score;
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
		if(obj instanceof OrderPayLog == false) return false;
		if(this == obj) return true;
		OrderPayLog other = (OrderPayLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

