/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.utils.CodeEncryption;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 投票道具
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class VoteProps  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "投票道具";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_TYPE = "类型";
	public static final String ALIAS_SCROE = "分数";
	public static final String ALIAS_IMG = "图标";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_ENABLE = "状态";
	public static final String ALIAS_SALES_CNT = "销量";
	public static final String ALIAS_PRICE = "价格";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 名称       db_column: NAME 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String name;
    /**
     * 类型(1-加;2-减)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 消费类型(1-T币;2-积分)       db_column: COST_TYPE
     */
	@NotNull
	private Integer costType;
    /**
     * 分数       db_column: SCROE 
     */	
	@NotNull 
	private java.lang.Integer scroe;
    /**
     * 图标       db_column: IMG 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String img;
    /**
     * 排序       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Integer sortId;
    /**
     * 状态       db_column: ENABLE 
     */	
	@NotNull 
	private Integer enable;
    /**
     * 销量       db_column: SALES_CNT 
     */	
	@NotNull 
	private java.lang.Integer salesCnt;
    /**
     * 价格-T币       db_column: PRICE 
     */	
	@NotNull 
	private java.lang.Integer price;

	@Length(max=1000)
	private String remark;
	//columns END

	public VoteProps(){
	}

	public VoteProps(
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setScroe(java.lang.Integer value) {
		this.scroe = value;
	}
	
	public java.lang.Integer getScroe() {
		return this.scroe;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setSortId(java.lang.Integer value) {
		this.sortId = value;
	}
	
	public java.lang.Integer getSortId() {
		return this.sortId;
	}
	public void setEnable(Integer value) {
		this.enable = value;
	}
	
	public Integer getEnable() {
		return this.enable;
	}
	public void setSalesCnt(java.lang.Integer value) {
		this.salesCnt = value;
	}
	
	public java.lang.Integer getSalesCnt() {
		return this.salesCnt;
	}
	public void setPrice(java.lang.Integer value) {
		this.price = value;
	}
	
	public java.lang.Integer getPrice() {
		return this.price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		if(obj instanceof VoteProps == false) return false;
		if(this == obj) return true;
		VoteProps other = (VoteProps)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	/**
	 * id 密文
	 */
	private String idCipher;

	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}

	public Integer getCostType() {
		return costType;
	}

	public void setCostType(Integer costType) {
		this.costType = costType;
	}
}

