package com.up72.busi.tag;

import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Method;

/** 获取文件域 */
public class FileDomainFunc {

    /** 获取文件域 */
    public static String getFileDomain(String fileDomain,Object systemConfigObj) {
        if(StringUtils.isBlank(fileDomain)) {
            return "";
        }
        try {
            String getterMethodName = "get" + fileDomain.substring(0,1).toUpperCase() + fileDomain.substring(1);
            Method getterMethod = systemConfigObj.getClass().getMethod(getterMethodName);
            String result = (String)getterMethod.invoke(systemConfigObj);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
