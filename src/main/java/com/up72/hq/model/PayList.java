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
 * 支付清单
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class PayList  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "支付清单";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_MEMBER_ID = "基础用户id";
	public static final String ALIAS_BILL_TYPE = "账单类型 (0消费;1转账;2退款;3充值;4佣金;5赠送;6提现;7充值卡充值)";
	public static final String ALIAS_PAY_TYPE = "支付方式(1余额支付;2支付宝支付;3微信支付;4银联支付;5余额退款;6充值卡)";
	public static final String ALIAS_CARD_TYPE = "银行卡类型,根据支付方式获取到的关联银行类型(0未知;1借记卡;2信用卡)";
	public static final String ALIAS_CARD_LIST_ID = "充值卡id";
	public static final String ALIAS_MONEY = "账单金额";
	public static final String ALIAS_ADD_DATE = "记账时间";
	public static final String ALIAS_RE_MARK = "备注";
	public static final String ALIAS_STATUS = "状态 0 成功 1 失败 2 未支付";
	public static final String ALIAS_SN = "单号";
	public static final String ALIAS_BALANCE = "余额";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 基础用户id       db_column: MEMBER_ID
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 账单类型 (0消费;1转账;2退款;3充值;4佣金;5赠送;6提现;7充值卡充值)       db_column: BILL_TYPE 
     */	
	@NotNull 
	private Integer billType;
    /**
     * 支付方式(1余额支付;2支付宝支付;3微信支付;4银联支付;5余额退款;6充值卡)       db_column: PAY_TYPE 
     */	
	@NotNull 
	private Integer payType;
    /**
     * 银行卡类型,根据支付方式获取到的关联银行类型(0未知;1借记卡;2信用卡)       db_column: CARD_TYPE 
     */	
	@NotNull 
	private Integer cardType;
    /**
     * 充值卡id       db_column: CARD_LIST_ID 
     */	
	
	private java.lang.Long cardListId;
    /**
     * 账单金额       db_column: MONEY 
     */	
	@NotNull 
	private java.lang.Double money;
    /**
     * 记账时间       db_column: ADD_DATE 
     */	
	@NotNull 
	private java.lang.Long addDate;
    /**
     * 备注       db_column: RE_MARK 
     */	
	@Length(max=100)
	private java.lang.String reMark;
    /**
     * 状态 0 成功 1 失败 2 未支付       db_column: STATUS 
     */	
	
	private Integer status;
    /**
     * 单号       db_column: SN 
     */	
	@Length(max=45)
	private java.lang.String sn;
    /**
     * 余额       db_column: BALANCE 
     */	
	
	private java.lang.Double balance;
	//columns END

	public PayList(){
	}

	public PayList(
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

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setBillType(Integer value) {
		this.billType = value;
	}
	
	public Integer getBillType() {
		return this.billType;
	}
	public void setPayType(Integer value) {
		this.payType = value;
	}
	
	public Integer getPayType() {
		return this.payType;
	}
	public void setCardType(Integer value) {
		this.cardType = value;
	}
	
	public Integer getCardType() {
		return this.cardType;
	}
	public void setCardListId(java.lang.Long value) {
		this.cardListId = value;
	}
	
	public java.lang.Long getCardListId() {
		return this.cardListId;
	}
	public void setMoney(java.lang.Double value) {
		this.money = value;
	}
	
	public java.lang.Double getMoney() {
		return this.money;
	}
	public void setAddDate(java.lang.Long value) {
		this.addDate = value;
	}
	
	public java.lang.Long getAddDate() {
		return this.addDate;
	}
	public void setReMark(java.lang.String value) {
		this.reMark = value;
	}
	
	public java.lang.String getReMark() {
		return this.reMark;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setSn(java.lang.String value) {
		this.sn = value;
	}
	
	public java.lang.String getSn() {
		return this.sn;
	}
	public void setBalance(java.lang.Double value) {
		this.balance = value;
	}
	
	public java.lang.Double getBalance() {
		return this.balance;
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
		if(obj instanceof PayList == false) return false;
		if(this == obj) return true;
		PayList other = (PayList)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

