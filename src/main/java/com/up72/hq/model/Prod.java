/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 产品
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Prod implements java.io.Serializable{
	public static final String ALIAS_IS_SHOW_IN_HOME = "是否显示在首页";
	public static final String TABLE_ALIAS = "产品";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CAT_ID = "分类ID";
	public static final String ALIAS_NAME = "产品名称";
	public static final String ALIAS_ITEM_NUMBER = "货号";
	public static final String ALIAS_INTRO = "产品介绍";
	public static final String ALIAS_IS_MARKETABLE = "是否上架(0否;1是)";
	public static final String ALIAS_IS_ENABLE_SPEC = "是否开启规格(0否;1是)";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_ADD_USER_ID = "添加人ID";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_VIRTUAL_SALES = "虚拟销量";
	public static final String ALIAS_SALES = "总销量";
	public static final String ALIAS_IS_SHOW_INTRO = "是否显示商品介绍(0否;1是)";

	/** 是否显示在首页       数据库字段: IS_SHOW_IN_HOME */
	@NotNull
	private Integer isShowInHome;
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/**
	 * id       db_column: ID
	 */

	private java.lang.Long id;
	/**
	 * 分类ID       db_column: CAT_ID
	 */
	@NotNull
	private java.lang.Long catId;
	/**
	 * 产品名称       db_column: NAME
	 */
	@NotBlank @Length(max=256)
	private java.lang.String name;
	/**
	 * 货号       db_column: ITEM_NUMBER
	 */
	@Length(max=256)
	private java.lang.String itemNumber;
	/**
	 * 产品介绍       db_column: INTRO
	 */
	@Length(max=2147483647)
	private java.lang.String intro;
	/**
	 * 产品备注       db_column: REMARK
	 */
	private java.lang.String reMark;
	/**
	 * 是否上架(0否;1是)       db_column: IS_MARKETABLE
	 */
	@NotNull
	private Integer isMarketable;
	/**
	 * 是否开启规格(0否;1是)       db_column: IS_ENABLE_SPEC
	 */
	@NotNull
	private Integer isEnableSpec;
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
	 * 排序       db_column: SORT_ID
	 */
	@NotNull
	private java.lang.Long sortId;
	/**
	 * 虚拟销量       db_column: VIRTUAL_SALES
	 */

	private java.lang.Integer virtualSales;
	/**
	 * 总销量       db_column: SALES
	 */

	private java.lang.Integer sales;
	/**
	 * 是否显示商品介绍(0否;1是)       db_column: IS_SHOW_INTRO
	 */

	private Integer isShowIntro;

	/** 评价总数 **/
	private Long commentCount;

	/** 全部商品规格信息 **/
	private String specFull;

	/** 产品加所有商品名称 **/
	private String goodsNameFull;

	/** 属性的IDS **/
	private String catIdFull;

	/** 属性的路径全名称 **/
	private String catNameFull;

	/** 包装清单 **/
	private String packingList;

	/** 产品下使用的颜色规格列表 **/
	private String specColorFull;

	/** 全规格最低价 **/
	private Double minPrice;

	/** 是否新产品 0否 1是**/
	private Integer isNewProd;

	/** 综合评分 **/
	private Integer compositeScore;

	/** 所属品牌 **/
	private Long brandId;

	/** 所有属性ids**/
	private String attrIds;

	/** 所有属性_属性值 **/
	private String attrFull;

	/** 所有属性名称**/
	private String attrNameFull;

	/**
	 * 1 自营  2 入驻        db_column: TYPE
	 */
	private java.lang.Integer type;

	/** 产品库存 **/
	private java.lang.Integer stock;
	//columns END

	public Prod(){
	}

	public Prod(
			Long id
	){
		this.id = id;
	}

	public Integer getVirtualSales() {
		return virtualSales;
	}

	public void setVirtualSales(Integer virtualSales) {
		this.virtualSales = virtualSales;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getIsShowIntro() {
		return isShowIntro;
	}

	public void setIsShowIntro(Integer isShowIntro) {
		this.isShowIntro = isShowIntro;
	}

	public void setId(Long value) {
		this.id = value;
	}

	public Long getId() {
		return this.id;
	}
	public void setCatId(Long value) {
		this.catId = value;
	}

	public Long getCatId() {
		return this.catId;
	}
	public void setName(String value) {
		this.name = value;
	}

	public String getName() {
		return this.name;
	}
	public void setItemNumber(String value) {
		this.itemNumber = value;
	}

	public String getItemNumber() {
		return this.itemNumber;
	}
	public void setIntro(String value) {
		this.intro = value;
	}

	public String getIntro() {
		return this.intro;
	}
	public void setIsMarketable(Integer value) {
		this.isMarketable = value;
	}

	public Integer getIsMarketable() {
		return this.isMarketable;
	}
	public void setIsEnableSpec(Integer value) {
		this.isEnableSpec = value;
	}

	public Integer getIsEnableSpec() {
		return this.isEnableSpec;
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
	public void setSortId(Long value) {
		this.sortId = value;
	}

	public Long getSortId() {
		return this.sortId;
	}
	public void setIsShowInHome(Integer value) {
		this.isShowInHome = value;
	}

	public Integer getIsShowInHome() {
		return this.isShowInHome;
	}

	public String getReMark() {
		return reMark;
	}

	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Integer getCompositeScore() {
		return compositeScore;
	}

	public void setCompositeScore(Integer compositeScore) {
		this.compositeScore = compositeScore;
	}

	public Integer getIsNewProd() {
		return isNewProd;
	}

	public void setIsNewProd(Integer isNewProd) {
		this.isNewProd = isNewProd;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public String getSpecColorFull() {
		return specColorFull;
	}

	public void setSpecColorFull(String specColorFull) {
		this.specColorFull = specColorFull;
	}

	public String getSpecFull() {
		return specFull;
	}

	public void setSpecFull(String specFull) {
		this.specFull = specFull;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public String getPackingList() {
		return packingList;
	}

	public void setPackingList(String packingList) {
		this.packingList = packingList;
	}
	public String getAttrFull() {
		return attrFull;
	}

	public void setAttrFull(String attrFull) {
		this.attrFull = attrFull;
	}

	public String getAttrIds() {
		return attrIds;
	}

	public void setAttrIds(String attrIds) {
		this.attrIds = attrIds;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getCatNameFull() {
		return catNameFull;
	}

	public void setCatNameFull(String catNameFull) {
		this.catNameFull = catNameFull;
	}

	public String getCatIdFull() {
		return catIdFull;
	}

	public void setCatIdFull(String catIdFull) {
		this.catIdFull = catIdFull;
	}

	public String getGoodsNameFull() {
		return goodsNameFull;
	}

	public void setGoodsNameFull(String goodsNameFull) {
		this.goodsNameFull = goodsNameFull;
	}

	public String getAttrNameFull() {
		return attrNameFull;
	}

	public void setAttrNameFull(String attrNameFull) {
		this.attrNameFull = attrNameFull;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public int hashCode() {
		return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
	}

	public boolean equals(Object obj) {
		if(obj instanceof Prod == false) return false;
		if(this == obj) return true;
		Prod other = (Prod)obj;
		return new EqualsBuilder()
				.append(getId(), other.getId())
				.isEquals();
	}
}

