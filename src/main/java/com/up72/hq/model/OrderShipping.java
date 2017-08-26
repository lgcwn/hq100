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
public class OrderShipping  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "发货管理";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_ID = "订单ID";
	public static final String ALIAS_EX_CMP_ID = "快递公司ID(如果下单为第三方入驻店铺，其为店铺所支持的快递表id)";
	public static final String ALIAS_DELIVERY_NUMBER = "物流运送单号";
	public static final String ALIAS_SENDER = "寄件人名称";
	public static final String ALIAS_SEND_ADDRESS = "寄件地址";
	public static final String ALIAS_SEND_MOBILE = "寄件人手机";
	public static final String ALIAS_ZIP_CODE = "邮政编码";
	public static final String ALIAS_ADD_TIME = "创建时间";
	public static final String ALIAS_SYS_USER_ID = "后台第三方入驻店铺用户的id";
	
	
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
     * 快递公司ID(如果下单为第三方入驻店铺，其为店铺所支持的快递表id)       db_column: EX_CMP_ID 
     */	
	@NotNull 
	private java.lang.Long exCmpId;
    /**
     * 物流运送单号       db_column: DELIVERY_NUMBER 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String deliveryNumber;
    /**
     * 寄件人名称       db_column: SENDER 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String sender;
    /**
     * 寄件地址       db_column: SEND_ADDRESS 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String sendAddress;
    /**
     * 寄件人手机       db_column: SEND_MOBILE 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String sendMobile;
    /**
     * 邮政编码       db_column: ZIP_CODE 
     */	
	@Length(max=10)
	private java.lang.String zipCode;
    /**
     * 创建时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 后台第三方入驻店铺用户的id       db_column: SYS_USER_ID 
     */	
	@NotNull 
	private java.lang.Long sysUserId;
	//columns END

	public OrderShipping(){
	}

	public OrderShipping(
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
	public void setExCmpId(java.lang.Long value) {
		this.exCmpId = value;
	}
	
	public java.lang.Long getExCmpId() {
		return this.exCmpId;
	}
	public void setDeliveryNumber(java.lang.String value) {
		this.deliveryNumber = value;
	}
	
	public java.lang.String getDeliveryNumber() {
		return this.deliveryNumber;
	}
	public void setSender(java.lang.String value) {
		this.sender = value;
	}
	
	public java.lang.String getSender() {
		return this.sender;
	}
	public void setSendAddress(java.lang.String value) {
		this.sendAddress = value;
	}
	
	public java.lang.String getSendAddress() {
		return this.sendAddress;
	}
	public void setSendMobile(java.lang.String value) {
		this.sendMobile = value;
	}
	
	public java.lang.String getSendMobile() {
		return this.sendMobile;
	}
	public void setZipCode(java.lang.String value) {
		this.zipCode = value;
	}
	
	public java.lang.String getZipCode() {
		return this.zipCode;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setSysUserId(java.lang.Long value) {
		this.sysUserId = value;
	}
	
	public java.lang.Long getSysUserId() {
		return this.sysUserId;
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
		if(obj instanceof OrderShipping == false) return false;
		if(this == obj) return true;
		OrderShipping other = (OrderShipping)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

