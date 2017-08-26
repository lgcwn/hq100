/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.alibaba.fastjson.annotation.JSONField;
import com.up72.hq.model.ProdImg;

/**
 * 输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ProdImgResp extends ProdImg {

    /**
     * 规格值名称
     */
    private String specValueName;

    /**
     * 首张图片
     */
    private String firstImg;

    @JSONField(serialize = false)
    @Override
    public String getImgs() {
        return super.getImgs();
    }

    public String getSpecValueName() {
        return specValueName;
    }

    public void setSpecValueName(String specValueName) {
        this.specValueName = specValueName;
    }

    public String getFirstImg() {
        return firstImg;
    }

    public void setFirstImg(String firstImg) {
        this.firstImg = firstImg;
    }

    public static ProdImgResp convert(ProdImg prodImg){
        ProdImgResp prodImgResp = new ProdImgResp();
        prodImgResp.setId(prodImg.getId());
        prodImgResp.setProdId(prodImg.getProdId());
        prodImgResp.setSpecId(prodImg.getSpecId());
        prodImgResp.setSpecValueId(prodImg.getSpecValueId());
        prodImgResp.setImgs(prodImg.getImgs());
        return prodImgResp;
    }
}