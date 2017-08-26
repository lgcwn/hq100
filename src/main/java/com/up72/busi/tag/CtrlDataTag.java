package com.up72.busi.tag;

import com.up72.busi.dto.resp.BusiSiteCtrlDataResp;
import com.up72.busi.model.BusiSiteCtrl;
import com.up72.busi.model.BusiSiteCtrlData;
import com.up72.busi.service.IBusiSiteCtrlDataService;
import com.up72.busi.service.IBusiSiteCtrlService;
import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.ParamUtils;
import com.up72.framework.util.holder.ApplicationContextHolder;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class CtrlDataTag extends BaseTag {
    private static Logger log = LoggerFactory.getLogger(CtrlDataTag.class);

    /**
     * 标签名称,如果"var"未启用的话，使用此变量
     */
    private static final String tagName = "controlData";

    /**
     * 业务字段
     */
    private Long dataId;
    private Long controlId;
    private String[] imgKeyArr; // 图片的key数组
    private String[] textKeyArr; // 文本的key数组
    private String[] urlKeyArr;  // 链接的key数组

    public int doStartTag() throws JspException {
        if (ObjectUtils.isEmpty(itemId)) {
            itemId = tagName;
        }
        if (items == null && begin == 0 && end == -1) {
            rawItems = initItems();
        }
        if (items != null) {
            rawItems = items;
        }
        return super.doStartTag();
    }

    /**
     * 业务数据处理
     *
     * @return
     */
    private List<BusiSiteCtrlDataResp> initItems() {
        List<BusiSiteCtrlData> list = getDataList();
        List<BusiSiteCtrlDataResp> respList = new ArrayList<BusiSiteCtrlDataResp>();
        if(list != null && list.size() > 0) {
            setKeyArr();
            for (BusiSiteCtrlData data : list) {
                BusiSiteCtrlDataResp resp = getBusiSiteCtrlDataResp(data);
                respList.add(resp);
            }
        }
        return respList;
    }

    /**
     * 将data转换成BusiSiteCtrlDataResp对象
     * @param data
     * @return
     */
    private BusiSiteCtrlDataResp getBusiSiteCtrlDataResp(BusiSiteCtrlData data) {
        BusiSiteCtrlDataResp resp = new BusiSiteCtrlDataResp();
        try {
            BeanUtils.copyProperties(resp, data);
            String[] imgValueArr = StringUtils.isBlank(data.getImages()) ? null : data.getImages().split(",");
            String[] textValueArr = StringUtils.isBlank(data.getTexts()) ? null : data.getTexts().split(",");
            String[] urlValueArr = StringUtils.isBlank(data.getUrls()) ? null : data.getUrls().split(",");
            if(imgKeyArr != null && imgValueArr != null && imgKeyArr.length == imgValueArr.length && imgKeyArr.length > 0) {
                for(int i = 0; i < imgKeyArr.length; i ++){
                    resp.getImage().put(imgKeyArr[i],imgValueArr[i]);
                }
            }
            if(textKeyArr != null && textValueArr != null && textKeyArr.length == textValueArr.length && textKeyArr.length > 0) {
                for(int i = 0; i < textKeyArr.length; i ++){
                    resp.getText().put(textKeyArr[i],textValueArr[i]);
                }
            }
            if(urlKeyArr != null && urlValueArr != null && urlKeyArr.length == urlValueArr.length && urlKeyArr.length > 0) {
                for(int i = 0; i < urlKeyArr.length; i ++){
                    resp.getUrl().put(urlKeyArr[i],urlValueArr[i]);
                }
            }
        } catch (Exception e) {
            log.error("复制属性出错：BeanUtils.copyProperties(resp,data)",e);
        }
        return resp;
    }

    // 设置key数组
    private void setKeyArr(){
        IBusiSiteCtrlService ctrlServ = (IBusiSiteCtrlService) ApplicationContextHolder.getBean("busiSiteCtrlService");
        BusiSiteCtrl ctrl = ctrlServ.getById(controlId);
        if(imgKeyArr == null && StringUtils.isNotBlank(ctrl.getImages())) {
            imgKeyArr = ctrl.getImages().split(",");
        }
        if(textKeyArr == null && StringUtils.isNotBlank(ctrl.getTexts())) {
            textKeyArr = ctrl.getTexts().split(",");
        }
        if(urlKeyArr == null && StringUtils.isNotBlank(ctrl.getUrls())) {
            urlKeyArr = ctrl.getUrls().split(",");
        }
    }

    private List<BusiSiteCtrlData> getDataList() {
        List<BusiSiteCtrlData> list = new ArrayList<BusiSiteCtrlData>();
        try {
            if(controlId == null && dataId == null) {
                return list;
            }
            IBusiSiteCtrlDataService dataServ = (IBusiSiteCtrlDataService) ApplicationContextHolder.getBean("busiSiteCtrlDataService");
            if(dataId != null) {
                BusiSiteCtrlData data = dataServ.getById(dataId);
                if(data != null) {
                    controlId = data.getCtrlId();
                    list.add(data);
                } else {
                    log.warn("BUSI_SITE_CTRL_DATA表中不存在此ID：" + dataId);
                }
                return list;
            }
            list = dataServ.getListByCtrlId(controlId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Long getControlId() {
        return controlId;
    }

    public void setControlId(Long controlId) {
        this.controlId = controlId;
    }
}
