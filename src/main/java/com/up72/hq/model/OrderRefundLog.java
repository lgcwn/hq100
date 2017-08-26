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
 * 
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderRefundLog  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "OrderRefundLog";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_ORDER_ID = "订单id";
	public static final String ALIAS_CHARGBACK_REQUEST_ID = "申请退款id";
	public static final String ALIAS_ORDER_PAY_LOG_ID = "支付记录id";
	public static final String ALIAS_REFUND_SN = "退款编号（平台产生退款编号）";
	public static final String ALIAS_REFUND_TRADE_NO = "退款流水号（返回的第三方支付通道的流水号）";
	public static final String ALIAS_RERUND_AMOUNT = "退款金额";
	public static final String ALIAS_STATUS = "退款流程状态(0退款中;1退款失败;2退款成功)";
	public static final String ALIAS_ADD_TIME = "退款时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 订单id       db_column: ORDER_ID 
     */	
	@NotNull 
	private java.lang.Long orderId;
    /**
     * 申请退款id       db_column: CHARGBACK_REQUEST_ID 
     */	
	
	private java.lang.Long chargbackRequestId;
    /**
     * 支付记录id       db_column: ORDER_PAY_LOG_ID 
     */	
	@NotNull 
	private java.lang.Long orderPayLogId;
    /**
     * 退款编号（平台产生退款编号）       db_column: REFUND_SN 
     */	
	@NotNull 
	private String refundSn;
    /**
     * 退款流水号（返回的第三方支付通道的流水号）       db_column: REFUND_TRADE_NO 
     */	
	@NotNull 
	private String refundTradeNo;
    /**
     * 退款金额       db_column: RERUND_AMOUNT 
     */	
	@NotNull 
	private Double rerundAmount;
    /**
     * 退款流程状态(0退款中;1退款失败;2退款成功)       db_column: STATUS 
     */	
	@NotNull 
	private Integer status;
    /**
     * 退款时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
	//columns END

	public OrderRefundLog(){
	}

	public OrderRefundLog(
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
	public void setChargbackRequestId(java.lang.Long value) {
		this.chargbackRequestId = value;
	}
	
	public java.lang.Long getChargbackRequestId() {
		return this.chargbackRequestId;
	}
	public void setOrderPayLogId(java.lang.Long value) {
		this.orderPayLogId = value;
	}
	
	public java.lang.Long getOrderPayLogId() {
		return this.orderPayLogId;
	}

	public String getRefundSn() {
		return refundSn;
	}

	public void setRefundSn(String refundSn) {
		this.refundSn = refundSn;
	}

	public String getRefundTradeNo() {
		return refundTradeNo;
	}

	public void setRefundTradeNo(String refundTradeNo) {
		this.refundTradeNo = refundTradeNo;
	}

	public Double getRerundAmount() {
		return rerundAmount;
	}

	public void setRerundAmount(Double rerundAmount) {
		this.rerundAmount = rerundAmount;
	}

	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
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
		if(obj instanceof OrderRefundLog == false) return false;
		if(this == obj) return true;
		OrderRefundLog other = (OrderRefundLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

