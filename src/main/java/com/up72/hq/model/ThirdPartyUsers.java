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
 * 第三方用户
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ThirdPartyUsers  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "第三方用户";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_TYPE = "第三方用户类型 (1qq;2微信;3微博)";
	public static final String ALIAS_THIRD_USER_SN = "第三方用户授权编号";
	public static final String ALIAS_ADD_TIME = "授权时间";
	public static final String ALIAS_MEMBER_ID = "memberId";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 第三方用户类型 (1qq;2微信;3微博)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 第三方用户授权编号       db_column: THIRD_USER_SN 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String thirdUserSn;
    /**
     * 授权时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * memberId       db_column: MEMBER_ID 
     */	
	
	private java.lang.Long memberId;
	//columns END

	public ThirdPartyUsers(){
	}

	public ThirdPartyUsers(
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
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setThirdUserSn(java.lang.String value) {
		this.thirdUserSn = value;
	}
	
	public java.lang.String getThirdUserSn() {
		return this.thirdUserSn;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
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
		if(obj instanceof ThirdPartyUsers == false) return false;
		if(this == obj) return true;
		ThirdPartyUsers other = (ThirdPartyUsers)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

