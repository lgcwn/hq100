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
 * 安全表
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Security  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "安全表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_MEMBER_ID = "服务中心店主或会员的账单，基础用户id";
	public static final String ALIAS_PAY_PASSWORD = "支付密码";
	public static final String ALIAS_PAY_PASSWORD_LEVEL = "支付密码等级 0-100";
	public static final String ALIAS_PAY_SCENE = "支付场景，可能会多个值，逗号间隔(balance,coupon,integral)";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 服务中心店主或会员的账单，基础用户id       db_column: HQ_MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long hqMemberId;
    /**
     * 支付密码       db_column: PAY_PASSWORD 
     */	
	@Length(max=50)
	private java.lang.String payPassword;
    /**
     * 支付密码等级 0-100       db_column: PAY_PASSWORD_LEVEL 
     */	
	
	private java.lang.Integer payPasswordLevel;
    /**
     * 支付场景，可能会多个值，逗号间隔(balance,coupon,integral)       db_column: PAY_SCENE 
     */	
	@Length(max=100)
	private java.lang.String payScene;
	//columns END

	public Security(){
	}

	public Security(
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
	public void setHqMemberId(java.lang.Long value) {
		this.hqMemberId = value;
	}
	
	public java.lang.Long getHqMemberId() {
		return this.hqMemberId;
	}
	public void setPayPassword(java.lang.String value) {
		this.payPassword = value;
	}
	
	public java.lang.String getPayPassword() {
		return this.payPassword;
	}
	public void setPayPasswordLevel(java.lang.Integer value) {
		this.payPasswordLevel = value;
	}
	
	public java.lang.Integer getPayPasswordLevel() {
		return this.payPasswordLevel;
	}
	public void setPayScene(java.lang.String value) {
		this.payScene = value;
	}
	
	public java.lang.String getPayScene() {
		return this.payScene;
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
		if(obj instanceof Security == false) return false;
		if(this == obj) return true;
		Security other = (Security)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

