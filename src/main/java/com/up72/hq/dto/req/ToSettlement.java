package com.up72.hq.dto.req;

/**
 * Created by liguicheng on 16/5/17.
 */
public class ToSettlement implements  java.io.Serializable {

    private Long goodsId;
    private Long cartId;
    private Integer count;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
