package com.up72.hq.constant;

import com.up72.hq.push.PushClient;
import com.up72.hq.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 常量
 */
public class Cnst {
    /**
     * 根路径
     */
    public static String ROOTPATH = "";
    /**
     * 将日期格式化为20121212的格式，不带时分秒
     */
    public static final SimpleDateFormat SDF_SHORT = new SimpleDateFormat("yyyyMMdd");
    /**
     * 将日期格式化为2012-12-12的格式，不带时分秒
     */
    public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * 将日期格式化为2012-12-12 12:12:12的格式，带时分秒
     */
    public static final SimpleDateFormat SDF_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 将日期格式化为20121212121212222的格式，用于转换成long类型的数据
     */
    public static final SimpleDateFormat SDF_TIME_NUM = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    /**
     * 用户登录session key
     */
    public static final String MEMBER_SESSION_KEY = "memberSessionKey";

    /** 对接游戏 处理的controller路径 */
    public static final String GAMES_CTRL = "/hq/games/";
    /**
     * 随机数
     */
    public static final Random RAN = new Random();

    /**
     * 请求加密校验 key
     */
    public static final String ENCODER_KEY = "3b38e11ffd65698aedeb5ffc";
    /** 自动确认收货间隔日期(从服务中心确认收货开始) **/
    public static final String AUTO_RECEIVED_DAYS = "auto_received_days";
    /** 默认自动确认收货天数 **/
    public static final Integer DEFAULT_AUTO_RECEIVED_DAYS = 7;

    /** 关键字map **/
    public static Map<String,Long> keywordTimes = new HashMap<String,Long>();

    /**
     * 获取方便识别的当前时间毫秒数，如20151103173941521
     */
    public static Long getCurTime() {
        return Long.parseLong(SDF_TIME_NUM.format(new Date()));
    }

    public static Long getCurTime(Date time) {
        return Long.parseLong(SDF_TIME_NUM.format(time));
    }

    public static Long getCurTime(String date) {
        DateUtils dateUtils = new DateUtils();
        if (org.apache.commons.lang.StringUtils.isBlank(date)) {
            return null;
        }
        return Long.parseLong(SDF_TIME_NUM.format(dateUtils.parse(date)));
    }


    /**
     * 把Long类型的时间转换成格式化时间，如把20151103173941521转换成2015-11-03
     */
    public static String getFormatDate(Long time) {
        if (time == null) {
            return "";
        }
        String tmp = time.toString();
        if (tmp.length() != 17) {
            return "";
        }
        return tmp.substring(0, 4) + "-" + tmp.substring(4, 6) + "-" + tmp.substring(6, 8);
    }

    /**
     * 把Long类型的时间转换成格式化时间，如把20151103173941521转换成2015-11-03 17:39:41
     */
    public static String getFormatTime(Long time) {
        if (time == null) {
            return "";
        }
        String tmp = time.toString();
        if (tmp.length() != 17) {
            return "";
        }
        return tmp.substring(0, 4) + "-" + tmp.substring(4, 6) + "-" + tmp.substring(6, 8) +
                " " + tmp.substring(8, 10) + ":" + tmp.substring(10, 12) + ":" + tmp.substring(12, 14);
    }

    /**
     * 时间字符串转 时间戳
     */
    public static Date stringToDate(String dateStr) {
        String format = "yyyy-MM-dd";
        if (null != dateStr && dateStr.length() > 3) {
            if (dateStr.length() == 19) {
                format = "yyyy-MM-dd HH:mm:ss";
            } else if (dateStr.length() == 16) {
                format = "yyyy-MM-dd HH:mm";
            } else if (dateStr.length() == 7) {
                format = "yyyy-MM";
            } else if (dateStr.length() == 4) {
                format = "yyyy";
            }
            return stringToDate(dateStr, format);
        }
        return null;
    }

    public static Date stringToDate(String dateStr, String format) {
        if (null != dateStr && dateStr.length() > 3) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                Date date = sdf.parse(dateStr);
                return date;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * 时间字符串转 时间戳
     */
    public static Long stringToLong(String dateStr) {
        String format = "yyyy-MM-dd";
        if (null != dateStr && dateStr.length() > 3) {
            if (dateStr.length() == 19) {
                format = "yyyy-MM-dd HH:mm:ss";
            } else if (dateStr.length() == 16) {
                format = "yyyy-MM-dd HH:mm";
            } else if (dateStr.length() == 7) {
                format = "yyyy-MM";
            } else if (dateStr.length() == 4) {
                format = "yyyy";
            }
            return stringToLong(dateStr, format);
        }
        return null;
    }

    /**
     * 时间字符串转 时间戳
     */
    public static Long stringToLong(String dateStr, String format) {
        if (null != dateStr && dateStr.length() > 3) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                Date date = sdf.parse(dateStr);
                return Long.parseLong(SDF_TIME_NUM.format(date));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static class Index {

        public static final String REGION = "TOP_REGION";


    }

    public static class Phone {
        public static final String CODE = "USER_PHONE_CODE";

    }

    /** 系统类型 */
    public static class VersionType {
        /** 安卓 */
        public static final int ANDROID = 0;
        /** IOS */
        public static final int IOS = 1;
    }

    /***
     * 友盟推送
     */
    public  static  class Push{
        public static PushClient client = new PushClient();
        public static final String ANDROID_APPKEY = "57f8877e67e58e0d890005d2";
        public static final  String ANDROID_APP_MASTRER_SECRET = "qebwvtbf2txiiavahkufe7qycyruz9vx";
        public static final String ANDROID_ALIAS_TYPE = "android";
        public static final String IOS_APPKEY = "57f8876367e58e8796001aef";
        public static final  String IOS_APP_MASTRER_SECRET = "fy87flrxthuhipk44t7imt4x7j3f131i";
        public static final String IOS_ALIAS_TYPE = "SINA_WEIBO ";
    }

    /**
     * 公告等类型常量
     */
    public static class Notice {
        /** 公告*/
        public static final int NOTICE = 1;
        /** 名称数组 */
        public static final String[] OUT_NOTICE_NAME_ARR = new String[]{"公告"};
        /**
         * Map，键为ID，值为名称
         */
        public static final Map<Integer, String> OUT_NOTICE_MAP_ID_NAME_ADMIN = new LinkedHashMap<Integer, String>() {{
            put(NOTICE, OUT_NOTICE_NAME_ARR[0]);
        }};
    }
    /**
     * 是 *
     */
    public static final Integer YES = 1;
    /**
     * 否 *
     */
    public static final Integer NO = 0;

    /**
     * 环球分类公共
     */
    public static class HqCat {
        public static final Integer MS_GOODS = 1;//免税商品
        public static final Integer XN_GOODS = 2;//虚拟商品
        public static final Integer STAR = 4;//明星
        public static final Integer JF_GOODS = 3;//积分商品
        public static final Integer VIDEO = 5;//视频
        public static final Integer ZHONG_CHOU = 6;//众筹
        public static final Integer NEWS = 7;//资讯
        public static final Integer TOUR = 8;//旅游
        public static final Integer ARENA = 9;//赛场
    }
    /**
     * 评论类型
     */
    public static class HqReview {
        public static final Integer MS_GOODS = 1;//免税商品
        public static final Integer XN_GOODS = 2;//虚拟商品
        public static final Integer STAR = 4;//明星
        public static final Integer JF_GOODS = 3;//积分商品
        public static final Integer VIDEO = 5;//视频
        public static final Integer ZHONG_CHOU = 6;//众筹
        public static final Integer NEWS = 7;//资讯
        public static final Integer TOUR = 8;//旅游
        public static final Integer ARENA = 9;//赛场
        //评选
        public static final Integer CHOOSE = 10;//评选之最或时事评选
        public static final Integer ROLE_SELECT = 11;//角色选拔
    }

    /**
     * 广告位或轮播图
     */
    public static class Advertisement {
        public static final Integer ONE = 1;//公用
        public static final Integer TWO = 2;//首页
        public static final Integer THREE = 3;//资讯
        public static final Integer FOUR = 4;//评选
        public static final Integer FIVE = 5;//赛场
        public static final Integer SIX = 6;//视频
        public static final Integer SEVEN = 7;//公益
        public static final Integer EIGHT = 8;//旅游
        public static final Integer NINE_INDEX = 90;//商城(首页)
        public static final Integer NINE_MS = 91;//商城（免税）
        public static final Integer NINE_XN = 92;//商城（虚拟）
        public static final Integer NINE_JF = 93;//商城（积分）
        public static Map<Integer, String> KEY_VALUE = new LinkedHashMap<Integer, String>() {{
            put(ONE, "公用");
            put(TWO, "首页");
            put(THREE, "资讯");
            put(FOUR, "评选");
            put(FIVE, "赛场");
            put(SIX, "视频");
            put(SEVEN, "公益");
            put(EIGHT, "旅游");
            put(NINE_INDEX, "商城(首页)");
            put(NINE_MS, "商城（免税）");
            put(NINE_XN, "商城（虚拟）");
            put(NINE_JF, "商城（积分）");
        }};
    }

    /**
     * 轮播图或轮播图
     */
    public static class HqAM {
        public static final Integer GG = 1;//广告位
        public static final Integer LB = 2;//轮播图
    }

    /**
     * 积分管理
     */
    public static class HqScore {
        public static final Integer TB = 1;//T币
        public static final Integer JF = 2;//积分
        public static final Integer HD = 1;//获得
        public static final Integer SY = 2;//使用
        //来源类型
        public static final Integer DD = 0;//订单
        public static final Integer CZ = 1;//充值
        public static final Integer PL = 3;//评论
        public static final Integer JC = 4;//竞猜
        //来源结束
        public static final Integer IS_OVER = 1;//过期
        public static final Integer NOT_OVER = 0;//未过期
    }

    /**
     * 用户地址
     */
    public static class HqMA {
        public static final Integer NOT = 0;//不是默认地址、不删除
        public static final Integer YES = 1;//默认地址、删除
    }

    /**
     * 竞猜
     */
    public static class GetQuizQuestion {
        public static final Integer NOT_STARTED = 0;//未开始
        public static final Integer START = 1;//进行中
        public static final Integer END = 2;//已结束
    }

    public static class Member {
        public static final int MEMBER_TYPE = 1;//普通用户
        public static final String RESET_PASSWORD = "111111";
        public static final String LOGIN_MEMBER = "LOGINMEMBER";
        public static final String PHONE_CODE = "PHONECODE";//手机验证码
        public static final String PIC_CODE = "PICCODE";//图片验证码
        public static final String DISCUZ_LOGIN_OUT = "DISCUZ_LOGIN_OUT";//discuz 论坛退出key
        public static final String DISCUZ_LOGIN = "DISCUZ_LOGIN";//discuz 论坛登录key
        public static class ThirdPartyUsers{
            public static final String LOGIN_THIRD_PARTY_USER = "LOGINTHIRDPARTYUSER";

        }
    }

    /**
     * 性别
     */
    public static class Gender {
        public static final int NO_ASK = 0;//不限
        public static final int GIRl = 1;//女
        public static final int MAN = 2;//男
        public static Map<Integer, String> GENDER_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
            put(NO_ASK, "不限");
            put(GIRl, "女");
            put(MAN, "男");
        }};
    }

    public static class RefundRequest{
        public static class GoodsStatus{
            public static int CUSTOMER_SERVICE=-2;//待客服处理
            public static int SERVICE_CENTRE=-1;//待服务中心处理
            public static int RECEIPTOFGOODS=0;//待收货
            public static int SHIPPED=1;//已发货
            public static int GOODS_RECEIPT=2;//已收货
            public static int SUCCESS=3;//退款成功
            public static int CANCEL=4;//取消退款
            public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                put(CUSTOMER_SERVICE, "待客服处理");
                put(SERVICE_CENTRE, "待服务中心处理");
                put(RECEIPTOFGOODS, "待收货");
                put(SHIPPED, "已发货");
                put(GOODS_RECEIPT, "已收货");
                put(SUCCESS, "成功");
                put(CANCEL, "取消");
            }};
        }
        public static class RefundType{
            public static int EXCHANGE_GOODS=0;//换货
            public static int RETURN_GOOODS=1;//退货
        }
        public static class CustomerServiceStatus{
            public static int REJECT=-1;//驳回
            public static int HANDLE=0;//待处理
            public static int AGREE=1;//同意
            public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                put(REJECT, "驳回");
                put(HANDLE, "待处理");
                put(AGREE, "同意");
            }};
        }
    }

    public static class OrderGoods {
        public static class RefundStatus {
            public static int NOT_APPLY = 0;//未申请
            public static int APPLY = 1;//退款申请等待卖家确认
            public static int REJECT = 2;//卖家不同意协议，等待买家修改(驳回)
            public static int AGREE = 3;//退款申请达成;等待买家发货
            public static int RECEIPT = 4;//买家已退货;等待卖家确认收货
            public static int CLOSE = 5;//关闭/失败
            public static int SUCCESS = 6;//成功
            public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                put(NOT_APPLY, "未申请");
                put(APPLY, "申请中");
                put(REJECT, "驳回");
                put(AGREE, "同意");
                put(RECEIPT, "等待收货");
                put(CLOSE, "关闭");
                put(SUCCESS, "成功");
            }};
        }
    }


    public static class HqNews {
        public static final Integer HAVE_IMG = 1;//有图片
        public static final Integer NOT_IMG = 0;//无图片
        public static final Integer TO_HOME = 1;//推荐到首页
        public static final Integer NOT_TO_HOME = 0;//不推荐到首页
        public static final Integer YES_STATUS = 1;//已发布
        public static final Integer NOT_STATUS = 0;//未发布
        public static final Integer LOOKED = 0;//默认浏览数量
        public static final Integer NEWSS = 0;//资讯
        public static final Integer TRIP = 1;//旅游
        public static final Integer AUTO = 0;//自动
        public static final Integer MANUALLY = 1;//手动
    }

    public static class HqVideo {
        public static final Integer NOT_STATUS = 0;//待发布
        public static final Integer YES_STATUS = 1;//已发布
    }

    public static class Order {
        public static String PREFIX = "DD";
        public static String state = "state";
        public static String tradeNo = "tradeNo";
        public static final Integer IsUseScore_NOT = 0;//未使用积分
        public static final Integer IsUseScore_YES = 1;//使用积分

        public static class Status {
            public static int WAIT_PAY = 0; //待付款
            public static int WAIT_SEND = 1;//待发货
            public static int SENDED = 2;//已发货
            public static int SUCCESS = 3; //成功
            public static int CANCEL = 4; //取消
            public static int REFUSE = 5; //拒收
            public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                put(WAIT_PAY, "待付款");
                put(WAIT_SEND, "待发货");
                put(SENDED, "已发货");
                put(SUCCESS, "交易成功");
                put(CANCEL, "订单取消");
                put(REFUSE, "订单拒收");
            }};
        }

        public static class Type {
            public static final Integer MS = 1;//免税
            public static final Integer XN = 2;//虚拟
            public static final Integer JF = 3;//积分
            public static final Integer ZC = 4;//众筹
            public static final Integer ROLE_SELECT = 5;//角色选拔
            public static final Integer TB_RECHARGE = 6;//T币充值
        }
    }

    public static class Score {
        public static final Long SCORE_OVER_TIME = 1000L * 60L * 60L * 24L * 365L * 2L;
    }

    public static class AutoLogin {
        public static final String AUTO_LOGIN_KEY = "MEMBER_AUTO_LOGIN_KEY";
        public static final Integer AUTO_LOGIN_SECOND = 60 * 60 * 24 * 14;
    }

    public static class SingleLogin {
        public static final String SINGLE_LOGIN_KEY = "USER_SINGLE_LOGIN_KEY";
        public static final Integer SINGLE_LOGIN_SECOND = 60 * 60 * 12;
    }

    public static class HqGoods {
        public static final Integer MS_GOODS = 1;//免税商品
        public static final Integer XN_GOODS = 2;//虚拟商品
        public static final Integer JF_GOODS = 3;//积分商品
        public static final Integer SJ_GOODS = 1;//上架
        public static final Integer XJ_GOODS = 0;//下架
        public static final Integer DEL_GOODS = 1;//删除
        public static final Integer NOT_DEL_GOODS = 0;//未删除
        public static final Integer NOT_EXPIRE = 0;//不过期
        public static final Integer YES_EXPIRE = 1;//过期
        public static final Integer NOT_PHONE_ORDER = 1;//过期
        public static final Integer YES_PHONE_ORDER = 1;//过期
    }

    public static class HqCrowd {
        public static final Integer READY_CROWD = 0;//准备中
        public static final Integer START_CROWD = 1;//筹款中
        public static final Integer SUCCESS_CROWD = 2;//众筹成功
        public static final Integer FAIL_CROWD = 3;//众筹失败
        public static final Integer WSFX = 0;//无私奉献
        public static final Integer YC = 1;//有偿
    }

    /**
     * 评选
     */
    public static class Choose {
        /**
         * 类型
         */
        public static class Type {
            public static final Integer MOST = 1;//评选之最
            public static final Integer EVENTS = 2;//时事评选
        }

        /**
         * 状态
         */
        public static class Status {
            public static final Integer NO_START = 1;//未开始
            public static final Integer STARTING = 2;//进行中
            public static final Integer END = 3;//已结束
            public static final Integer HAD_DOWN_MARKETABLE = 4;//已下架
            public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                put(NO_START, "未开始");
                put(STARTING, "进行中");
                put(END, "已结束");
                put(HAD_DOWN_MARKETABLE, "已下架");

            }};
        }

        /**
         * 状态
         */
        public static class RoleSelectStatus {
            public static final Integer NO_START = 1;//未开始
            public static final Integer SIGN_STARTING = 2;//报名进行中
            public static final Integer VOTE_STARTING = 3;//投票进行中
            public static final Integer END = 4;//已结束
            public static final Integer HAD_DOWN_MARKETABLE = 5;//已下架
            public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                put(NO_START, "未开始");
                put(SIGN_STARTING, "报名进行中");
                put(VOTE_STARTING, "投票进行中");
                put(END, "已结束");
                put(HAD_DOWN_MARKETABLE, "已下架");

            }};
        }

        /**
         * 拉票
         */
        public static class CANVASS {
            public static class Status {
                public static final int WAIT_AUDIT = 0;//待审核
                public static final int HAD_REJECT = 1;//已驳回
                public static final int HAD_PASS = 2;//已通过
                public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                    put(WAIT_AUDIT, "待审核");
                    put(HAD_REJECT, "已驳回");
                    put(HAD_PASS, "已通过");
                }};
            }
        }

        /**
         * 角色选拔订单
         */
        public static class RuleManagerOrder {
            public static class Status {
                public static final int WAIT_PAY = 0;//待支付
                public static final int WAIT_AUDIT = 1;//待审核
                public static final int HAD_REJECT = 2;//已驳回
                public static final int HAD_PASS = 3;//已通过
                public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                    put(WAIT_PAY, "待支付");
                    put(WAIT_AUDIT, "待审核");
                    put(HAD_REJECT, "已驳回");
                    put(HAD_PASS, "已通过");
                }};
            }
        }

        /**
         * 明星排行榜
         */
        public static class Ranking {
            public static class Status {
                public static final int WAIT_AUDIT = 1;//待审核
                public static final int HAD_REJECT = 2;//已拒绝
                public static final int HAD_PASS = 3;//已通过
                public static final int HAD_DISABLE = 4;//已禁用
                public static Map<Integer, String> STATUS_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
                    put(WAIT_AUDIT, "待审核");
                    put(HAD_REJECT, "已拒绝");
                    put(HAD_PASS, "已通过");
                    put(HAD_DISABLE, "已禁用");
                }};
            }
        }
    }

    public static class PayMethod {
        public static final int ALIPAY = 1;//支付宝
        public static final int WEIXIN = 2;//微信
        public static final int UNIONPAY = 3;//银联
        public static Map<Integer, String> PAY_KEY_VALUE = new LinkedHashMap<Integer, String>() {{
            put(ALIPAY, "支付宝");
            put(WEIXIN, "微信");
            put(UNIONPAY, "银联");
        }};
    }

    /**
     * 信息类型
     */
    public static class InforMation {
        /**
         * 教育背景
         */
        public static final int EDUCATION = 1;
        /**
         * 职业
         */
        public static final int PROFESSION = 2;
        /**
         * 评选规则
         */
        public static final int SELECTION_RULES = 3;
        /**
         * 意见反馈
         */
        public static final int FEEDBACK = 4;
        /**
         * 联系我们
         */
        public static final int LINK = 5;
        /**
         * 监护条例
         */
        public static final int TUTELAGE = 6;
        /**
         * 长影
         */
        public static final int C_YING = 7;
        /**
         * 长娱
         */
        public static final int C_YU = 8;
        /**
         * 环球100
         */
        public static final int HQ100 = 9;
        /**
         * 竞猜规则
         */
        public static final int QUIZ_RULE = 10;
        /**
         * 积分规则
         */
        public static final int JF = 11;
    }

    /**
     * 回报表
     */
    public static class HqReturnInfo {
        public static final Integer NOT_LIMIT = 0;//不限
        public static final Integer LIMIT = 1;//限制

        public static final Integer NOT_WULIU = 1;//无需物流
        public static final Integer QGBY_NOT_GAT = 2;//全国包邮（港澳台用户不可买）
        public static final Integer QGBY = 3;//全国包邮
    }

    /**
     * 投票
     */
    public static class Votes {
        public static class Type {
            public static final Integer MOST = 1;//评选之最
            public static final Integer EVENTS = 2;//时事评选
            public static final Integer STAR_RANKING = 3;//明星排行榜
            public static final Integer ROLE_SELECT = 4;//角色选拔
        }

        public static final String ROLE_SELECT = "role_select";//角色选拔
        public static final String ROLE_SELECT_VOTES = "role_select_votes";
        public static final String STAR_RANKING = "star_ranking";//明星排行
        public static final String STAR_RANKING_VOTES = "star_ranking_votes";
    }

    public static class HqFavourite {
        public static final Integer MOST = 1;//评选之最
        public static final Integer EVENTS = 2;//时事评选
        public static final Integer STAR_RANKING = 3;//明星排行榜
        public static final Integer ROLE_SELECT = 4;//角色选拔
        public static final Integer ROLE_CROWD = 5;//众筹
        public static final Integer ROLE_NEWS = 6;//资讯
        public static final Integer VIDEO = 7;//视频
    }


    public static class HqPraise {
        public static class Type {
            public static final Integer NEWS = 1;//资讯
            public static final Integer PL = 2;//评论
        }
    }

    public static class  MemberMessage{
        public static final Integer NOT = 0;//未读
        public static final Integer YES = 1;//已读
        public static final Integer NOT_DEL = 0;//未删除
        public static final Integer YES_DEL = 1;//已删除
        public static final Integer SYS = 1;//系统消息
    }

    public   static  class  SolrSearch{
        public static final Integer ONE = 1;//资讯
        public static final Integer TWO_ONE =21 ;//评选（角色选拔）
        public static final Integer TWO_TWO =22 ;//评选（评选之最）
        public static final Integer TWO_THREE =23 ;//评选（时事评选）
        public static final Integer THREE  = 3;//赛场
        public static final Integer FOUR = 4;//视频
        public static final Integer FIVE = 5;//公益
        public static final Integer SIX = 6;//旅游
        public static final Integer SEVEN_MS = 71;//商城（免税）
        public static final Integer SEVEN_XN = 72;//商城（虚拟）
        public static final Integer SEVEN_JF = 73;//商城（积分）
    }


    public static class Mail {
        public static final String MAIL = "cc5918@cyhnyl.com";
        public static final String PASSWORD = "Cc5919";
    }

    public static String getRandomJianHan(int len) {
        String ret = "";
        for (int i = 0; i < len; i++) {
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBK"); // 转成中文
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            ret += str;
        }
        return ret;
    }


    public static void main(String[] args) {
     /*   int a=(int)(Math.random()*2+1);
        int aa=(int)(Math.pow(-1, a));
        int aaa=(int)(Math.random()*100+1);
        int num=aa*aaa;*/
        String chineseName = getRandomJianHan(5);
        System.err.print(chineseName);
      /*  HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 100; i++) {
            String chineseName = getRandomJianHan(5);
            if (!set.contains(chineseName)) {
                set.add(chineseName);
            }
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.err.print(iterator.next() + "\n");
        }*/
    }

}
