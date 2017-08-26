package com.up72.hq.constant;

import com.up72.hq.conf.SystemConfig;

/**
 * 第三方登录账号信息
 */
public class ThirdCnst {
    public static class QQ{
        public final static String QQ_APPID = SystemConfig.instants().getValue("QQ_APPID");
        public final static String QQ_APPKEY = SystemConfig.instants().getValue("QQ_APPKEY");
    }
    public static class WB{
        public final static String WB_APPKEY= SystemConfig.instants().getValue("WB_APPKEY");
        public final static String WB_APP_SERCET= SystemConfig.instants().getValue("WB_APP_SERCET");;
    }
    public static class WX{
        public final static String WX_APPID = SystemConfig.instants().getValue("WX_APPID");
        public final static String WX_APPKEY = SystemConfig.instants().getValue("WX_APPKEY");
    }
}
