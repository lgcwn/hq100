/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.constant.Cnst;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 用户登录日志
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class UserLoginLog  implements java.io.Serializable{
	//alias
	public static final String TABLE_ALIAS = "用户登录日志";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_MEMBER_ID = "登录用户id";
	public static final String ALIAS_LOGIN_TYPE = "登录方式类型(0pc;1android;2ios;3微信;4wap)";
	public static final String ALIAS_LOGIN_USER_TYPE = "登录用户类型(0注册用户;1qq用户;2微信用户;3会员卡;4微博用户;5人人网;6支付宝;7百度);";
	public static final String ALIAS_LOGIN_TIME = "登录时间";
	public static final String ALIAS_LOGIN_IP = "登录ip";
	public static final String ALIAS_MESSAGE = "登录信息";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 登录用户id       db_column: MEMBER_ID
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 登录方式类型(0pc;1android;2ios;3微信;4wap)       db_column: LOGIN_TYPE 
     */	
	@NotNull 
	private java.lang.Long loginType;
    /**
     * 登录用户类型(0注册用户;1qq用户;2微信用户;3会员卡;4微博用户;5人人网;6支付宝;7百度);       db_column: LOGIN_USER_TYPE 
     */	
	@NotNull 
	private java.lang.Long loginUserType;
    /**
     * 登录时间       db_column: LOGIN_TIME 
     */	
	@NotNull 
	private java.lang.Long loginTime;
    /**
     * 登录ip       db_column: LOGIN_IP 
     */	
	@Length(max=20)
	private java.lang.String loginIp;
    /**
     * 登录信息       db_column: MESSAGE 
     */	
	@Length(max=100)
	private java.lang.String message;
	//columns END

	public UserLoginLog(){
	}

	public UserLoginLog(
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

	public void setLoginType(java.lang.Long value) {
		this.loginType = value;
	}
	
	public java.lang.Long getLoginType() {
		return this.loginType;
	}
	public void setLoginUserType(java.lang.Long value) {
		this.loginUserType = value;
	}
	
	public java.lang.Long getLoginUserType() {
		return this.loginUserType;
	}
	public void setLoginTime(java.lang.Long value) {
		this.loginTime = value;
	}
	
	public java.lang.Long getLoginTime() {
		return this.loginTime;
	}
	public void setLoginIp(java.lang.String value) {
		this.loginIp = value;
	}
	
	public java.lang.String getLoginIp() {
		return this.loginIp;
	}
	public void setMessage(java.lang.String value) {
		this.message = value;
	}
	
	public java.lang.String getMessage() {
		return this.message;
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
		if(obj instanceof UserLoginLog == false) return false;
		if(this == obj) return true;
		UserLoginLog other = (UserLoginLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	private String lastLoginTimeStr; //最后登录时间

	public String getLastLoginTimeStr() {
		return Cnst.getFormatTime(this.getLoginTime());
	}

	public void setLastLoginTimeStr(String lastLoginTimeStr) {
		this.lastLoginTimeStr = lastLoginTimeStr;
	}
}

