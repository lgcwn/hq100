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
 * 平台菜单配置
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Menu  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "平台菜单配置";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_ID_PATH = "所有父级ID [1],[2],[3]";
	public static final String ALIAS_ROOT_ID = "根节点菜单唯一码";
	public static final String ALIAS_PARENT_ID = "父级菜单唯一码";
	public static final String ALIAS_NAME = "菜单名称";
	public static final String ALIAS_ICON = "图标";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_LEVEL = "级别";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_ADD_USER_ID = "添加人ID";
	public static final String ALIAS_OP_TYPE = "操作类型(0 菜单;1 操作)";
	public static final String ALIAS_IS_LEFT = "是否左侧菜单 (0否;1是)";
	public static final String ALIAS_IS_NAV = "是否导航菜单 (0否;1是)";
	public static final String ALIAS_PAGE_URL = "菜单地址";
	public static final String ALIAS_PERMISSION_CODE = "权限码";
	public static final String ALIAS_DOMAIN = "域名";
	public static final String ALIAS_IS_DEL = "是否删除 (0 否;1是)";
	public static final String ALIAS_IS_SYSTEM_MENU = "是否系统菜单(0 否;1是)";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 所有父级ID [1],[2],[3]       db_column: ID_PATH 
     */	
	@Length(max=500)
	private java.lang.String idPath;
    /**
     * 根节点菜单唯一码       db_column: ROOT_ID 
     */	
	@NotNull 
	private java.lang.Long rootId;
    /**
     * 父级菜单唯一码       db_column: PARENT_ID 
     */	
	@NotNull 
	private java.lang.Long parentId;
    /**
     * 菜单名称       db_column: NAME 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String name;
    /**
     * 图标       db_column: ICON 
     */	
	@Length(max=256)
	private java.lang.String icon;
    /**
     * 排序       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Integer sortId;
    /**
     * 级别       db_column: LEVEL 
     */	
	@NotNull 
	private java.lang.Integer level;
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
     * 操作类型(0 菜单;1 操作)       db_column: OP_TYPE 
     */	
	@NotNull 
	private Integer opType;
    /**
     * 是否左侧菜单 (0否;1是)       db_column: IS_LEFT 
     */	
	@NotNull 
	private Integer isLeft;
    /**
     * 是否导航菜单 (0否;1是)       db_column: IS_NAV 
     */	
	@NotNull 
	private Integer isNav;
    /**
     * 菜单地址       db_column: PAGE_URL 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String pageUrl;
    /**
     * 权限码       db_column: PERMISSION_CODE 
     */	
	@NotBlank @Length(max=120)
	private java.lang.String permissionCode;
    /**
     * 域名       db_column: DOMAIN 
     */	
	@Length(max=255)
	private java.lang.String domain;
    /**
     * 是否删除 (0 否;1是)       db_column: IS_DEL 
     */	
	@NotNull 
	private Integer isDel;
    /**
     * 是否系统菜单(0 否;1是)       db_column: IS_SYSTEM_MENU 
     */	
	
	private Integer isSystemMenu;
	//columns END

	public Menu(){
	}

	public Menu(
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
	public void setIdPath(java.lang.String value) {
		this.idPath = value;
	}
	
	public java.lang.String getIdPath() {
		return this.idPath;
	}
	public void setRootId(java.lang.Long value) {
		this.rootId = value;
	}
	
	public java.lang.Long getRootId() {
		return this.rootId;
	}
	public void setParentId(java.lang.Long value) {
		this.parentId = value;
	}
	
	public java.lang.Long getParentId() {
		return this.parentId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setIcon(java.lang.String value) {
		this.icon = value;
	}
	
	public java.lang.String getIcon() {
		return this.icon;
	}
	public void setSortId(java.lang.Integer value) {
		this.sortId = value;
	}
	
	public java.lang.Integer getSortId() {
		return this.sortId;
	}
	public void setLevel(java.lang.Integer value) {
		this.level = value;
	}
	
	public java.lang.Integer getLevel() {
		return this.level;
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
	public void setOpType(Integer value) {
		this.opType = value;
	}
	
	public Integer getOpType() {
		return this.opType;
	}
	public void setIsLeft(Integer value) {
		this.isLeft = value;
	}
	
	public Integer getIsLeft() {
		return this.isLeft;
	}
	public void setIsNav(Integer value) {
		this.isNav = value;
	}
	
	public Integer getIsNav() {
		return this.isNav;
	}
	public void setPageUrl(java.lang.String value) {
		this.pageUrl = value;
	}
	
	public java.lang.String getPageUrl() {
		return this.pageUrl;
	}
	public void setPermissionCode(java.lang.String value) {
		this.permissionCode = value;
	}
	
	public java.lang.String getPermissionCode() {
		return this.permissionCode;
	}
	public void setDomain(java.lang.String value) {
		this.domain = value;
	}
	
	public java.lang.String getDomain() {
		return this.domain;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public void setIsSystemMenu(Integer value) {
		this.isSystemMenu = value;
	}
	
	public Integer getIsSystemMenu() {
		return this.isSystemMenu;
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
		if(obj instanceof Menu == false) return false;
		if(this == obj) return true;
		Menu other = (Menu)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

