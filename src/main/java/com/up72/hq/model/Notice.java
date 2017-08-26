/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;


/**
 * 活动，公告，案例
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Notice implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "活动，公告，案例，关于我们，轮播图";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_CONTENT = "内容";
	public static final String ALIAS_IMG_URL = "图片";
	public static final String ALIAS_BEGINTIME = "活动开始时间";
	public static final String ALIAS_ADDRESS = "地址";
	public static final String ALIAS_STATUS = "状态";
	public static final String ALIAS_ADDTIME = "录入时间";
	public static final String ALIAS_LASTUPDATE = "最后修改时间";
	public static final String ALIAS_CREATOR = "管理员";
	public static final String ALIAS_READ_CNT = "访问次数";
	/**
	*公告类型(1-公告;2-活动;3-案例;4-关于我们;5-轮播图)
	 */
	public static final String ALIAS_TYPE = "分类";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private Long id;
    /**
     * 标题       db_column: TITLE
     */

	private String title;
    /**
     * 内容       db_column: CONTENT
     */
	@NotBlank @Length(max=16777215)
	private String content;
    /**
     * 客户端显示的图片       db_column: IMG_URL
     */

	private String imgUrl;
    /**
     * 状态(1-待发布;2-已发布)       db_column: STATUS
     */
	@NotNull
	private Long status;
    /**
     * 录入时间       db_column: ADDTIME
     */
	@NotNull
	private Long addtime;
    /**
     * 最后修改时间       db_column: LASTUPDATE
     */

	private Long lastupdate;
    /**
     * 创建者       db_column: CREATOR
     */
	@NotNull
	private Long creator;
    /**
     * 访问次数       db_column: READ_CNT
     */
	@NotNull
	private Long readCnt;
    /**
     * 公告类型(1-公告;2-活动;3-案例;4-关于我们;5-轮播图)       db_column: TYPE
     */
	@NotNull
	private Integer type;
	//columns END


	/**
	 * 开始时间
	 */

	private Long beginTime;


	/**
	 * 地址
	 */

	private String address;





	public Notice(){
	}

	public Notice(
		Long id
	){
		this.id = id;
	}

	public static String getTableAlias() {
		return TABLE_ALIAS;
	}

	public Long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(Long value) {
		this.id = value;
	}

	public Long getId() {
		return this.id;
	}
	public void setTitle(String value) {
		this.title = value;
	}

	public String getTitle() {
		return this.title;
	}
	public void setContent(String value) {
		this.content = value;
	}

	public String getContent() {
		return this.content;
	}
	public void setImgUrl(String value) {
		this.imgUrl = value;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setStatus(Long value) {
		this.status = value;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setAddtime(Long value) {
		this.addtime = value;
	}

	public Long getAddtime() {
		return this.addtime;
	}
	public void setLastupdate(Long value) {
		this.lastupdate = value;
	}

	public Long getLastupdate() {
		return this.lastupdate;
	}
	public void setCreator(Long value) {
		this.creator = value;
	}

	public Long getCreator() {
		return this.creator;
	}
	public void setReadCnt(Long value) {
		this.readCnt = value;
	}

	public Long getReadCnt() {
		return this.readCnt;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
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
		if(obj instanceof Notice == false) return false;
		if(this == obj) return true;
		Notice other = (Notice)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

