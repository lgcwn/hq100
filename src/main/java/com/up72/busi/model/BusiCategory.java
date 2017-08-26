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
 * 类别
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiCategory  implements java.io.Serializable{

	//alias
	public static final String TABLE_ALIAS = "类别";
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
	@NotNull @Max(127)
	private Integer isEnable;
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

	private Integer sortId;

	private Long templateIndex;
	private Long templateList;
	private Long templateDetail;
	private String staticFilePath;
	private Long templateIndexWap;
	private Long templateListWap;
	private Long templateDetailWap;
	private String staticFilePathWap;
	private Integer isStatic;
	private Integer staticFileRule;
	//columns END

	public BusiCategory(){
	}

	public BusiCategory(
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
	public void setIsEnable(Integer value) {
		this.isEnable = value;
	}

	public Integer getIsEnable() {
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

	public Integer getSortId() {
		return sortId;
	}

	public void setSortId(Integer sortId) {
		this.sortId = sortId;
	}

	public Long getTemplateIndex() {
		return templateIndex;
	}

	public void setTemplateIndex(Long templateIndex) {
		this.templateIndex = templateIndex;
	}

	public Long getTemplateList() {
		return templateList;
	}

	public void setTemplateList(Long templateList) {
		this.templateList = templateList;
	}

	public Long getTemplateDetail() {
		return templateDetail;
	}

	public void setTemplateDetail(Long templateDetail) {
		this.templateDetail = templateDetail;
	}

	public Integer getIsStatic() {
		return isStatic;
	}

	public void setIsStatic(Integer isStatic) {
		this.isStatic = isStatic;
	}

	public Integer getStaticFileRule() {
		return staticFileRule;
	}

	public void setStaticFileRule(Integer staticFileRule) {
		this.staticFileRule = staticFileRule;
	}

	public String getStaticFilePath() {
		return staticFilePath;
	}

	public void setStaticFilePath(String staticFilePath) {
		this.staticFilePath = staticFilePath;
	}

	public Long getTemplateIndexWap() {
		return templateIndexWap;
	}

	public void setTemplateIndexWap(Long templateIndexWap) {
		this.templateIndexWap = templateIndexWap;
	}

	public Long getTemplateListWap() {
		return templateListWap;
	}

	public void setTemplateListWap(Long templateListWap) {
		this.templateListWap = templateListWap;
	}

	public Long getTemplateDetailWap() {
		return templateDetailWap;
	}

	public void setTemplateDetailWap(Long templateDetailWap) {
		this.templateDetailWap = templateDetailWap;
	}

	public String getStaticFilePathWap() {
		return staticFilePathWap;
	}

	public void setStaticFilePathWap(String staticFilePathWap) {
		this.staticFilePathWap = staticFilePathWap;
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
		if(obj instanceof BusiCategory == false) return false;
		if(this == obj) return true;
		BusiCategory other = (BusiCategory)obj;
		return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
	}

	private String addTimeStr;

	public String getAddTimeStr() {
		if(this.addTimeStr != null || this.addTime == null) return this.addTimeStr;
		this.addTimeStr = BusiCnst.SDF_TIME.format(new Date(this.addTime));
		return addTimeStr;
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}
}

