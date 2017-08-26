/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.model;

import com.up72.busi.constant.BusiCnst;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * 站点菜单单页模板备份记录
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteMenuBackup implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "站点菜单单页模板备份记录";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SITE_MENU_ID = "菜单id";
	public static final String ALIAS_BAK_NAME = "备份名称";
	public static final String ALIAS_FILE_NAME = "模板名称";
	public static final String ALIAS_FILE_URL = "文件路径";
	public static final String ALIAS_CONTENT = "内容";
	public static final String ALIAS_ADD_USER_ID = "备份人id";
	public static final String ALIAS_ADD_USER_NAME = "addUserName";
	public static final String ALIAS_ADD_TIME = "备份时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private Long id;
    /**
     * 菜单id       db_column: SITE_MENU_ID 
     */	
	@NotNull 
	private Long siteMenuId;
    /**
     * 备份名称       db_column: BAK_NAME 
     */	
	@Length(max=255)
	private String bakName;
    /**
     * 模板名称       db_column: FILE_NAME 
     */	
	@NotBlank @Length(max=255)
	private String fileName;
    /**
     * 文件路径       db_column: FILE_URL 
     */	
	@NotBlank @Length(max=255)
	private String fileUrl;
    /**
     * 内容       db_column: CONTENT 
     */	
	@NotBlank @Length(max=65535)
	private String content;
    /**
     * 备份人id       db_column: ADD_USER_ID 
     */	
	@NotNull 
	private Long addUserId;
    /**
     * addUserName       db_column: ADD_USER_NAME 
     */	
	@Length(max=50)
	private String addUserName;
    /**
     * 备份时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private Long addTime;
	//columns END

	public BusiSiteMenuBackup(){
	}

	public BusiSiteMenuBackup(
			Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setSiteMenuId(Long value) {
		this.siteMenuId = value;
	}
	
	public Long getSiteMenuId() {
		return this.siteMenuId;
	}
	public void setBakName(String value) {
		this.bakName = value;
	}
	
	public String getBakName() {
		return this.bakName;
	}
	public void setFileName(String value) {
		this.fileName = value;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	public void setFileUrl(String value) {
		this.fileUrl = value;
	}
	
	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return this.content;
	}
	public void setAddUserId(Long value) {
		this.addUserId = value;
	}
	
	public Long getAddUserId() {
		return this.addUserId;
	}
	public void setAddUserName(String value) {
		this.addUserName = value;
	}
	
	public String getAddUserName() {
		return this.addUserName;
	}
	public void setAddTime(Long value) {
		this.addTime = value;
	}
	
	public Long getAddTime() {
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
		if(obj instanceof BusiSiteMenuBackup == false) return false;
		if(this == obj) return true;
		BusiSiteMenuBackup other = (BusiSiteMenuBackup)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String addTimeStr;
	public String getAddTimeStr(){
		if(this.addTimeStr != null || this.addTime == null) return this.addTimeStr;
		this.addTimeStr = BusiCnst.SDF_TIME.format(new Date(this.addTime));
		return addTimeStr;
	}
}

