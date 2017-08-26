package com.up72.hq.constant;

/**
 * 接口常量
 */
public class InterfaceCnst {

    public final static String RECODE_SUCCESS = "00"; //处理成功
    public final static String RECODE_FAIL = "01"; //处理失败
    public final static String RECODE_NOT_BLANK = "02"; //参数不能为空
    public final static String RECODE_SYSTEM_ERROR = "03"; //系统出现异常，无法处理您的请求
    public final static String RECODE_VALIDATE_FAIL= "04"; //数据校验失败
    public final static String RECODE_NOT_LOGIN = "05"; //用户没有登录
    public final static String RECODE_TOKEN_LOST = "06"; //TOKEN 已失效


    public static final String SYSTEM_ERROR = "系统出现异常，无法处理您的请求。";
    public static final String RECORD_NOT_EXISTS = "记录不存在";
    public static final String RECORD_IS_DEL = "记录已删除";
    public static final String VALIDATE_FAIL = "数据校验失败";
    public static final String NAME_NOT_BLANK = "名称不能为空";
    public static final String NOT_LOGIN = "用户没有登录";
    public static final String OTHER_COMPANY = "不能修改其他企业的数据";
    public static final String OTHER_MEMBER = "不能修改其他用户的数据";
    public static final String TOKEN_LOST = "TOKEN 已失效";

}