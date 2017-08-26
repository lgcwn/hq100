/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.req;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;



/**
 * 文章模板文件表输入
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteTemplateFileReq  implements java.io.Serializable{
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 模板ID       db_column: SITE_TEMPLATE_ID 
     */	
	
	private java.lang.Long siteTemplateId;
    /**
     * 企业id       db_column: COMPANY_ID 
     */	
	@NotNull 
	private java.lang.Long companyId;
    /**
     * 名称       db_column: NAME 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String name;
    /**
     * 模板类型,0首页模板,1类别首页模板,2文章列表页模板,3文章详细页模板       db_column: FILE_TYPE 
     */	
	@NotNull @Max(127)
	private Integer fileType;
    /**
     * 页面文件路径       db_column: FILE_URL 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String fileUrl;
    /**
     * 内容       db_column: CONTENT 
     */	
	@NotBlank @Length(max=65535)
	private java.lang.String content;
    /**
     * 排序       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Integer sortId;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 添加人ID       db_column: ADD_USER_ID 
     */	
	@NotNull 
	private java.lang.Long addUserId;
    /**
     * 添加人名称       db_column: ADD_USER_NAME 
     */	
	@Length(max=50)
	private java.lang.String addUserName;
    /**
     * 修改人ID       db_column: MODIFY_USER_ID 
     */	
	@NotNull 
	private java.lang.Long modifyUserId;
    /**
     * 修改时间       db_column: MODIFY_TIME 
     */	
	@NotNull 
	private java.lang.Long modifyTime;
    /**
     * 修改人       db_column: MODIFY_USER_NAME 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String modifyUserName;
    /**
     * 是否删除0 否 1是       db_column: IS_DEL 
     */	
	@NotNull @Max(127)
	private Integer isDel;
    /**
     * 备注       db_column: REMARK 
     */	
	@Length(max=255)
	private java.lang.String remark;
    /**
     * 状态 0 停用 1 启用       db_column: STATUS 
     */	
	
	private java.lang.Integer status;
    /**
     * 备份次数       db_column: BAK_CNT 
     */	
	@NotNull 
	private java.lang.Integer bakCnt;
    /**
     * 是否默认       db_column: IS_DEFAULT 
     */	
	@NotNull 
	private Integer isDefault;
	//columns END

	public BusiSiteTemplateFileReq(){
	}

	public BusiSiteTemplateFileReq(
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
	public void setSiteTemplateId(java.lang.Long value) {
		this.siteTemplateId = value;
	}
	
	public java.lang.Long getSiteTemplateId() {
		return this.siteTemplateId;
	}
	public void setCompanyId(java.lang.Long value) {
		this.companyId = value;
	}
	
	public java.lang.Long getCompanyId() {
		return this.companyId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setFileType(Integer value) {
		this.fileType = value;
	}
	
	public Integer getFileType() {
		return this.fileType;
	}
	public void setFileUrl(java.lang.String value) {
		this.fileUrl = value;
	}
	
	public java.lang.String getFileUrl() {
		return this.fileUrl;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setSortId(java.lang.Integer value) {
		this.sortId = value;
	}
	
	public java.lang.Integer getSortId() {
		return this.sortId;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setAddUserId(java.lang.Long value) {
		this.addUserId = value;
	}
	
	public java.lang.Long getAddUserId() {
		return this.addUserId;
	}
	public void setAddUserName(java.lang.String value) {
		this.addUserName = value;
	}
	
	public java.lang.String getAddUserName() {
		return this.addUserName;
	}
	public void setModifyUserId(java.lang.Long value) {
		this.modifyUserId = value;
	}
	
	public java.lang.Long getModifyUserId() {
		return this.modifyUserId;
	}
	public void setModifyTime(java.lang.Long value) {
		this.modifyTime = value;
	}
	
	public java.lang.Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyUserName(java.lang.String value) {
		this.modifyUserName = value;
	}
	
	public java.lang.String getModifyUserName() {
		return this.modifyUserName;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	public java.lang.Integer getStatus() {
		return this.status;
	}
	public void setBakCnt(java.lang.Integer value) {
		this.bakCnt = value;
	}
	
	public java.lang.Integer getBakCnt() {
		return this.bakCnt;
	}
	public void setIsDefault(Integer value) {
		this.isDefault = value;
	}
	
	public Integer getIsDefault() {
		return this.isDefault;
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
		if(obj instanceof BusiSiteTemplateFileReq == false) return false;
		if(this == obj) return true;
		BusiSiteTemplateFileReq other = (BusiSiteTemplateFileReq)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

