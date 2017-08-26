package com.up72.hq.dto.resp;

import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.conf.SystemConfig;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Cat;
import com.up72.hq.model.News;
import com.up72.hq.service.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/23.
 */
public class NewsResp extends News {
    private String faNum;//收藏
    private String prNum;//点赞
    private String realName;//添加用户
    private String catIdName;
    private String publishTimeStr;
    private String diffPublishTime; //发布时间到当前时间
    private int collecCount; //此新闻被收藏次数
    private int commentCount; //此新闻被评论次数
    private Cat catType; //关联类型

    public String getFaNum() {
        return faNum;
    }

    public void setFaNum(String faNum) {
        this.faNum = faNum;
    }

    public String getPrNum() {
        return prNum;
    }

    public void setPrNum(String prNum) {
        this.prNum = prNum;
    }

    public String getCatIdName() {
        return catIdName;
    }

    public void setCatIdName(String catIdName) {
        this.catIdName = catIdName;
    }

    public String getPublishTimeStr() {
        return Cnst.getFormatTime(getPublishTime());
    }

    public void setPublishTimeStr(String publishTimeStr) {
        this.publishTimeStr = publishTimeStr;
    }

    public String getDiffPublishTime() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long a = (new Date().getTime() - simpleDateFormat.parse(Cnst.getFormatTime(getPublishTime())).getTime()) / 1000 / 60;
        if (a > 60) {
            if(a / 60 >24){
                diffPublishTime =  getPublishTimeStr();
            }else{
                diffPublishTime = a / 60 + "小时";
            }
        } else {
            if (a < 0) {
                diffPublishTime = 0 + "分钟";
            } else {
                diffPublishTime = a + "分钟";
            }

        }
        return diffPublishTime;
    }

    public void setDiffPublishTime(String diffPublishTime) {
        this.diffPublishTime = diffPublishTime;
    }

    public int getCollecCount() {
        IFavouriteService favouriteService = (IFavouriteService) ApplicationContextHolder.getBean("favouriteService");
        collecCount = favouriteService.findFavouriteCountByNewId(getId());
        return collecCount;
    }

    public void setCollecCount(int collecCount) {
        this.collecCount = collecCount;
    }

    public int getCommentCount() {
        /*IReviewService reviewService = (IReviewService) ApplicationContextHolder.getBean("reviewService");
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("sourceId", getId());
        map.put("catId", getCatId());
        commentCount = reviewService.findViewCountBySourceId(map);*/
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public Cat getCatType() {
        ICatService catService = (ICatService) ApplicationContextHolder.getBean("catService");
        catType = catService.getById(getCatId());
        return catType;
    }

    public void setCatType(Cat catType) {
        this.catType = catType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    private java.lang.String fileImg;

    public String getFileImg() {
        return SystemConfig.instants().getValue("file")+this.getFirstImg();
    }
}
