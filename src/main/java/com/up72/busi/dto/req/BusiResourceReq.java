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
 * 文章输入
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiResourceReq  implements java.io.Serializable{
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 分类       db_column: CATEGORY_ID 
     */	
	@NotNull 
	private java.lang.Long categoryId;
    /**
     * 站点菜单id       db_column: SITE_MENU_ID 
     */	
	@NotNull 
	private java.lang.Long siteMenuId;
    /**
     * 标题       db_column: TITLE 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String title;
    /**
     * 副标题       db_column: SUB_TITLE 
     */	
	@Length(max=255)
	private java.lang.String subTitle;
    /**
     * 短标题       db_column: SHORT_TITLE 
     */	
	@Length(max=256)
	private java.lang.String shortTitle;
    /**
     * 摘要       db_column: SUMMARY 
     */	
	@Length(max=500)
	private java.lang.String summary;
    /**
     * 外联地址       db_column: OUT_LINK 
     */	
	@Length(max=255)
	private java.lang.String outLink;
    /**
     * 文章正文       db_column: CONTENT 
     */	
	@Length(max=16777215)
	private java.lang.String content;
    /**
     * 来源       db_column: SOURCE 
     */	
	@Length(max=255)
	private java.lang.String source;
    /**
     * 作者       db_column: AUTHOR 
     */	
	@Length(max=100)
	private java.lang.String author;
    /**
     * 标签,多个“,”分割       db_column: LABELS 
     */	
	@Length(max=500)
	private java.lang.String labels;
    /**
     * 发表时间       db_column: PUBLISH_TIME 
     */	
	@Length(max=100)
	private java.lang.String publishTime;
    /**
     * 是否删除       db_column: IS_DEL 
     */	
	@NotNull @Max(127)
	private Integer isDel;
    /**
     * 删除人id       db_column: DEL_USER_ID 
     */	
	
	private java.lang.Long delUserId;
    /**
     * 删除人名称       db_column: DEL_USER_NAME 
     */	
	@Length(max=50)
	private java.lang.String delUserName;
    /**
     * 删除时间       db_column: DEL_TIME 
     */	
	
	private java.lang.Long delTime;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 添加人id       db_column: ADD_USER_ID 
     */	
	
	private java.lang.Long addUserId;
    /**
     * 添加人名称       db_column: ADD_USER_NAME 
     */	
	@Length(max=50)
	private java.lang.String addUserName;
    /**
     * 编辑时间       db_column: EDIT_TIME 
     */	
	
	private java.lang.Long editTime;
    /**
     * 是否已审核       db_column: IS_AUDITING 
     */	
	@NotNull @Max(127)
	private Integer isAuditing;
    /**
     * 是否已发布       db_column: IS_ISSUE 
     */	
	@NotNull @Max(127)
	private Integer isIssue;
    /**
     * 发布时间       db_column: ISSUE_TIME 
     */	
	
	private java.lang.Long issueTime;
    /**
     * 唯一ID       db_column: UUID 
     */	
	@NotBlank @Length(max=32)
	private java.lang.String uuid;
    /**
     * 发布地址       db_column: ISSUE_LINK 
     */	
	@Length(max=256)
	private java.lang.String issueLink;
    /**
     * 企业id       db_column: COMPANY_ID 
     */	
	@NotNull 
	private java.lang.Long companyId;
    /**
     * 图片       db_column: IMG 
     */	
	@Length(max=255)
	private java.lang.String img;
	//columns END

	public BusiResourceReq(){
	}

	public BusiResourceReq(
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
	public void setCategoryId(java.lang.Long value) {
		this.categoryId = value;
	}
	
	public java.lang.Long getCategoryId() {
		return this.categoryId;
	}
	public void setSiteMenuId(java.lang.Long value) {
		this.siteMenuId = value;
	}
	
	public java.lang.Long getSiteMenuId() {
		return this.siteMenuId;
	}
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setSubTitle(java.lang.String value) {
		this.subTitle = value;
	}
	
	public java.lang.String getSubTitle() {
		return this.subTitle;
	}
	public void setShortTitle(java.lang.String value) {
		this.shortTitle = value;
	}
	
	public java.lang.String getShortTitle() {
		return this.shortTitle;
	}
	public void setSummary(java.lang.String value) {
		this.summary = value;
	}
	
	public java.lang.String getSummary() {
		return this.summary;
	}
	public void setOutLink(java.lang.String value) {
		this.outLink = value;
	}
	
	public java.lang.String getOutLink() {
		return this.outLink;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setSource(java.lang.String value) {
		this.source = value;
	}
	
	public java.lang.String getSource() {
		return this.source;
	}
	public void setAuthor(java.lang.String value) {
		this.author = value;
	}
	
	public java.lang.String getAuthor() {
		return this.author;
	}
	public void setLabels(java.lang.String value) {
		this.labels = value;
	}
	
	public java.lang.String getLabels() {
		return this.labels;
	}
	public void setPublishTime(java.lang.String value) {
		this.publishTime = value;
	}
	
	public java.lang.String getPublishTime() {
		return this.publishTime;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public void setDelUserId(java.lang.Long value) {
		this.delUserId = value;
	}
	
	public java.lang.Long getDelUserId() {
		return this.delUserId;
	}
	public void setDelUserName(java.lang.String value) {
		this.delUserName = value;
	}
	
	public java.lang.String getDelUserName() {
		return this.delUserName;
	}
	public void setDelTime(java.lang.Long value) {
		this.delTime = value;
	}
	
	public java.lang.Long getDelTime() {
		return this.delTime;
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
	public void setEditTime(java.lang.Long value) {
		this.editTime = value;
	}
	
	public java.lang.Long getEditTime() {
		return this.editTime;
	}
	public void setIsAuditing(Integer value) {
		this.isAuditing = value;
	}
	
	public Integer getIsAuditing() {
		return this.isAuditing;
	}
	public void setIsIssue(Integer value) {
		this.isIssue = value;
	}
	
	public Integer getIsIssue() {
		return this.isIssue;
	}
	public void setIssueTime(java.lang.Long value) {
		this.issueTime = value;
	}
	
	public java.lang.Long getIssueTime() {
		return this.issueTime;
	}
	public void setUuid(java.lang.String value) {
		this.uuid = value;
	}
	
	public java.lang.String getUuid() {
		return this.uuid;
	}
	public void setIssueLink(java.lang.String value) {
		this.issueLink = value;
	}
	
	public java.lang.String getIssueLink() {
		return this.issueLink;
	}
	public void setCompanyId(java.lang.Long value) {
		this.companyId = value;
	}
	
	public java.lang.Long getCompanyId() {
		return this.companyId;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
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
		if(obj instanceof BusiResourceReq == false) return false;
		if(this == obj) return true;
		BusiResourceReq other = (BusiResourceReq)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

