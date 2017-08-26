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
 * 商品
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Goods  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "商品";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_PROD_ID = "产品id";
	public static final String ALIAS_CAT_ID = "分类id";
	public static final String ALIAS_SN = "商品编号";
	public static final String ALIAS_IS_GIVE = "是否赠品(0否;1是)";
	public static final String ALIAS_FULL_NAME = "商品全称";
	public static final String ALIAS_SPEC_NAMES = "规则名称";
	public static final String ALIAS_PRICE = "价格";
	public static final String ALIAS_MARKET_PRICE = "市场价格";
	public static final String ALIAS_STOCK = "库存";
	public static final String ALIAS_SALES = "销量";
	public static final String ALIAS_MONTH_SALES = "月销量";
	public static final String ALIAS_COLLECT_NUM = "被收藏数量";
	public static final String ALIAS_IS_MARKETABLE = "是否上架(0否;1是)";
	public static final String ALIAS_IS_TOP = "是否置顶(0否;1是)";
	public static final String ALIAS_FIRST_IMG = "第一张图片";
	public static final String ALIAS_IMAGES = "图片路径，以逗号分隔";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_EDIT_TIME = "修改时间";
	public static final String ALIAS_TAG_IDS = "标签IDS,格式为：1,2";
	public static final String ALIAS_QR_CODE = "二维码";
	public static final String ALIAS_SOLR_NAME = "用于SOLR查询";
	public static final String ALIAS_IS_DELETE = "是否已删除(0否;1是)";
	public static final String ALIAS_MARKE_TIME = "上架时间";
	public static final String ALIAS_SORT = "排序";
	public static final String ALIAS_TYPE = "商品类型";
	public static final String ALIAS_INTRO = "商品详情";
	public static final String ALIAS_IS_DEL = "商品详情";
	public static final String ALIAS_GET_POINTS = "获得积分";


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 产品id       db_column: PROD_ID 
     */	
	
	private java.lang.Long prodId;
    /**
     * 分类id       db_column: CAT_ID 
     */	
	
	private java.lang.Long catId;
    /**
     * 商品编号       db_column: SN 
     */	
	@Length(max=20)
	private java.lang.String sn;
    /**
     * 是否赠品(0否;1是)       db_column: IS_GIVE 
     */	
	
	private Integer isGive;
    /**
     * 商品全称       db_column: FULL_NAME 
     */	
	@Length(max=256)
	private java.lang.String fullName;
    /**
     * 规则名称       db_column: SPEC_NAMES 
     */	
	@Length(max=256)
	private java.lang.String specNames;
    /**
     * 价格       db_column: PRICE 
     */	
	
	private Double price;
    /**
     * 市场价格       db_column: MARKET_PRICE 
     */	
	
	private Double marketPrice;
    /**
     * 库存       db_column: STOCK 
     */	
	
	private java.lang.Integer stock;
    /**
     * 销量       db_column: SALES 
     */	
	
	private java.lang.Integer sales;
    /**
     * 月销量       db_column: MONTH_SALES 
     */	
	
	private java.lang.Integer monthSales;
    /**
     * 被收藏数量       db_column: COLLECT_NUM 
     */	
	
	private java.lang.Integer collectNum;
    /**
     * 是否上架(0否;1是)       db_column: IS_MARKETABLE 
     */	
	
	private Integer isMarketable;
    /**
     * 是否置顶(0否;1是)       db_column: IS_TOP 
     */	
	
	private Integer isTop;
    /**
     * 第一张图片       db_column: FIRST_IMG 
     */	
	@Length(max=256)
	private java.lang.String firstImg;
    /**
     * 图片路径，以逗号分隔       db_column: IMAGES 
     */	
	@Length(max=1000)
	private java.lang.String images;
    /**
     * 商品详情       db_column: INTRO
     */
	@Length(max=2147483647)
	private java.lang.String intro;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
    /**
     * 修改时间       db_column: EDIT_TIME 
     */	
	
	private java.lang.Long editTime;
    /**
     * 标签IDS,格式为：1,2       db_column: TAG_IDS 
     */	
	@Length(max=256)
	private java.lang.String tagIds;
    /**
     * 二维码       db_column: QR_CODE 
     */	
	@Length(max=512)
	private java.lang.String qrCode;
    /**
     * 用于SOLR查询       db_column: SOLR_NAME 
     */	
	@Length(max=512)
	private java.lang.String solrName;
    /**
     * 是否已删除(0否;1是)       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 上架时间       db_column: MARKE_TIME 
     */	
	
	private java.lang.Long markeTime;
    /**
     * 排序       db_column: SORT 
     */	
	
	private java.lang.Long sort;
    /**
     * 商品类型       db_column: TYPE 
     */	
	
	private Integer type;

	/**
	 * 赠送积分       db_column: GIVE_POINTS
	 */

	private java.lang.Integer givePoints;
	//columns END

	private String idCipher;

	public Goods(){
	}

	public Goods(
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
	public void setProdId(java.lang.Long value) {
		this.prodId = value;
	}
	
	public java.lang.Long getProdId() {
		return this.prodId;
	}
	public void setCatId(java.lang.Long value) {
		this.catId = value;
	}
	
	public java.lang.Long getCatId() {
		return this.catId;
	}
	public void setSn(java.lang.String value) {
		this.sn = value;
	}
	
	public java.lang.String getSn() {
		return this.sn;
	}
	public void setIsGive(Integer value) {
		this.isGive = value;
	}
	
	public Integer getIsGive() {
		return this.isGive;
	}
	public void setFullName(java.lang.String value) {
		this.fullName = value;
	}
	
	public java.lang.String getFullName() {
		return this.fullName;
	}
	public void setSpecNames(java.lang.String value) {
		this.specNames = value;
	}
	
	public java.lang.String getSpecNames() {
		return this.specNames;
	}
	public void setPrice(Double value) {
		this.price = value;
	}
	
	public  Double getPrice() {
		return this.price;
	}
	public void setMarketPrice(Double value) {
		this.marketPrice = value;
	}
	
	public Double getMarketPrice() {
		return this.marketPrice;
	}
	public void setStock(java.lang.Integer value) {
		this.stock = value;
	}
	
	public java.lang.Integer getStock() {
		return this.stock;
	}
	public void setSales(java.lang.Integer value) {
		this.sales = value;
	}
	
	public java.lang.Integer getSales() {
		return this.sales;
	}
	public void setMonthSales(java.lang.Integer value) {
		this.monthSales = value;
	}
	
	public java.lang.Integer getMonthSales() {
		return this.monthSales;
	}
	public void setCollectNum(java.lang.Integer value) {
		this.collectNum = value;
	}
	
	public java.lang.Integer getCollectNum() {
		return this.collectNum;
	}
	public void setIsMarketable(Integer value) {
		this.isMarketable = value;
	}
	
	public Integer getIsMarketable() {
		return this.isMarketable;
	}
	public void setIsTop(Integer value) {
		this.isTop = value;
	}
	
	public Integer getIsTop() {
		return this.isTop;
	}
	public void setFirstImg(java.lang.String value) {
		this.firstImg = value;
	}
	
	public java.lang.String getFirstImg() {
		return this.firstImg;
	}
	public void setImages(java.lang.String value) {
		this.images = value;
	}
	
	public java.lang.String getImages() {
		return this.images;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setEditTime(java.lang.Long value) {
		this.editTime = value;
	}
	
	public java.lang.Long getEditTime() {
		return this.editTime;
	}
	public void setTagIds(java.lang.String value) {
		this.tagIds = value;
	}
	
	public java.lang.String getTagIds() {
		return this.tagIds;
	}
	public void setQrCode(java.lang.String value) {
		this.qrCode = value;
	}
	
	public java.lang.String getQrCode() {
		return this.qrCode;
	}
	public void setSolrName(java.lang.String value) {
		this.solrName = value;
	}
	
	public java.lang.String getSolrName() {
		return this.solrName;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	public void setMarkeTime(java.lang.Long value) {
		this.markeTime = value;
	}
	
	public java.lang.Long getMarkeTime() {
		return this.markeTime;
	}
	public void setSort(java.lang.Long value) {
		this.sort = value;
	}
	
	public java.lang.Long getSort() {
		return this.sort;
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


	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}


	public Integer getGivePoints() {
		return givePoints;
	}

	public void setGivePoints(Integer givePoints) {
		this.givePoints = givePoints;
	}

	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Goods == false) return false;
		if(this == obj) return true;
		Goods other = (Goods)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

