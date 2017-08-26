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
 * 
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Category  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "Category";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SITE_MENU_ID = "站点菜单id";
	public static final String ALIAS_COMPANY_ID = "企业id";
	public static final String ALIAS_NAME = "分类名称";
	public static final String ALIAS_PARENT_ID = "父分类";
	public static final String ALIAS_ROOT_ID = "跟分类";
	public static final String ALIAS_LEVEL = "层级";
	public static final String ALIAS_ID_PATH = "类别路径[1],[2],[3]";
	public static final String ALIAS_IS_ENABLE = "是否启用";
	public static final String ALIAS_IS_DEL = "是否删除";
	public static final String ALIAS_ISSUE_CNT = "发布数量";
	public static final String ALIAS_NOT_ISSUE_CNT = "未发布数量";
	public static final String ALIAS_AUDITING_CNT = "审核数量";
	public static final String ALIAS_NOT_AUDITING_CNT = "未审核数量";
	public static final String ALIAS_ADD_USER_ID = "添加用户id";
	public static final String ALIAS_ADD_USER_NAME = "添加用户名称";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_SORT_ID = "排序字段";
	public static final String ALIAS_TEMPLATE_INDEX = "首页模板";
	public static final String ALIAS_TEMPLATE_LIST = "列表页模板";
	public static final String ALIAS_TEMPLATE_DETAIL = "详细页模板";
	public static final String ALIAS_STATIC_FILE_PATH = "静态文件目录";
	public static final String ALIAS_TEMPLATE_INDEX_WAP = "首页模板_移动";
	public static final String ALIAS_TEMPLATE_LIST_WAP = "列表页模板_移动";
	public static final String ALIAS_TEMPLATE_DETAIL_WAP = "详细页模板_移动";
	public static final String ALIAS_STATIC_FILE_PATH_WAP = "静态文件目录_移动";
	public static final String ALIAS_IS_STATIC = "是否静态化";
	public static final String ALIAS_STATIC_FILE_RULE = "静态文件生成规则;0不分子目录,1按年度划分目录，2按年/月划分子目录，3按年月日划分子目录";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 站点菜单id       db_column: SITE_MENU_ID 
     */	
	@NotNull 
	private java.lang.Long siteMenuId;
    /**
     * 企业id       db_column: COMPANY_ID 
     */	
	@NotNull 
	private java.lang.Long companyId;
    /**
     * 分类名称       db_column: NAME 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String name;
    /**
     * 父分类       db_column: PARENT_ID 
     */	
	@NotNull 
	private java.lang.Long parentId;
    /**
     * 跟分类       db_column: ROOT_ID 
     */	
	@NotNull 
	private java.lang.Long rootId;
    /**
     * 层级       db_column: LEVEL 
     */	
	@NotNull @Max(127)
	private Integer level;
    /**
     * 类别路径[1],[2],[3]       db_column: ID_PATH 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String idPath;
    /**
     * 是否启用       db_column: IS_ENABLE 
     */	
	@NotNull 
	private java.lang.Integer isEnable;
    /**
     * 是否删除       db_column: IS_DEL 
     */	
	@NotNull @Max(127)
	private Integer isDel;
    /**
     * 发布数量       db_column: ISSUE_CNT 
     */	
	@NotNull 
	private java.lang.Integer issueCnt;
    /**
     * 未发布数量       db_column: NOT_ISSUE_CNT 
     */	
	@NotNull 
	private java.lang.Integer notIssueCnt;
    /**
     * 审核数量       db_column: AUDITING_CNT 
     */	
	@NotNull 
	private java.lang.Integer auditingCnt;
    /**
     * 未审核数量       db_column: NOT_AUDITING_CNT 
     */	
	@NotNull 
	private java.lang.Integer notAuditingCnt;
    /**
     * 添加用户id       db_column: ADD_USER_ID 
     */	
	@NotNull 
	private java.lang.Long addUserId;
    /**
     * 添加用户名称       db_column: ADD_USER_NAME 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String addUserName;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 排序字段       db_column: SORT_ID 
     */	
	
	private java.lang.Integer sortId;
    /**
     * 首页模板       db_column: TEMPLATE_INDEX 
     */	
	
	private java.lang.Long templateIndex;
    /**
     * 列表页模板       db_column: TEMPLATE_LIST 
     */	
	
	private java.lang.Long templateList;
    /**
     * 详细页模板       db_column: TEMPLATE_DETAIL 
     */	
	
	private java.lang.Long templateDetail;
    /**
     * 静态文件目录       db_column: STATIC_FILE_PATH 
     */	
	@Length(max=200)
	private java.lang.String staticFilePath;
    /**
     * 首页模板_移动       db_column: TEMPLATE_INDEX_WAP 
     */	
	
	private java.lang.Long templateIndexWap;
    /**
     * 列表页模板_移动       db_column: TEMPLATE_LIST_WAP 
     */	
	
	private java.lang.Long templateListWap;
    /**
     * 详细页模板_移动       db_column: TEMPLATE_DETAIL_WAP 
     */	
	
	private java.lang.Long templateDetailWap;
    /**
     * 静态文件目录_移动       db_column: STATIC_FILE_PATH_WAP 
     */	
	@Length(max=256)
	private java.lang.String staticFilePathWap;
    /**
     * 是否静态化       db_column: IS_STATIC 
     */	
	
	private java.lang.Integer isStatic;
    /**
     * 静态文件生成规则;0不分子目录,1按年度划分目录，2按年/月划分子目录，3按年月日划分子目录       db_column: STATIC_FILE_RULE 
     */	
	@Max(127)
	private Integer staticFileRule;
	//columns END

	public Category(){
	}

	public Category(
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
	public void setSiteMenuId(java.lang.Long value) {
		this.siteMenuId = value;
	}
	
	public java.lang.Long getSiteMenuId() {
		return this.siteMenuId;
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
	public void setParentId(java.lang.Long value) {
		this.parentId = value;
	}
	
	public java.lang.Long getParentId() {
		return this.parentId;
	}
	public void setRootId(java.lang.Long value) {
		this.rootId = value;
	}
	
	public java.lang.Long getRootId() {
		return this.rootId;
	}
	public void setLevel(Integer value) {
		this.level = value;
	}
	
	public Integer getLevel() {
		return this.level;
	}
	public void setIdPath(java.lang.String value) {
		this.idPath = value;
	}
	
	public java.lang.String getIdPath() {
		return this.idPath;
	}
	public void setIsEnable(java.lang.Integer value) {
		this.isEnable = value;
	}
	
	public java.lang.Integer getIsEnable() {
		return this.isEnable;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public void setIssueCnt(java.lang.Integer value) {
		this.issueCnt = value;
	}
	
	public java.lang.Integer getIssueCnt() {
		return this.issueCnt;
	}
	public void setNotIssueCnt(java.lang.Integer value) {
		this.notIssueCnt = value;
	}
	
	public java.lang.Integer getNotIssueCnt() {
		return this.notIssueCnt;
	}
	public void setAuditingCnt(java.lang.Integer value) {
		this.auditingCnt = value;
	}
	
	public java.lang.Integer getAuditingCnt() {
		return this.auditingCnt;
	}
	public void setNotAuditingCnt(java.lang.Integer value) {
		this.notAuditingCnt = value;
	}
	
	public java.lang.Integer getNotAuditingCnt() {
		return this.notAuditingCnt;
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
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setSortId(java.lang.Integer value) {
		this.sortId = value;
	}
	
	public java.lang.Integer getSortId() {
		return this.sortId;
	}
	public void setTemplateIndex(java.lang.Long value) {
		this.templateIndex = value;
	}
	
	public java.lang.Long getTemplateIndex() {
		return this.templateIndex;
	}
	public void setTemplateList(java.lang.Long value) {
		this.templateList = value;
	}
	
	public java.lang.Long getTemplateList() {
		return this.templateList;
	}
	public void setTemplateDetail(java.lang.Long value) {
		this.templateDetail = value;
	}
	
	public java.lang.Long getTemplateDetail() {
		return this.templateDetail;
	}
	public void setStaticFilePath(java.lang.String value) {
		this.staticFilePath = value;
	}
	
	public java.lang.String getStaticFilePath() {
		return this.staticFilePath;
	}
	public void setTemplateIndexWap(java.lang.Long value) {
		this.templateIndexWap = value;
	}
	
	public java.lang.Long getTemplateIndexWap() {
		return this.templateIndexWap;
	}
	public void setTemplateListWap(java.lang.Long value) {
		this.templateListWap = value;
	}
	
	public java.lang.Long getTemplateListWap() {
		return this.templateListWap;
	}
	public void setTemplateDetailWap(java.lang.Long value) {
		this.templateDetailWap = value;
	}
	
	public java.lang.Long getTemplateDetailWap() {
		return this.templateDetailWap;
	}
	public void setStaticFilePathWap(java.lang.String value) {
		this.staticFilePathWap = value;
	}
	
	public java.lang.String getStaticFilePathWap() {
		return this.staticFilePathWap;
	}
	public void setIsStatic(java.lang.Integer value) {
		this.isStatic = value;
	}
	
	public java.lang.Integer getIsStatic() {
		return this.isStatic;
	}
	public void setStaticFileRule(Integer value) {
		this.staticFileRule = value;
	}
	
	public Integer getStaticFileRule() {
		return this.staticFileRule;
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
		if(obj instanceof Category == false) return false;
		if(this == obj) return true;
		Category other = (Category)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

