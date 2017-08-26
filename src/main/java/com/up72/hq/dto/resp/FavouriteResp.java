/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.up72.hq.model.Favourite;
import com.up72.hq.model.Goods;
import org.apache.commons.lang.StringUtils;

/**
 * 我的搜藏
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class FavouriteResp extends Favourite {

    private Goods goods;

    private String imgStr;//图片
    private String mianImgStr;//主图片

    //获取众筹信息
    private CrowdResp crowdResp;
    //获取评选信息
    private ChooseResp chooseResp;
    //获取视频信息
    private VideoResp videoResp;
    //获取资讯信息
    private NewsResp newsResp;
    //获取资讯信息
    private StarRankingResp starRankingResp;
    //获取资讯信息
    private RoleSelectResp roleSelectResp;



    public String getImgStr() {
        return imgStr;
    }

    public void setImgStr(String imgStr) {
        this.imgStr = imgStr;
    }

    public String getMianImgStr() {
        String mainImg = "";
        try{
            if(StringUtils.isNotEmpty(getImgStr())){
                String [] imgs = getImgStr().split(",");
                if(imgs.length >0){
                    mainImg = imgs[0];
                }
            }else{
                mainImg = this.getGoods().getFirstImg();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mainImg;
    }

    public void setMianImgStr(String mianImgStr) {
        this.mianImgStr = mianImgStr;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public CrowdResp getCrowdResp() {
        return crowdResp;
    }

    public void setCrowdResp(CrowdResp crowdResp) {
        this.crowdResp = crowdResp;
    }

    public ChooseResp getChooseResp() {
        return chooseResp;
    }

    public void setChooseResp(ChooseResp chooseResp) {
        this.chooseResp = chooseResp;
    }

    public VideoResp getVideoResp() {
        return videoResp;
    }

    public void setVideoResp(VideoResp videoResp) {
        this.videoResp = videoResp;
    }

    public NewsResp getNewsResp() {
        return newsResp;
    }

    public void setNewsResp(NewsResp newsResp) {
        this.newsResp = newsResp;
    }

    public StarRankingResp getStarRankingResp() {
        return starRankingResp;
    }

    public void setStarRankingResp(StarRankingResp starRankingResp) {
        this.starRankingResp = starRankingResp;
    }

    public RoleSelectResp getRoleSelectResp() {
        return roleSelectResp;
    }

    public void setRoleSelectResp(RoleSelectResp roleSelectResp) {
        this.roleSelectResp = roleSelectResp;
    }
}