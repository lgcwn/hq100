/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.model;

import com.up72.hq.constant.Cnst;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;


/**
 * 信息表
 * 
 * @author LIUGUICHENG
 * @version 1.0
 * @since 1.0
 */
public class Information implements java.io.Serializable{
	//alias
	public static final String TABLE_ALIAS = "信息表";
	public static final String ALIAS_ID = "主键ID";
	public static final String ALIAS_TYPE = "类型";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_ENABLED = "是否禁用 0为禁用 1为开启";
	public static final String ALIAS_IMGS = "首页图片";


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键ID       db_column: ID
     */

	private Long id;
    /**
     * l类型       db_column: TYPE
     */
	@NotNull
	private Integer type;
    /**
     * 标题       db_column: TITLE
     */
	@Length(max=500)
	private String title;
    /**
     * 添加时间       db_column: ADD_TIME
     */
	@NotNull
	private Long addTime;
	/**
	 * 编辑时间       db_column: EDIT_TIME
	 */
	private Long editTime;
    /**
     * 是否禁用 0为开启 1为禁用       db_column: ENABLED
     */
	@NotNull
	private Integer enabled=0;
    /**
     * 首页图片       db_column: IMGS
     */

	private String imgs;

	/** 内容       数据库字段: CONTENT */
	@Length(max=16777215)
	private String content;
	//columns END

	/**
	 * 邮箱    db_column: EMAIL
	 */
	@Length(max=50)
	private String email;

	/**
	 * 邮箱    db_column: CONTACT_PHONE
	 */
	@Length(max=20)
	private String contactPhone;

	public Information(){
	}

	public Information(
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
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setAddTime(Long value) {
		this.addTime = value;
	}
	
	public Long getAddTime() {
		return this.addTime;
	}
	public void setEnabled(Integer value) {
		this.enabled = value;
	}
	
	public Integer getEnabled() {
		return this.enabled;
	}

	public String getImgs() {
		return imgs;
	}

	public void setImgs(String imgs) {
		this.imgs = imgs;
	}

	public Long getEditTime() {
		return editTime;
	}

	public void setEditTime(Long editTime) {
		this.editTime = editTime;
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
		if(obj instanceof Information == false) return false;
		if(this == obj) return true;
		Information other = (Information)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private  String addTimeStr;
	private  String editTimeStr;
	private  String addTimeDateStr;

	public String getAddTimeStr() {
		return Cnst.getFormatTime(this.addTime);
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public String getEditTimeStr() {
		return Cnst.getFormatTime(this.editTime);
	}

	public void setEditTimeStr(String editTimeStr) {
		this.editTimeStr = editTimeStr;
	}

	public String getAddTimeDateStr() {
		return Cnst.getFormatDate(this.addTime);
	}

	public void setAddTimeDateStr(String addTimeDateStr) {
		this.addTimeDateStr = addTimeDateStr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	/**
	 * 获取首页轮播图
	 * @return
	 */
	public String[] getImgsList() {
		String[] imgArr = new String[0];
		if( StringUtils.isNotBlank(this.imgs) ) {
			imgArr = this.imgs.split(",");
		}
		return imgArr;
	}

}

