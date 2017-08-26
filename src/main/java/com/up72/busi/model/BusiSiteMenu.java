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
 * 站点菜单
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteMenu  implements java.io.Serializable{

	//alias
	public static final String TABLE_ALIAS = "站点菜单";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_COMPANY_ID = "企业id";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_PARENT_ID = "父级id";
	public static final String ALIAS_ROOT_ID = "根路径";
	public static final String ALIAS_ID_PATH = "id路径[1],[2],[3]";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_LEVEL = "级别";
	public static final String ALIAS_IS_SHOW = "是否展示给企业";
	public static final String ALIAS_TYPE = "类型,0单页非控件，1单页控件，2文章系统";
	public static final String ALIAS_FILE_NAME = "模板名称（单页）";
	public static final String ALIAS_FILE_URL = "模板文件地址(单页)";
	public static final String ALIAS_CONTENT = "模板内容(单页)";
	public static final String ALIAS_CONTROL_CNT = "控件个数";
	public static final String ALIAS_SITE_TEMPLATE_ID = "文章模板id";
	public static final String ALIAS_SITE_WAP_TEMPLATE_ID = "移动文章模板id";
	public static final String ALIAS_IS_DEL = "是否删除";
	public static final String ALIAS_ADD_USER_ID = "添加用户id";
	public static final String ALIAS_ADD_USER_NAME = "添加用户名称";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_CORRELATION_ID = "文章系统关联ID";
	public static final String ALIAS_IS_STATIC = "是否静态化";


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/**
	 * id       db_column: ID
	 */

	private Long id;
	/**
	 * 企业id       db_column: COMPANY_ID
	 */
	@NotNull
	private Long companyId;
	/**
	 * 名称       db_column: NAME
	 */
	@NotBlank @Length(max=256)
	private String name;
	/**
	 * 父级id       db_column: PARENT_ID
	 */
	@NotNull
	private Long parentId;
	/**
	 * 根路径       db_column: ROOT_ID
	 */
	@NotNull
	private Long rootId;
	/**
	 * id路径[1],[2],[3]       db_column: ID_PATH
	 */
	@NotBlank @Length(max=500)
	private String idPath;
	/**
	 * 排序       db_column: SORT_ID
	 */
	@NotNull
	private Integer sortId;
	/**
	 * 级别       db_column: LEVEL
	 */
	@NotNull
	private Integer level;
	/**
	 * 是否展示给企业       db_column: IS_SHOW
	 */
	@NotNull
	private Integer isShow;
	/**
	 * 类型,0单页非控件，1单页控件，2文章系统       db_column: TYPE
	 */
	@NotNull @Max(127)
	private Integer type;
	/**
	 * 模板名称（单页）       db_column: FILE_NAME
	 */
	@Length(max=255)
	private String fileName;
	/**
	 * 模板文件地址(单页)       db_column: FILE_URL
	 */
	@Length(max=500)
	private String fileUrl;
	/**
	 * 模板内容(单页)       db_column: CONTENT
	 */
	@Length(max=65535)
	private String content;
	/**
	 * 控件个数       db_column: CONTROL_CNT
	 */

	private Integer controlCnt;
	/**
	 * 文章模板id       db_column: SITE_TEMPLATE_ID
	 */

	private Long siteTemplateId;
	private Long siteWapTemplateId;
	/**
	 * 是否删除       db_column: IS_DEL
	 */
	@NotNull
	private Integer isDel;
	/**
	 * 添加用户id       db_column: ADD_USER_ID
	 */
	@NotNull
	private Long addUserId;
	/**
	 * 添加用户名称       db_column: ADD_USER_NAME
	 */
	@NotBlank @Length(max=50)
	private String addUserName;
	/**
	 * 添加时间       db_column: ADD_TIME
	 */
	@NotNull
	private Long addTime;

	@NotNull
	private Long correlationId;

	@NotNull
	private Integer isPc;
	@NotNull
	private Integer isWap;

	@NotNull
	private Integer isStatic;

	//columns END

	public BusiSiteMenu(){
	}

	public BusiSiteMenu(
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
	public void setParentId(Long value) {
		this.parentId = value;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setRootId(Long value) {
		this.rootId = value;
	}

	public Long getRootId() {
		return this.rootId;
	}
	public void setIdPath(String value) {
		this.idPath = value;
	}

	public String getIdPath() {
		return this.idPath;
	}
	public void setSortId(Integer value) {
		this.sortId = value;
	}

	public Integer getSortId() {
		return this.sortId;
	}
	public void setLevel(Integer value) {
		this.level = value;
	}

	public Integer getLevel() {
		return this.level;
	}
	public void setIsShow(Integer value) {
		this.isShow = value;
	}

	public Integer getIsShow() {
		return this.isShow;
	}
	public void setType(Integer value) {
		this.type = value;
	}

	public Integer getType() {
		return this.type;
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
	public void setControlCnt(Integer value) {
		this.controlCnt = value;
	}

	public Integer getControlCnt() {
		return this.controlCnt;
	}
	public void setSiteTemplateId(Long value) {
		this.siteTemplateId = value;
	}

	public Long getSiteTemplateId() {
		return this.siteTemplateId;
	}

	public Long getSiteWapTemplateId() {
		return siteWapTemplateId;
	}

	public void setSiteWapTemplateId(Long siteWapTemplateId) {
		this.siteWapTemplateId = siteWapTemplateId;
	}

	public void setIsDel(Integer value) {
		this.isDel = value;
	}

	public Integer getIsDel() {
		return this.isDel;
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


	public Long getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(Long correlationId) {
		this.correlationId = correlationId;
	}


	public Integer getIsPc() {
		return isPc;
	}

	public void setIsPc(Integer isPc) {
		this.isPc = isPc;
	}

	public Integer getIsWap() {
		return isWap;
	}

	public void setIsWap(Integer isWap) {
		this.isWap = isWap;
	}

	public Integer getIsStatic() {
		return isStatic;
	}

	public void setIsStatic(Integer isStatic) {
		this.isStatic = isStatic;
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
		if(obj instanceof BusiSiteMenu == false) return false;
		if(this == obj) return true;
		BusiSiteMenu other = (BusiSiteMenu)obj;
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
}

