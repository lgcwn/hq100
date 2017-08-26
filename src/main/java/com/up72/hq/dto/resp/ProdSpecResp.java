/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.model.ProdImg;
import com.up72.hq.model.ProdSpec;
import com.up72.hq.model.SpecValue;
import com.up72.hq.service.IProdImgService;
import com.up72.hq.service.ISpecValueService;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 产品规格中间表输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ProdSpecResp extends ProdSpec {
    private String  imgStr;
    private String specValueName;
    public String getImgStr() {
        String imgPath = "";
        try{
            IProdImgService service = (IProdImgService) ApplicationContextHolder.getBean("prodImgService");
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("specId",this.getSpecId());
            map.put("specValueId",this.getSpecValueId());
            map.put("prodId",this.getProdId());
            ProdImg img = service.getByParams(map);
            if(ObjectUtils.isNotEmpty(img)){
                if (StringUtils.isNotEmpty(img.getImgs())){
                    String[] imgs = img.getImgs().split(",");
                    if(imgs.length>0){
                        imgPath = imgs[0];
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return imgPath;
    }

    public void setImgStr(String imgStr) {
        this.imgStr = imgStr;
    }

    public String getSpecValueName() {
        String nameValue = "";
        try{
            ISpecValueService specValueService = (ISpecValueService) ApplicationContextHolder.getBean("specValueService");
            SpecValue value = specValueService.getById(this.getSpecValueId());
            if(ObjectUtils.isNotEmpty(value)){
                nameValue = value.getSpecValue();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return nameValue;
    }

    public void setSpecValueName(String specValueName) {
        specValueName = specValueName;
    }

}