/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.sql.Date;


/**
 * 搜索关键字
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Keyword implements java.io.Serializable{

	//alias
	public static final String TABLE_ALIAS = "搜索关键字";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_KEYWORD = "关键字";
	public static final String ALIAS_PINYIN = "关键字拼音";
	public static final String ALIAS_ABBRE = "关键字缩写";
	public static final String ALIAS_SEARCH_TIMES = "搜索次数";


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id
     */

	private Long id;
    /**
     * 关键字       db_column: KEYWORD
     */
	@NotBlank
    @Length(max=100)
	private String keyword;
    /**
     * 关键字拼音       db_column: PINYIN
     */
	@Length(max=10000)
	private String pinyin;
    /**
     * 关键字缩写       db_column: ABBRE
     */
	@Length(max=10000)
	private String abbre;
    /**
     * 搜索次数       db_column: SEARCH_TIMES
     */

	private Long searchTimes;

	/**
	 * 编辑时间  db_column: EDIT_TIME
     */
	private Date editTime;

	/**
	 * 所属模块       db_column: TYPE
	 * 默认 资讯
	 */

	private Integer type=1;


	//columns END

	public Keyword(){
	}

	public Keyword(
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
	public void setKeyword(String value) {
		this.keyword = value;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setPinyin(String value) {
		this.pinyin = value;
	}

	public String getPinyin() {
		return this.pinyin;
	}
	public void setAbbre(String value) {
		this.abbre = value;
	}

	public String getAbbre() {
		return this.abbre;
	}
	public void setSearchTimes(Long value) {
		this.searchTimes = value;
	}

	public Long getSearchTimes() {
		return this.searchTimes;
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
		if(obj instanceof Keyword == false) return false;
		if(this == obj) return true;
		Keyword other = (Keyword)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public Date getEditTime() {
		return editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}

