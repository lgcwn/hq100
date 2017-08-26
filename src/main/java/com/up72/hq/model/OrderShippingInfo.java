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
 * 发货管理
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderShippingInfo  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "发货管理";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_ID = "订单ID";
	public static final String ALIAS_INFO = "物流运送信息 ";
	public static final String ALIAS_ADD_TIME = "物流时间";
	
	
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
     * 物流运送信息        db_column: INFO 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String info;
    /**
     * 物流时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
	//columns END

	public OrderShippingInfo(){
	}

	public OrderShippingInfo(
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
	public void setInfo(java.lang.String value) {
		this.info = value;
	}
	
	public java.lang.String getInfo() {
		return this.info;
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
		if(obj instanceof OrderShippingInfo == false) return false;
		if(this == obj) return true;
		OrderShippingInfo other = (OrderShippingInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

