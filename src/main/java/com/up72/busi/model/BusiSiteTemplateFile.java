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

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * 文章模板文件表
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteTemplateFile  implements java.io.Serializable{

	//alias
	public static final String TABLE_ALIAS = "文章模板文件表";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_SITE_TEMPLATE_ID = "模板ID";
	public static final String ALIAS_COMPANY_ID = "企业id";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_FILE_TYPE = "模板类型";
	public static final String ALIAS_FILE_URL = "页面文件路径";
	public static final String ALIAS_CONTENT = "内容";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_ADD_USER_ID = "添加人ID";
	public static final String ALIAS_ADD_USER_NAME = "添加人名称";
	public static final String ALIAS_MODIFY_USER_ID = "修改人ID";
	public static final String ALIAS_MODIFY_TIME = "修改时间";
	public static final String ALIAS_MODIFY_USER_NAME = "修改人";
	public static final String ALIAS_IS_DEL = "是否删除0 否 1是";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_STATUS = "状态 0 停用 1 启用";
	public static final String ALIAS_BAK_CNT = "备份次数";


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/**
	 * ID       db_column: ID
	 */

	private Long id;
	/**
	 * 模板ID       db_column: SITE_TEMPLATE_ID
	 */

	private Long siteTemplateId;
	/**
	 * 企业id       db_column: COMPANY_ID
	 */
	@NotNull
	private Long companyId;
	/**
	 * 名称       db_column: NAME
	 */
	@NotBlank @Length(max=255)
	private String name;
	/**
	 * 模板类型       db_column: FILE_TYPE
	 */
	@NotNull @Max(127)
	private Integer fileType;
	/**
	 * 页面文件路径       db_column: FILE_URL
	 */
	@NotBlank @Length(max=500)
	private String fileUrl;
	/**
	 * 内容       db_column: CONTENT
	 */
	@NotBlank @Length(max=65535)
	private String content;
	/**
	 * 排序       db_column: SORT_ID
	 */
	@NotNull
	private Integer sortId;
	/**
	 * 添加时间       db_column: ADD_TIME
	 */
	@NotNull
	private Long addTime;
	/**
	 * 添加人ID       db_column: ADD_USER_ID
	 */
	@NotNull
	private Long addUserId;
	/**
	 * 添加人名称       db_column: ADD_USER_NAME
	 */
	@Length(max=50)
	private String addUserName;
	/**
	 * 修改人ID       db_column: MODIFY_USER_ID
	 */
	@NotNull
	private Long modifyUserId;
	/**
	 * 修改时间       db_column: MODIFY_TIME
	 */
	@NotNull
	private Long modifyTime;
	/**
	 * 修改人       db_column: MODIFY_USER_NAME
	 */
	@NotBlank @Length(max=50)
	private String modifyUserName;
	/**
	 * 是否删除0 否 1是       db_column: IS_DEL
	 */
	@NotNull @Max(127)
	private Integer isDel;
	/**
	 * 备注       db_column: REMARK
	 */
	@Length(max=255)
	private String remark;
	/**
	 * 状态 0 停用 1 启用       db_column: STATUS
	 */

	private Integer status;
	/**
	 * 备份次数       db_column: BAK_CNT
	 */
	@NotNull
	private Integer bakCnt;
	//columns END
	/**
	 * 是否默认       db_column: IS_DEFAULT
	 */
	@NotNull
	private Integer isDefault;

	public BusiSiteTemplateFile(){
	}

	public BusiSiteTemplateFile(
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
	public void setSiteTemplateId(Long value) {
		this.siteTemplateId = value;
	}

	public Long getSiteTemplateId() {
		return this.siteTemplateId;
	}
	public void setCompanyId(Long value) {
		this.companyId = value;
	}

	public Long getCompanyId() {
		return this.companyId;
	}
	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}
	public void setFileType(Integer value) {
		this.fileType = value;
	}

	public Integer getFileType() {
		return this.fileType;
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
	public void setSortId(Integer value) {
		this.sortId = value;
	}

	public Integer getSortId() {
		return this.sortId;
	}
	public void setAddTime(Long value) {
		this.addTime = value;
	}

	public Long getAddTime() {
		return this.addTime;
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
	public void setModifyUserId(Long value) {
		this.modifyUserId = value;
	}

	public Long getModifyUserId() {
		return this.modifyUserId;
	}
	public void setModifyTime(Long value) {
		this.modifyTime = value;
	}

	public Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyUserName(String value) {
		this.modifyUserName = value;
	}

	public String getModifyUserName() {
		return this.modifyUserName;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}

	public Integer getIsDel() {
		return this.isDel;
	}
	public void setRemark(String value) {
		this.remark = value;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}

	public Integer getStatus() {
		return this.status;
	}
	public void setBakCnt(Integer value) {
		this.bakCnt = value;
	}

	public Integer getBakCnt() {
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
		if(obj instanceof BusiSiteTemplateFile == false) return false;
		if(this == obj) return true;
		BusiSiteTemplateFile other = (BusiSiteTemplateFile)obj;
		return new EqualsBuilder()
				.append(getId(), other.getId())
				.isEquals();
	}

	private String addTimeStr;
	private String modifyTimeStr;

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}
	public String getAddTimeStr() {
		if(this.addTimeStr != null || this.addTime == null) return this.addTimeStr;
		this.addTimeStr = BusiCnst.SDF_TIME.format(new Date(this.addTime));
		return addTimeStr;
	}

	public String getModifyTimeStr() {
		if(this.modifyTimeStr != null || this.modifyTime == null) return this.modifyTimeStr;
		this.modifyTimeStr = BusiCnst.SDF_TIME.format(new Date(this.modifyTime));
		return modifyTimeStr;
	}

	public void setModifyTimeStr(String modifyTimeStr) {
		this.modifyTimeStr = modifyTimeStr;
	}
}
