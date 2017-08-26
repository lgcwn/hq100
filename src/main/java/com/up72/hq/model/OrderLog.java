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
 * 订单操作日志
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderLog  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "订单操作日志";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_ID = "订单ID";
	public static final String ALIAS_HANDLE_DATE = "处理日期";
	public static final String ALIAS_HANDLE_INFO = "处理信息（描述处理的结果，如：由待支付更新为已支付）";
	public static final String ALIAS_HANDLE_USER = "处理人（后台运营人员，特殊情况下介入处理订单）";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 订单ID       db_column: ORDER_ID 
     */	
	@NotNull 
	private java.lang.Long orderId;
    /**
     * 处理日期       db_column: HANDLE_DATE 
     */	
	@NotNull 
	private java.lang.Long handleDate;
    /**
     * 处理信息（描述处理的结果，如：由待支付更新为已支付）       db_column: HANDLE_INFO 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String handleInfo;
    /**
     * 处理人（后台运营人员，特殊情况下介入处理订单）       db_column: HANDLE_USER 
     */	
	@NotNull 
	private java.lang.Long handleUser;
	//columns END

	public OrderLog(){
	}

	public OrderLog(
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
	public void setHandleDate(java.lang.Long value) {
		this.handleDate = value;
	}
	
	public java.lang.Long getHandleDate() {
		return this.handleDate;
	}
	public void setHandleInfo(java.lang.String value) {
		this.handleInfo = value;
	}
	
	public java.lang.String getHandleInfo() {
		return this.handleInfo;
	}
	public void setHandleUser(java.lang.Long value) {
		this.handleUser = value;
	}
	
	public java.lang.Long getHandleUser() {
		return this.handleUser;
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
		if(obj instanceof OrderLog == false) return false;
		if(this == obj) return true;
		OrderLog other = (OrderLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

