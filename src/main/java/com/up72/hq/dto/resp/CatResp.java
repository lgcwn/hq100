/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.conf.SystemConfig;
import com.up72.hq.model.Cat;
import com.up72.hq.model.Video;
import com.up72.hq.service.IFavouriteService;
import com.up72.hq.service.IQuizService;
import com.up72.hq.service.IVideoService;
import com.up72.hq.utils.CodeEncryption;
import com.up72.hq.model.Cat;

import java.util.List;


/**
 * 分类输出
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class CatResp extends Cat {

    /**
     * 子分类列表
     */
    private List<CatResp> subCatList;

    private List<Video> videoRespslist;

    private List<QuizResp> quizRespList;


   /* private List<DhsGoodsResp> goodsRespsList;//分类下商品*/

    public List<CatResp> getSubCatList() {
        return subCatList;
    }

    private String idCipher;

    public void setSubCatList(List<CatResp> subCatList) {
        this.subCatList = subCatList;
    }

    public String getIdCipher() {
        idCipher = CodeEncryption.encryption(getId());
        return idCipher;
    }

    public void setIdCipher(String idCipher) {
        this.idCipher = idCipher;
    }
   /* public List<DhsGoodsResp> getGoodsRespsList() {
        List<DhsGoodsResp> goodsList = new ArrayList<DhsGoodsResp>();
        try{
            if(getId() != null){
                IDhsGoodsService service = (IDhsGoodsService) ApplicationContextHolder.getBean("dhsGoodsService");
                goodsList = service.getListByCatId(getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return goodsList;
    }

    public void setGoodsRespsList(List<DhsGoodsResp> goodsRespsList) {
        this.goodsRespsList = goodsRespsList;
    }*/

    public List<Video> getVideoRespslist() {
        IVideoService videoService = (IVideoService) ApplicationContextHolder.getBean("videoService");
        List<Video> videoRespslist = videoService.getByCatId(getId());
        return videoRespslist;
    }

    public void setVideoRespslist(List<Video> videoRespslist) {
        this.videoRespslist = videoRespslist;
    }

    public List<QuizResp> getQuizRespList() {
        IQuizService quizService = (IQuizService) ApplicationContextHolder.getBean("quizService");
        List<QuizResp> quizRespList = quizService.getListByArenaId(getId());
        return quizRespList;
    }

    public void setQuizRespList(List<QuizResp> quizRespList) {
        this.quizRespList = quizRespList;
    }


    private java.lang.String fileImg;
    public String getFileImg() {
        return SystemConfig.instants().getValue("file")+this.getImg();
    }
}