package com.up72.hq.dto.resp;

import com.up72.hq.model.Prod;
import com.up72.hq.model.ProdImg;
import com.up72.hq.model.ProdParam;
import com.up72.hq.utils.CodeEncryption;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 产品输出
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ProdResp extends Prod {
    private String catName;
    private List<GoodsResp> goodsList;
    private List<GoodsResp> goodsRespList;
    private List<ProdAttrResp> prodAttrList;
    private List<ProdParamResp> prodParamList;
    private List<ProdImg> prodImgList;

    private String idCipher;
    private String firstImg;
    private String firstGoodsPrice;
    private List<ProdImg> imgs;
    private Integer isHaveStock;//是否有库存
    private Integer serviceStock;//库存

    public String getIdCipher() {
        idCipher= CodeEncryption.encryption(getId());
        return idCipher;
    }

    public void setIdCipher(String idCipher) {
        this.idCipher = idCipher;
    }
    public List<GoodsResp> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsResp> goodsList) {
        this.goodsList = goodsList;
    }

    public List<ProdAttrResp> getProdAttrList() {
        return prodAttrList;
    }

    public void setProdAttrList(List<ProdAttrResp> prodAttrList) {
        this.prodAttrList = prodAttrList;
    }

    public List<ProdParamResp> getProdParamList() {
        return prodParamList;
    }

    public void setProdParamList(List<ProdParamResp> prodParamList) {
        this.prodParamList = prodParamList;
    }

    public List<ProdImg> getProdImgList() {
        return prodImgList;
    }

    public void setProdImgList(List<ProdImg> prodImgList) {
        this.prodImgList = prodImgList;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getFirstImg() {
        String imgStr = "";
        try{
            if(this.getIsEnableSpec() == 1){
                if(this.getProdImgList().size()>0){
                    List<ProdImg> list = new ArrayList<ProdImg>();
                    for(ProdImg img : this.getProdImgList()){
                        if(StringUtils.isNotEmpty(img.getImgs())){
                            String []imgs = img.getImgs().split(",");
                            if(imgs.length>0){
                                imgStr = imgs[0];
                                break;
                            }
                        }
                    }
                }
            }
            if(this.getIsEnableSpec() == 0){
                if(this.getGoodsList().size()>0){
                    imgStr = this.getGoodsList().get(0).getFirstImg();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return imgStr;
    }

    public void setFirstImg(String firstImg) {
        this.firstImg = firstImg;
    }

    public String getFirstGoodsPrice() {
        String goodsPrice = "";
        try{
            if(this.getGoodsList().size()>0){
                for(GoodsResp resp : this.getGoodsList()){
                    if(resp.getIsMarketable() == 1 && resp.getPrice() > 0){
                        goodsPrice = resp.getGoodsPriceStr();
                        break;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return goodsPrice;
    }

    public void setFirstGoodsPrice(String firstGoodsPrice) {
        this.firstGoodsPrice = firstGoodsPrice;
    }

    public List<ProdImg> getImgs() {
        List<ProdImg> list = new ArrayList<ProdImg>();
        try{
            if(this.getIsEnableSpec() == 1){
                if(this.getProdImgList().size()>0){
                    for(ProdImg img : this.getProdImgList()){
                        if(StringUtils.isNotEmpty(img.getImgs())){
                            String []imgs = img.getImgs().split(",");
                            if(imgs.length>0){
                                if(imgs.length>1){
                                    for(int i=0;i<imgs.length;i++){
                                        ProdImg mg = new ProdImg();
                                        mg.setImgs(imgs[i]);
                                        list.add(mg);
                                    }
                                }else{
                                    list.add(img);
                                }
                            }
                        }
                    }
                }
            }
            if(this.getIsEnableSpec() == 0){
                if(this.getGoodsList().size()>0){
                    String i = this.getGoodsList().get(0).getImages();
                    if(StringUtils.isNotEmpty(i)){
                        String[] imgsArray = i.split(",");
                        if(imgsArray.length>0){
                            for(int a = 0; a < imgsArray.length; a ++){
                                ProdImg mg = new ProdImg();
                                mg.setImgs(imgsArray[a]);
                                list.add(mg);
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void setImgs(List<ProdImg> imgs) {
        this.imgs = imgs;
    }

    public List<GoodsResp> getGoodsRespList() {
        return goodsRespList;
    }

    public void setGoodsRespList(List<GoodsResp> goodsRespList) {
        this.goodsRespList = goodsRespList;
    }

    public Integer getIsHaveStock() {
        return isHaveStock;
    }

    public void setIsHaveStock(Integer isHaveStock) {
        this.isHaveStock = isHaveStock;
    }

    public Integer getServiceStock() {
        return serviceStock;
    }

    public void setServiceStock(Integer serviceStock) {
        this.serviceStock = serviceStock;
    }

    public ProdResp() {
    }
}