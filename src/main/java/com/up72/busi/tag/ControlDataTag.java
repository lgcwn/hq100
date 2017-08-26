package com.up72.busi.tag;

import com.up72.framework.util.ObjectUtils;

import javax.servlet.jsp.JspException;

public class ControlDataTag extends BaseTag{

    /**标签名称,如果"var"未启用的话，使用此变量*/
    private static final String tagName = "controlData";

    /** 业务字段*/
    private String dataId;
    private String controlId;

    public int doStartTag() throws JspException {
        if(ObjectUtils.isEmpty(itemId)){
            itemId = tagName;
        }
        if(items == null && begin == 0 && end == -1){
            // rawItems = initItems();
        }
        if(items != null){
            rawItems = items;
        }
        return super.doStartTag();
    }


    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }
}
