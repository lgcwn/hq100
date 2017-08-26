/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.utils.CodeEncryption;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * APP注册
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class SignUp  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "APP注册";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_APP_ID = "appId";
	public static final String ALIAS_APP_SECRET = "appSecret";
	public static final String ALIAS_APP_STATUS = "appStatus";
	public static final String ALIAS_APP_NAME = "appName";
	public static final String ALIAS_APP_DESCRIPTION = "appDescription";
	public static final String ALIAS_DEVELOPER = "developer";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_PHONE = "phone";
	public static final String ALIAS_TIMESTAMP = "timestamp";
	public static final String ALIAS_APP_VER = "appVer";
	public static final String ALIAS_APP_REF = "appRef";
	public static final String ALIAS_APP_COINS_WON = "appCoinsWon";
	public static final String ALIAS_APP_COINS_LOST = "appCoinsLost";
	public static final String ALIAS_APP_POINTS_WON = "appPointsWon";
	public static final String ALIAS_APP_POINTS_LOST = "appPointsLost";
	public static final String ALIAS_IS_DELETE = "appCoinsLost";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * appId       db_column: APP_ID 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String appId;
    /**
     * appSecret       db_column: APP_SECRET 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String appSecret;
    /**
     * appStatus       db_column: APP_STATUS 
     */	
	@NotNull 
	private Integer appStatus;
    /**
     * isDelete       db_column: IS_DELETE
     */
	@NotNull
	private Integer isDelete;
    /**
     * appName       db_column: APP_NAME 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String appName;
    /**
     * appDescription       db_column: APP_DESCRIPTION 
     */	
	@Length(max=100)
	private java.lang.String appDescription;
    /**
     * developer       db_column: DEVELOPER 
     */	
	@Length(max=100)
	private java.lang.String developer;
    /**
     * email       db_column: EMAIL 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String email;
    /**
     * phone       db_column: PHONE 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String phone;
    /**
     * timestamp       db_column: TIMESTAMP 
     */	
	@Length(max=20)
	private java.lang.String timestamp;
    /**
     * appVer       db_column: APP_VER 
     */	
	@Length(max=20)
	private java.lang.String appVer;
    /**
     * appRef       db_column: APP_REF 
     */	
	@Length(max=20)
	private java.lang.String appRef;
    /**
     * appCoinsWon       db_column: APP_COINS_WON 
     */	
	@NotNull 
	private java.lang.Long appCoinsWon;
    /**
     * appCoinsLost       db_column: APP_COINS_LOST 
     */	
	@NotNull 
	private java.lang.Long appCoinsLost;
    /**
     * appPointsWon       db_column: APP_POINTS_WON
     */
	@NotNull
	private java.lang.Long appPointsWon;
    /**
     * appPointsLost       db_column: APP_POINTS_LOST
     */
	@NotNull
	private java.lang.Long appPointsLost;
	//columns END

	public SignUp(){
	}

	public SignUp(
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
	public void setAppId(java.lang.String value) {
		this.appId = value;
	}
	
	public java.lang.String getAppId() {
		return this.appId;
	}
	public void setAppSecret(java.lang.String value) {
		this.appSecret = value;
	}
	
	public java.lang.String getAppSecret() {
		return this.appSecret;
	}
	public void setAppStatus(Integer value) {
		this.appStatus = value;
	}
	
	public Integer getAppStatus() {
		return this.appStatus;
	}
	public void setAppName(java.lang.String value) {
		this.appName = value;
	}
	
	public java.lang.String getAppName() {
		return this.appName;
	}
	public void setAppDescription(java.lang.String value) {
		this.appDescription = value;
	}
	
	public java.lang.String getAppDescription() {
		return this.appDescription;
	}
	public void setDeveloper(java.lang.String value) {
		this.developer = value;
	}
	
	public java.lang.String getDeveloper() {
		return this.developer;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setTimestamp(java.lang.String value) {
		this.timestamp = value;
	}
	
	public java.lang.String getTimestamp() {
		return this.timestamp;
	}
	public void setAppVer(java.lang.String value) {
		this.appVer = value;
	}
	
	public java.lang.String getAppVer() {
		return this.appVer;
	}
	public void setAppRef(java.lang.String value) {
		this.appRef = value;
	}
	
	public java.lang.String getAppRef() {
		return this.appRef;
	}

	public Long getAppCoinsWon() {
		return appCoinsWon;
	}

	public void setAppCoinsWon(Long appCoinsWon) {
		this.appCoinsWon = appCoinsWon;
	}

	public Long getAppCoinsLost() {
		return appCoinsLost;
	}

	public void setAppCoinsLost(Long appCoinsLost) {
		this.appCoinsLost = appCoinsLost;
	}

	public Long getAppPointsWon() {
		return appPointsWon;
	}

	public void setAppPointsWon(Long appPointsWon) {
		this.appPointsWon = appPointsWon;
	}

	public Long getAppPointsLost() {
		return appPointsLost;
	}

	public void setAppPointsLost(Long appPointsLost) {
		this.appPointsLost = appPointsLost;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * id 密文
	 */
	private String idCipher;
	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}

	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SignUp == false) return false;
		if(this == obj) return true;
		SignUp other = (SignUp)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

