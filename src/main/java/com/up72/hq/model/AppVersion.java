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
 * 版本管理
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class AppVersion  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "版本管理";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TYPE = "系统类型 1 ios 0 android";
	public static final String ALIAS_VERSION_NO = "版本号";
	public static final String ALIAS_VERSION_NAME = "版本名称";
	public static final String ALIAS_SIZE = "大小";
	public static final String ALIAS_APP_URL = "升级包地址";
	public static final String ALIAS_UPDATE_INFO = "更新日志";
	public static final String ALIAS_ADD_TIME = "更新时间";
	public static final String ALIAS_IS_MUST_UPDATE = "是否必须升级,1是，0否";
	public static final String ALIAS_IS_DELETE = "是否删除";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Long id;
    /**
     * 系统类型 1 ios 0 android       db_column: type 
     */	
	@NotNull 
	private java.lang.Integer type;
    /**
     * 版本号       db_column: version_no 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String versionNo;
    /**
     * 版本名称       db_column: version_name 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String versionName;
    /**
     * 大小       db_column: size 
     */	
	@NotNull 
	private java.lang.Long size;
    /**
     * 升级包地址       db_column: app_url 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String appUrl;
    /**
     * 更新日志       db_column: update_info 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String updateInfo;
    /**
     * 更新时间       db_column: add_Time 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 是否必须升级,1是，0否       db_column: is_must_update 
     */	
	@NotNull 
	private java.lang.Integer isMustUpdate;
    /**
     * 是否删除       db_column: is_delete 
     */	
	@NotNull 
	private java.lang.Integer isDelete;
	//columns END

	public AppVersion(){
	}

	public AppVersion(
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
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getType() {
		return this.type;
	}
	public void setVersionNo(java.lang.String value) {
		this.versionNo = value;
	}
	
	public java.lang.String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionName(java.lang.String value) {
		this.versionName = value;
	}
	
	public java.lang.String getVersionName() {
		return this.versionName;
	}
	public void setSize(java.lang.Long value) {
		this.size = value;
	}
	
	public java.lang.Long getSize() {
		return this.size;
	}
	public void setAppUrl(java.lang.String value) {
		this.appUrl = value;
	}
	
	public java.lang.String getAppUrl() {
		return this.appUrl;
	}
	public void setUpdateInfo(java.lang.String value) {
		this.updateInfo = value;
	}
	
	public java.lang.String getUpdateInfo() {
		return this.updateInfo;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setIsMustUpdate(java.lang.Integer value) {
		this.isMustUpdate = value;
	}
	
	public java.lang.Integer getIsMustUpdate() {
		return this.isMustUpdate;
	}
	public void setIsDelete(java.lang.Integer value) {
		this.isDelete = value;
	}
	
	public java.lang.Integer getIsDelete() {
		return this.isDelete;
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
		if(obj instanceof AppVersion == false) return false;
		if(this == obj) return true;
		AppVersion other = (AppVersion)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	private  String addTimeStr;

	public String getAddTimeStr() {
		return Cnst.getFormatTime(this.addTime);
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}
}

