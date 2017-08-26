/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.req;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


/**
 * 文章模板表输入
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteTemplateReq implements java.io.Serializable{
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /** 序列       db_column: ID  */
	
	private Long id;
    /** 模板名称       db_column: NAME  */
	@NotBlank @Length(max=50)
	private String name;
    /** 企业id       db_column: COMPANY_ID  */
	@NotNull 
	private Long companyId;
    /** 类型，0非公用，1公用       db_column: TYPE  */
	@NotNull @Max(127)
	private Integer type;
    /** 排序       db_column: SORT_ID  */
	@NotNull 
	private Integer sortId;
    /** 添加时间       db_column: ADD_TIME  */
	@NotNull 
	private Long addTime;
    /** 添加人ID       db_column: ADD_USER_ID  */
	@NotNull 
	private Long addUserId;
    /** 添加人名称       db_column: ADD_USER_NAME  */
	@Length(max=50)
	private String addUserName;
    /** 修改人id       db_column: MODIFY_USER_ID  */
	@NotNull 
	private Long modifyUserId;
    /** 修改人名称       db_column: MODIFY_USER_NAME  */
	@Length(max=50)
	private String modifyUserName;
    /** 最后修改时间       db_column: MODIFY_TIME  */
	@NotNull 
	private Long modifyTime;
    /** 是否删除0 否 1是       db_column: IS_DEL  */
	@NotNull @Max(127)
	private Integer isDel;
    /** 备注       db_column: REMARK  */
	@Length(max=255)
	private String remark;
	//columns END

	public BusiSiteTemplateReq(){
	}

	public BusiSiteTemplateReq(
			Long id
	){
		this.id = id;
	}

	public BusiSiteTemplateReq setId(Long value) {
		this.id = value;
		return this;
	}
	
	public Long getId() {
		return this.id;
	}
	public BusiSiteTemplateReq setName(String value) {
		this.name = value;
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	public BusiSiteTemplateReq setCompanyId(Long value) {
		this.companyId = value;
		return this;
	}
	
	public Long getCompanyId() {
		return this.companyId;
	}
	public BusiSiteTemplateReq setType(Integer value) {
		this.type = value;
		return this;
	}
	
	public Integer getType() {
		return this.type;
	}
	public BusiSiteTemplateReq setSortId(Integer value) {
		this.sortId = value;
		return this;
	}
	
	public Integer getSortId() {
		return this.sortId;
	}
	public BusiSiteTemplateReq setAddTime(Long value) {
		this.addTime = value;
		return this;
	}
	
	public Long getAddTime() {
		return this.addTime;
	}
	public BusiSiteTemplateReq setAddUserId(Long value) {
		this.addUserId = value;
		return this;
	}
	
	public Long getAddUserId() {
		return this.addUserId;
	}
	public BusiSiteTemplateReq setAddUserName(String value) {
		this.addUserName = value;
		return this;
	}
	
	public String getAddUserName() {
		return this.addUserName;
	}
	public BusiSiteTemplateReq setModifyUserId(Long value) {
		this.modifyUserId = value;
		return this;
	}
	
	public Long getModifyUserId() {
		return this.modifyUserId;
	}
	public BusiSiteTemplateReq setModifyUserName(String value) {
		this.modifyUserName = value;
		return this;
	}
	
	public String getModifyUserName() {
		return this.modifyUserName;
	}
	public BusiSiteTemplateReq setModifyTime(Long value) {
		this.modifyTime = value;
		return this;
	}
	
	public Long getModifyTime() {
		return this.modifyTime;
	}
	public BusiSiteTemplateReq setIsDel(Integer value) {
		this.isDel = value;
		return this;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public BusiSiteTemplateReq setRemark(String value) {
		this.remark = value;
		return this;
	}
	
	public String getRemark() {
		return this.remark;
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
		if(obj instanceof BusiSiteTemplateReq == false) return false;
		if(this == obj) return true;
		BusiSiteTemplateReq other = (BusiSiteTemplateReq)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

