package com.up72.hq.dto.req;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * 购物车数据对象,用于页面展示
 * @author liuguicheng Jul 23, 2014 1:48:44 PM
 */
public final class CartDto implements Comparator<CartDto>,Serializable {
	
	private static final long serialVersionUID = 7581003370180103545L;
	/** V1.0 缓存中购物车的主键:id=productId+'_'+specificationId 组成,也可以组合storeId*/
	/** V2.0 缓存中购物车的主键:商品ID,该ID与productId相同,暂时未取消*/
	private String id;
	/** 商品ID */
	private Long goodsId;
	/** 商品名称 */
	private String name;
	/** 商品单价 */
	private double price;
	/** 商品数量 */
	private int quantity = 1;
	/** 商品图片 */
	private String picture;

    /** 购物车图片50x50 */
    private String picture50;

	/** 创建时间 */
	private Date createDate;
	/** cookie */
	private String cartKey;
	/** 会员ID */
	private Long memberId;
	/** 店铺ID */
	private Long shopId = 0l;
	/** 规格列表,保存规格 ID*/
	private List<Long> specificationId = new ArrayList<Long>();
	/** 规格名称 */
	private String specificationName;
	/** 库存表示,用于查询库存 */
	private String stockKey;
	/** 库存表示,判断库存是否溢出 */
	private String stockFlag = "true";
	/** 商品ID,检查库存调用 */
	private Long[] productIds = null;
	/** 商品数量,检查库存调用 */
	private Integer[] quantitys = null;

    /** 商品是否已经下单状态， 0未下单，1已经下单 */
    private int goodsOrderStatus = 0;

	/**
	 * 判断当前商品类型,默认虚拟商品
	 * @author liuguicheng 2016-06-28 上午10:10:17 
	 */
	private Integer type = 1;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		price = Double.valueOf(new java.text.DecimalFormat("#.00").format(price));
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCartKey() {
		return cartKey;
	}
	public void setCartKey(String cartKey) {
		this.cartKey = cartKey;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

    public String getPicture50() {
        return picture50;
    }

    public void setPicture50(String picture50) {
        this.picture50 = picture50;
    }

    public int getGoodsOrderStatus() {
        return goodsOrderStatus;
    }

    public void setGoodsOrderStatus(int goodsOrderStatus) {
        this.goodsOrderStatus = goodsOrderStatus;
    }

    public Long getShopId() {
		if(shopId==null) {
			shopId = 0l;
		}
		return shopId;
	}
	public void setShopId(Long shopId) {
		if(shopId==null) {
			shopId = 0l;
		}
		this.shopId = shopId;
	}
	public List<Long> getSpecificationId() {
		return specificationId;
	}
	public void setSpecificationId(List<Long> specificationId) {
		this.specificationId = specificationId;
	}
	
	public String getSpecificationName() {
		return specificationName;
	}
	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
	}
	public String getStockKey() {
		return stockKey;
	}
	public void setStockKey(String stockKey) {
		this.stockKey = stockKey;
	}
	public String getStockFlag() {
		return stockFlag;
	}
	public void setStockFlag(String stockFlag) {
		this.stockFlag = stockFlag;
	}
	/**
	 * 对添加到缓存购物车中的商品按照时间倒序排列
	 * @author liuguicheng Jul 24, 2014 11:34:22 AM
	 * @param o1
	 * @param o2
	 * @return
	 * V1.0
	 */
	public int compare(CartDto o1, CartDto o2) {
		if(o1.getCreateDate()!=null && o2.getCreateDate()!=null) {
			if(o1.getCreateDate().after(o2.getCreateDate())) {
				return 0;
			}
		}
		return 1;
	}

}