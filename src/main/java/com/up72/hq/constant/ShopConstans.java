package com.up72.hq.constant;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class ShopConstans {

    /****
     * 苏西会---店铺id
     * zhenliu  2015-04-07
     */
    public static final long PRODUCT_SHOPID = 2l;////364(shopuser2)


    public static final String PLAT_FORM_ALIPAY_ACCOUNT = "up72ktmt@163.com";
    /**
     * 电商平台标示
     */
    public static final String PRODUCT_STATUS = "upcloud-shop";
    /** 分类间的分隔符 */
    public static final String CATEGORY_SEPARATOR = " > ";
    /**
     * 电商平台用户拓展字段
     */
    public static class extend{

    }

    /**
     * 已审核店铺角色Id
     */
    public static final Long auditRoleId = 88L;
    /**
     * 待审核店铺角色Id
     */
    public static final Long waitAuditRoleId = 92L;

    /**
     * 公共属性
     */
    public static class Common {
        public static final String REGEX = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";

        /**
         * 开始时间不能为空
         */
        public static final String START_TIME_NULL_00 = "00";
        public static final String START_TIME_NULL = "开始时间不能为空";
        /**
         * 结束时间不能为空
         */
        public static final String END_TIME_NULL_01 = "01";
        public static final String END_TIME_NULL = "结束时间不能为空";
        /**
         * 创建时间不能为空
         */
        public static final String CREATE_TIME_NULL_03 = "03";
        public static final String CREATE_TIME_NULL = "创建时间不能为空";
        /**
         * 创建者不能为空
         */
        public static final String CREATOR_NULL_04 = "04";
        public static final String CREATOR_NULL = "不能为空";
        /**
         * 验证码
         */
        public static final String SECURITY_CODE = "SECURITY_CODE";

        /**
         * 同意
         */
        public static final String AGREE = "agree";
        /**
         * 驳回
         */
        public static final String REJECT = "reject";
        /**
         * 举例时返回多少条数据。如删除品牌时提醒用户，该品牌正在被以下5件商品使用。
         */
        public static final int COUNT_IN_USE = 5;

        /**
         * 删除状态 已删除
         */
        public static final Integer DELETE = 1;
        /**
         * 删除状态 未删除
         */
        public static final Integer UN_DELETE = 0;


        /**
         * 删除状态 已删除
         */
        public static final Integer IS_TRUE = 1;
        /**
         * 删除状态 未删除
         */
        public static final Integer IS_FALSE = 0;

    }

    /** 错误消息 */
    public static class errorMsg {
        /** 用户没有登录 */
        public static final String USER_NOT_LOGIN = "用户没有登录";
        /** 只有管理员才能操作 */
        public static final String ADMIN_ONLY_PAGE = "该页面只有管理员才能操作，请检查您的用户类型或用户权限是否正确。";
        /** 只有店铺才能操作 */
        public static final String STORE_ONLY_PAGE = "该页面只有店铺才能操作，请检查您的用户类型或用户权限是否正确。";
        /** 系统异常 */
        public static final String SYSTEM_ERROR = "系统出现异常，无法处理您的请求。";
        /** 用户代码错误 */
        public static final String USER_CODE_ERROR = "登录用户的代码为空，系统无法判断用户的角色，请联系管理员。";
        /** 错误页面 */
        public static final String COMMON_PAGE_ERROR = "您无权操作该页面，请检查您的用户类型或用户权限是否正确。";
        /** 找不到对应的店铺 */
        public static final String CANT_FIND_STORE = "根据用户ID找不到对应的店铺，请联系管理员。";
    }


    /**
     * 订单
     */
    public static class Order {
        /**
         * 订单锁定时间
         */
        public static final Long LOCK_EXPIRE = 1000L * 60L * 40L;

        public static final String EXPIRE_INTERVAL = "EXPIRE_INTERVAL";

        public static class isInvoice {
            public static final Integer YES = 1;
            public static final Integer NO = 0;
        }

        public static class Status {
            public static final int WAIT_PAY = 0; //待付款
            public static final int WAIT_SEND = 10;//待发货
            public static final int SENDED = 20;//已发货
            public static final int SUCCESS = 30; //成功
            public static final int CLOSED = 40; //关闭

            public static class Word{
                public static final String ALL = "all";
                public static final String NOT_PAID = "notPaid";
                public static final String NOT_SEND = "notSend";
                public static final String HAS_SEND = "hasSend";
                public static final String NOT_COMMENT = "notComment";
            }
        }

        public static class IsReal{
            public static final int VIRTUAL = 0;
            public static final int REAL = 1;
        }

        public class Type {
            /**
             * 实体订单
             */
            public static final int ORDER_TYPE_REAL = 0;
            /**
             * 虚拟订单
             */
            public static final int ORDER_TYPE_VIRTUAL = 1;
            /**
             * 点餐订单
             */
            public static final int ORDER_TYPE_MEAL = 2;

            /**
             * O2O订单
             */
            public static final int ORDER_TYPE_O2O = 9;
        }

    }

    public static class refund {
        public static class paymentMethod {
            /**
             * 退款至余额
             */
            public static final String BALANCE = "0";
            /**
             * 退款至支付宝
             */
            public static final String ALIPAY = "1";
        }

        public static class status {
            /** 0：未申请 */
            public static Integer STATUS_NOT_APPLY = 0;
            /**
             * 1：退款申请等待卖家确认
             */
            public static Integer STATUS_APPLY_WAIT_SELLER = 1;
            /**
             * 10：卖家不同意协议，等待买家修改
             */
            public static Integer STATUS_SELLER_REJECT = 10;
            /**
             * 11：退款申请达成，等待买家发货
             */
            public static Integer STATUS_SELLER_AGREE = 11;
            /**
             * 20：买家已退货，等待卖家确认收货
             */
            public static Integer STATUS_BUYER_RETURNS = 20;
            /**
             * 30：退款关闭
             */
            public static Integer STATUS_CLOSE = 30;
            /**
             * 40：退款成功
             */
            public static Integer STATUS_SUCCESS = 40;
        }
    }

    public static class Products {
        public static final Integer MARKETABLE = 1; //上架
        public static final Integer UNDER_MARKETABLE = 0; //下架
    }

    /**
     * 支付
     */
    public static class payment {
        public static class type {
            /**
             * 线上支付
             */
            public static final String ONLINE = "oneline";
            /**
             * 线下支付
             */
            public static final String OFFLINE = "线下支付";
        }

        public static class paymentType {
            /**
             * 余额支付
             */
            public static final Integer BALANCE = 0;
            /**
             * 支付宝支付
             */
            public static final Integer ALIPAY = 1;
        }
    }

    /**
     * 商家支付宝
     */
    public static class PaymentParter {
        /**
         * 对象不能为空
         */
        public static final String OBJECT_NULL_1 = "1";
        /**
         * 对象不能为空
         */
        public static final String OBJECT_NULL = "对象不能为空";
        /**
         * 合租者ID不能为空
         */
        public static final String OBJECT_PARTNER_NULL_2 = "2";
        /**
         * 合作者ID不能为空
         */
        public static final String OBJECT_PARTNER_NULL = "合作者ID不能为空";
        /**
         * 合作身份者ID，以2088开头由16位纯数字组成的字符串
         */
        public static final String OBJECT_PARTNER_POSITIVE_3 = "3";
        /**
         * 合作身份者ID，以2088开头由16位纯数字组成的字符串
         */
        public static final String OBJECT_PARTNER_POSITIVE = "合作身份者ID,以2088开头由16位纯数字组成的字符串 ";
        /**
         * 该记录经存在
         */
        public static final String OBJECT_PARTNER_UNIQUE_4 = "4";
        /**
         * 该记录经存在
         */
        public static final String OBJECT_PARTNER_UNIQUE = "该记录经存在";
        /**
         * 商户的私钥不能为空
         */
        public static final String OBJECT_PARTNER_KEY_NULL_5 = "5";
        /**
         * 商户的私钥不能为空
         */
        public static final String OBJECT_PARTNER_KEY_NUll = "商户的私钥不能为空";
        /**
         * 商户私钥由数字和字母组成
         */
        public static final String OBJECT_PARTNER_KEY_6 = "6";
        /**
         * 商户私钥由数字和字母组成
         */
        public static final String OBJECT_PARTNER_KEY = "商户的私钥不能为空";
    }

    /**
     * 购物车操作符
     */
    public static class Cart {
        /**
         * 购物车中的商品
         */
        public static final String ITEM = "item";
        /**
         * 总价格
         */
        public static final String TOTAL = "total";
        /**
         * 加数量
         */
        public static final String PLUS = "plus";
        /**
         * 减数量
         */
        public static final String MINUS = "minus";
        /**
         * 购物车缓存的key
         */
        public static final String KEY = "cart";
        /**
         * 购物车缓存的失效时间
         */
        public static final int SECOND = 60 * 60 * 12;
        /**
         * 用户所选区域的失效时间
         */
        public static final int REGION_TIME = 60 * 60 * 12 * 3;
        /**
         * 用户所选区域的失效时间
         */
        public static final int PHONE_CODE_TIME = 60 * 10;
        /**
         * 美食
         */
        public static final String FOODS = "FOODS-";
        /**
         * 购买方式
         */
        public static class buyType {
            /**
             * 单品
             */
            public static final int SINGLE_GOODS = 0;
            /**
             * 活动
             */
            public static final int ACTIVITY = 1;
            /**
             * 组合
             */
            public static final int GROUP = 2;
        }
    }

    public static class User {
        public static class Status{
            /** 成功 */
            public static final String SUCCESS = "success";
            /** 失败 */
            public static final String ERROR = "error";
            /** 未激活 */
            public static final String NONACTIVATED = "nonactivated";
        }
        /**
         * 激活状态 *
         */
        public static final Integer ENABLE = 1;
        /**
         * 未激活状态 *
         */
        public static final Integer DISABLE = 0;
        /**
         * 用户session 标识
         */
        public static final String LOGINUSER = "loginUser";
        /**
         * 默认 *
         */
        public static final String DEFAULT = "1";
        /**
         * 不默认 *
         */
        public static final String ISDEFAULT = "0";
        /**
         * 店铺登录用户session标识
         */
        public static final String AUTHUSER = "authUser";
    }

    /**
     * @author wgf
     * @version V1.0
     * @Description: 图片相关
     * @date 2014-7-24 上午10:43:52
     */
    public static class Img {
        /**
         * 小图缩放比例 *
         */
        public static final float THUMBNAIL_SCALE = 0.3f;
        /**
         * 中图缩放比例 *
         */
        public static final float MEDIUM_SCALE = 0.7f;

        /**
         * 原图缩放名称
         */
        public static final String SOURCE_SCALE_NAME = "_imgsmall";
        /**
         * 规格图缩放小图名称
         */
        public static final String GG_SCALE_SMALL_NAME = "_ggsmall";
        /**
         * 规格图缩放中图名称
         */
        public static final String GG_SCALE_MIDDLE_NAME = "_ggmiddle";
        /**
         * 每种规格最多几张图
         */
        public static final int IMG_COUNT_LIMIT = 5;
    }


    /**
     * 店铺审核
     */
    public static class Shops {
        public static class status {
            /**
             * 审核不通过
             */
            public static final Integer UN_AUDITING = -1;
            /**
             * 等待审核
             */
            public static final Integer WAIT_AUDITING = 0;
            /**
             * 审核通过
             */
            public static final Integer AUDITING = 1;

            /**
             * 店铺审核活动状态：不通过
             */
            public static final Integer UN_PROMOTION = 0;
            /**
             * 店铺审核活动状态：通过
             */
            public static final Integer PROMOTION = 1;

        }

        public static class rank {
            public static final Integer ONE_BRANK = 1;
        }

        public static class business {
            /**
             * 店铺营业
             */
            public static final Integer IS_OPEN = 1;
            /**
             * 店铺关闭
             */
            public static final Integer IS_CLOSE = 0;

        }

        public static class delete {
            /**
             * 店铺删除
             */
            public static final Integer IS_DELTE = 0;
            /**
             * 店铺不删除
             */
            public static final Integer UN_DELTE = 1;
        }
    }

    /**
     * @author wgf
     * @version V1.0
     * @Description:商品
     * @date 2014-8-20 上午10:43:52
     */
    public static class Goods {
        /**
         * 未删除 *
         */
        public static final int DELETE_FLAG_NOT = 0;
        /**
         * 已删除*
         */
        public static final int DELETE_FLAG_YES = 1;

    }

    /**
     * @author wgf
     * @version V1.0
     * @Description:商品消费码
     * @date 2014-8-20 上午10:43:52
     */
    public static class GoodsCode {
        /**
         * 未使用 *
         */
        public static final int NOT_USE = 0;
        /**
         * 已使用*
         */
        public static final int USED = 1;
        /**
         * 已作废*
         */
        public static final int ENABLE = 2;

        public static final int CODE_LENGTH = 8;

    }

    /**
     * 广告管理
     * WINDOW_TYPE:位置类型
     * IS_PLATFORM:广告所属平台
     * AD_TYPE:广告类型
     * APPLY_STATUS:广告申请状态,3,4,5由系统自动控制
     *
     * @author LHY 2014-8-23 下午03:37:55
     */
    public static class Advertise {
        /**
         * 首页*
         */
        public static final int WINDOW_TYPE_0 = 0;
        /**
         * 列表页*
         */
        public static final int WINDOW_TYPE_1 = 1;
        /**
         * 登陆页*
         */
        public static final int WINDOW_TYPE_2 = 2;
        /**
         * 商品详情页*
         */
        public static final int WINDOW_TYPE_3 = 3;
        /**
         * 平台广告*
         */
        public static final int IS_PLATFORM_0 = 0;
        /**
         * 店铺广告*
         */
        public static final int IS_PLATFORM_1 = 1;
        /**
         * 文字*
         */
        public static final int AD_TYPE_0 = 0;
        /**
         * 图片*
         */
        public static final int AD_TYPE_1 = 1;
        /**
         * 待审核*
         */
        public static final int APPLY_STATUS_0 = 0;
        /**
         * 审核未通过*
         */
        public static final int APPLY_STATUS_1 = 1;
        /**
         * 审核已通过*
         */
        public static final int APPLY_STATUS_2 = 2;
        /**
         * 上线显示*
         */
        public static final int APPLY_STATUS_3 = 3;
        /**
         * 已经下线*
         */
        public static final int APPLY_STATUS_4 = 4;
        /**
         * 排队中*
         */
        public static final int APPLY_STATUS_5 = 5;

        /**
         * 未删除 *
         */
        public static final int DELETE_FLAG_NOT = 0;
        /**
         * 已删除*
         */
        public static final int DELETE_FLAG_YES = 1;
    }

    /**
     * 普通用户的账户管理
     * ACTIVE:是否激活
     * DELETE:是否删除
     * TYPE:操作类型
     * SUCCESS:操作结果
     *
     * @author LHY 2014-8-26 下午02:39:01
     */
    public static class UserAccount {
        /**
         * 否*
         */
        public static final int ACTIVE_0 = 0;
        /**
         * 是*
         */
        public static final int ACTIVE_1 = 1;
        /**
         * 否*
         */
        public static final int DELETE_0 = 0;
        /**
         * 是*
         */
        public static final int DELETE_1 = 1;
        /**
         * 充值*
         */
        public static final int TYPE_0 = 0;
        /**
         * 消费*
         */
        public static final int TYPE_1 = 1;
        /**
         * 退款*
         */
        public static final int TYPE_2 = 2;
        /**
         * 否*
         */
        public static final int SUCCESS_0 = 0;
        /**
         * 是*
         */
        public static final int SUCCESS_1 = 1;
    }

    /**
     * 消息
     *
     * @author
     * @version 1.0
     * @created 2014-8-29 上午10:42:18
     */
    public static class Message {
        /**
         * 发送者类型-系统*
         */
        public static final int SENDER_TYPE_0 = 0;
        /**
         * 类型-结算提醒*
         */
        public static final int TYPE_0 = 0;
        /**
         * 类型-活动通知*
         */
        public static final int TYPE_1 = 1;
        /**
         * 类型-广告*
         */
        public static final int TYPE_2 = 2;

        /**
         * 状态
         */
        public static class status {
            /**
             * 删除
             */
            public static final int DELETEED = -1;
            /**
             * 删除
             */
            public static final int FOREVER_DELETEED = -5;
            /**
             * 未读
             */
            public static final int UNREAD = 1;
            /**
             * 已读
             */
            public static final int READ = 0;
        }

        /**
         * 类型
         */
        public static class type {
            /**
             * 私有消息
             */
            public static final String PRIVATE = "PRIVATE";
            /**
             * 系统消息
             */
            public static final String GLOBAL = "GLOBAL";
        }

        /** 消息接收者类型*/

        public static class recType{
            /**
             * 后台用户
             */
            public static final Integer AUTH_USER = 0;

            /**
             * 前台会员
             */
            public static final Integer CUSTOMER = 1;
            /**
             * 所有后台用户
             */
            public static final Integer ALL_AUTH_USER = 2;
            /**
             * 所有前台会员
             */
            public static final Integer ALL_CUSTOMER = 3;
        }
        /** 消息发送者类型*/

        public static class sendUserType{
            /**
             * 后台用户
             */
            public static final Integer AUTHUSER = 0;
            /**
             * 前台会员
             */
            public static final Integer CUSTOMER = 1;


        }
    }


    /**
     * 提现
     */
    public static class Withdrawal {
        public static class status {
            /**
             * 等待审核
             */
            public static final Integer WAIT_AUDITING = 2;
            /**
             * 审核不通过
             */
            public static final Integer UN_AUDITING = 0;
            /**
             * 审核通过
             */
            public static final Integer AUDITING = 1;
        }

        public static class choose {
            /**
             * 0银行卡
             */
            public static final Integer WAIT_AUDITING = 0;
            /**
             * 1支付宝
             */
            public static final Integer UN_AUDITING = 1;
        }

        public static class type {
            /**
             * 0普通用户
             */
            public static final Integer WAIT_AUDITING = 0;
            /**
             * 1店铺
             */
            public static final Integer UN_AUDITING = 1;
        }
    }

    public static class product {
        /**
         * 商品类型 0:实体商品；1:虚拟商品；2:预约商品；3:点餐商品
         */
        public static class type {
            /**
             * 实体商品
             */
            public static final Integer ENTITY_PRODUCT = 0;
            /**
             * 虚拟商品
             */
            public static final Integer VIRTUAL_PRODUCT = 1;
            /**
             * 预约商品
             */
            public static final Integer RESERVATION_PRODUCT = 2;
            /**
             * 点餐商品
             */
            public static final Integer MEAL_PRODUCT = 3;
            /**
             * O2O商品
             */
            public static final Integer O2O_PRODUCT = 9;
        }

        public static class deleteFlag {
            /**
             * 已删除
             */
            public static final Integer DELETE = 1;
            /**
             * 未删除
             */
            public static final Integer UN_DELETE = 0;
        }
    }

    /**
     * 登录手机系统类型
     */
    public static class osType {
        /**
         * ios
         */
        public static final int IOS = 1;
        /**
         * 安卓
         */
        public static final int ANDROID = 0;

    }

    /**
     * 常量类contantClazz中的静态变量中，是否包含beIncludedObject对象
     *
     * @param contantClazz     一个常量类
     * @param beIncludedObject 一个对象（目前只支持Integer、Long类型）
     * @return boolean 如果包含则返回true，否则返回false
     * @throws Exception beIncludedObject对象为不支持的类型时，抛出异常
     * @author HuKaiXuan 2014-8-4 下午7:32:59
     */
    @SuppressWarnings("rawtypes")
    public static boolean includeConstant(Class contantClazz, Object beIncludedObject) throws Exception {
        // 如果两个参数任一一个为空，则说明不包含
        if (contantClazz == null || beIncludedObject == null) {
            return false;
        }
        Class beIncludedObjectClass = beIncludedObject.getClass();    // 被包含的对象类型
        // 是否超出支持的类型范围
        if (beIncludedObjectClass != Integer.class
                && beIncludedObjectClass != Long.class) {
            throw new Exception("Up72HelperConstant.includeConstant方法的beIncludedObject参数暂时只支持Integer、Long类型");
        }
        Field[] fields = contantClazz.getDeclaredFields();    // 常量类中的字段
        // 如果常量类中没有字段，说明不包含
        if (fields == null || fields.length <= 0) {
            return false;
        }
        // 遍历
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {    // 只查询静态变量
                try {
                    Object fieldValue = field.get(null);
                    if (fieldValue == null) {    // 如果变量为空，执行下一次遍历
                        continue;
                    }
                    // 对于基本类型的字段，可以只比较它们的toString()值
                    if (beIncludedObject.toString().equals(fieldValue.toString())) {
                        return true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 余额充值:线下充值状态
     * STATUS_0:未审核,STATUS_1:已审核,STATUS_2:废弃
     *
     * @author LHY 2014-10-24 上午11:12:39
     */
    public static class UserAccountOffline {
        public static final int STATUS_0 = 0;
        public static final int STATUS_1 = 1;
        public static final int STATUS_2 = 2;
    }

    public static class PointCard {
        public static class Status {
            public static final int OPEN_STATUS = 1;
            public static final int CLOSE_STATUS = 0;
        }

        public static class UseStatus {
            public static final int USE_TRUE = 1;
            public static final int USE_FALSE = 0;
        }

    }

    /**
     * 交易日志记录
     */
    public static class UserAccountLog {
        public static final int CARD_RECHARGE = 01; //点卡充值
        public static final int ALI_RECHARGE = 02;//支付宝充值
        public static final int OFFINE_RECHARGE = 03; //线下充值
        public static final int ADMIN_RECHARGE = 04;//后台充值
        public static final int INTEGRAL_RECHARGE = 05;//积分兑换充值

        public static final int ACCOUNT_COMSUME = 11;//余额消费
        public static final int ADMIN_ACCOUNT = 12;//线下提现

        public static final int ORDER_RETURN = 21;//订单退费
    }

    /**
     * 积分规则
     */
    public static class Integral {
        /**
         * 积分规则
         */
        public static final Integer RULES_0 = 0;
        /**
         * 兑换规则
         */
        public static final Integer RULES_1 = 1;

        public static final String ADD = "+";
        public static final String SUB = "-";
        public static final String EQUAL = "=";
        public static final String GT_EQUAL = ">=";
        public static final String LT_EQUAL = "<=";

        /**
         * 登录规则 列名称
         */
        public static class LoginRules {
            public static final Long ID = 1L;
            public static final String NAME = "登录积分规则";
            public static final String OPERATOR = "操作符";
            public static final String LOGINDAYS = "登录天数";
            public static final String GIVING = "赠送积分";
            public static final String ADDITIONAL = "追加积分";
        }

        /**
         * 订单规则 列名称
         */
        public static class ProductsRules {
            public static final Long ID = 2L;
            public static final String NAME = "商品积分规则";
            public static final String OPERATOR = "操作符";
            public static final String RATIO = "比例";
        }

        /**
         * 评论规则 列名称
         */
        public static class CommentRules {
            public static final Long ID = 3L;
            public static final String NAME = "评论积分规则";
            public static final String TYPE = "评论类型";
            public static final String OPERATOR = "操作符";
            public static final String GIVING = "赠送积分";
            public static final String ADDITIONAL = "追加积分";

            public static class TypeValues {
                /**
                 * 文字评论
                 */
                public static final Integer TEXT = 0;
                /**
                 * 图文评论
                 */
                public static final Integer TEXT_PIC = 1;
            }
        }

        /**
         * 兑换规则
         */
        public static class ExchangeRules {
            public static final Long ID = 4L;
            public static final String NAME = "积分兑换规则";
        }
    }

    public static class ChargbackRequest {
        public static class type {
            /**
             * 仅退款
             */
            public static final Integer TYPE_REFUND = 0;
            /**
             * 退货退款
             */
            public static final Integer TYPE_RETURN_REFUND = 1;
        }

        public static class goodsStatus {
            /**
             * 未收到货
             */
            public static final Integer STATUS_NOT_YET = 0;
            /**
             * 已收到货
             */
            public static final Integer STATUS_YES = 1;
        }

        public static class status {
            /**
             * 拒绝
             */
            public static final Integer STATUS_REJECT = -1;
            /**
             * 申请
             */
            public static final Integer STATUS_APPLY = 0;
            /**
             * 同意
             */
            public static final Integer STATUS_AGREE = 1;
        }

    }

    public static class ChargbackRequestLog {
        public static class type {
            /**
             * 买家
             */
            public static final Integer TYPE_BUYER = 0;
            /**
             * 卖家
             */
            public static final Integer TYPE_SELLER = 1;
        }

    }

    public static class Review {
        public static class show {
            /**
             * 显示
             */
            public static final Integer SHOW = 1;
            /**
             * 不显示
             */
            public static final Integer NO_SHOW = 0;

        }

        /**
         * 评论状态
         */
        public class status {
            //未评论
            public static final int NO_REVIEW = 0;
            //买家评论
            public static final int BUYER_REVIEW = 1;
            //卖家评论
            public static final int SELLER_REVIEW = 2;
            //双方已评论
            public static final int ALL_REVIEW = 3;
        }

        /**
         * 分值
         */
        public static class score {
            /**
             * 分值
             */
            public static final Integer ONE = 1;
            public static final Integer TWO = 2;
            public static final Integer THREE = 3;
            public static final Integer FOUTH = 4;
            public static final Integer FIVE = 5;

        }
    }

    /**
     * 用户的肤质(1油性,2干性,3中性,4混合性,5敏感性)
     */
    public static class customerSkin {
        /**
         * 油性
         */
        public static final int OIL = 1;
        /**
         * 干性
         */
        public static final int DRY = 2;
        /**
         * 中性
         */
        public static final int NORMAL = 3;
        /**
         * 混合性
         */
        public static final int MIX = 4;
        /**
         * 敏感性
         */
        public static final int SENSITIVE = 5;
        /**
         * 肤质对应的map
         */
        public static final Map<Integer, String> skinMap = new LinkedHashMap<Integer, String>() {{
            put(OIL, "油性");
            put(DRY, "干性");
            put(NORMAL, "中性");
            put(MIX, "混合性");
            put(SENSITIVE, "敏感性");
        }};
    }

    /**
     * 尚装虚拟商品卖家短信模版
     */
    public final static String VIRTUAL_BUYER_SMS_TEM = "vitual.buyer.sms.tem";

    /**
     * 尚装虚拟商品卖家短信模板
     */
    public final static String VIRTUAL_SELLER_SMS_TEM = "vitual.seller.sms.tem";
    /**
     * 物流发货买家短信模板
     */
    public final static String SHIPPING_BUYER_SMS = "shipping.buyer.sms";
    /**
     * 物流发货卖家短信模板
     */
    public final static String SHIPPING_SELLER_SMS = "shipping.seller.sms";
    /**
     * 退货退款短信模版
     */
    public final static String RETURNS_SMS = "returns_sms";

    /**
     * 忘记密码短信模版
     */
    public final static String FORGETPASSWORD_SMS = "sms.forgetpassword";
    /**
     * 活动开始短信
     */
    public final static String SIGNUP_SMS = "sms.signup";

    /**
     * 手机注册短信模版
     */
    public final static String SMS_REGIST = "sms.regist";
    /**
     * 图片上传路径
     */
    public final static String UPLOAD_IMG = "/upload/";

    /**
     * 标签
     */
    public static class tag {
        /**
         * 商品
         */
        public static final int GOODS = 1;
        /**
         * 店铺
         */
        public static final int STORE = 2;
    }

    /**
     * 评论状态
     */
    public class ReviewStatus {
        //未评论
        public static final int NO_REVIEW = 0;
        //买家评论
        public static final int BUYER_REVIEW = 1;
        //卖家评论
        public static final int SELLER_REVIEW = 2;
        //双方已评论
        public static final int ALL_REVIEW = 3;
    }

    public static class InvoiceInfo {
        public static class invoiceMode {
            /**
             * 普通纸质发票
             */
            public static final Integer TYPE_1 = 1;
        }

        public static class invoiceTitle {
            /**
             * 个人
             */
            public static final Integer PERSONAL = 1;
            /**
             * 单位
             */
            public static final Integer COMPANY = 2;
        }

        public static class invoiceContent {
            /**
             * 1.明细；
             */
            public static final Integer TYPE_1 = 1;
            /**
             * 2.办公用品
             */
            public static final Integer TYPE_2 = 2;
            /**
             * 3.电脑配件
             */
            public static final Integer TYPE_3 = 3;
            /**
             * 4.耗材
             */
            public static final Integer TYPE_4 = 4;
        }
    }

    /**
     * 收货地址
     */
    public static class ConsigneeAddress{
        /** 默认 */
        public static final Integer DEFAULT_YES = 1;
        /** 非默认 */
        public static final Integer DEFAULT_NO = 0;
    }

    /**
     * 财务记录
     */
    public static class Finance{
        public static class FinanceType{
            public static final Integer IN_COME = 0;
            public static final Integer SPENDING = 1;
        }
        public static class PaymentMethod{
            public static final Integer BALANCE = 0;
            public static final Integer ALIPAY = 1;
        }
    }


    public static String[] MOBILE_AGENTS = {"iphone", "android", "phone",
            "mobile", "wap", "netfront", "java", "opera mobi", "opera mini",
            "ucweb", "windows ce", "symbian", "series", "webos", "sony",
            "blackberry", "dopod", "nokia", "samsung", "palmsource", "xda",
            "pieplus", "meizu", "midp", "cldc", "motorola", "foma", "docomo",
            "up.browser", "up.link", "blazer", "helio", "hosin", "huawei",
            "novarra", "coolpad", "webos", "techfaith", "palmsource",
            "alcatel", "amoi", "ktouch", "nexian", "ericsson", "philips",
            "sagem", "wellcom", "bunjalloo", "maui", "smartphone", "iemobile",
            "spice", "bird", "zte-", "longcos", "pantech", "gionee",
            "portalmmm", "jig browser", "hiptop", "benq", "haier", "^lct",
            "320x320", "240x320", "176x220", "w3c ", "acs-", "alav", "alca",
            "amoi", "audi", "avan", "benq", "bird", "blac", "blaz", "brew",
            "cell", "cldc", "cmd-", "dang", "doco", "eric", "hipt", "inno",
            "ipaq", "java", "jigs", "kddi", "keji", "leno", "lg-c", "lg-d",
            "lg-g", "lge-", "maui", "maxo", "midp", "mits", "mmef", "mobi",
            "mot-", "moto", "mwbp", "nec-", "newt", "noki", "oper", "palm",
            "pana", "pant", "phil", "play", "port", "prox", "qwap", "sage",
            "sams", "sany", "sch-", "sec-", "send", "seri", "sgh-", "shar",
            "sie-", "siem", "smal", "smar", "sony", "sph-", "symb", "t-mo",
            "teli", "tim-", "tsm-", "upg1", "upsi", "vk-v", "voda",
            "wap-", "wapa", "wapi", "wapp", "wapr", "webc", "winw", "winw",
            "xda", "xda-", "Googlebot-Mobile"};

    /** 状态冻结
     * zhenliu  2014-08-01
     * 冻结  解冻，处理  未处理
     * */
    public static enum Status {
        NORMAL("正常", 1), FREEZE("冻结", 0);
        private final String name;
        private final int index;

        private Status(String name, int index) {
            this.name = name;
            this.index = index;
        }

        public static String getName(int index) {
            for (Status c : Status.values()) {
                if (c.getIndex() == index) return c.name;
            }
            return null;
        }

        public String getName() { return name; }
        public int getIndex() { return index; }

        public static HashMap Status() {
            HashMap<String, Object> status = new HashMap<String, Object>();
            status.put("1", "正常");
            status.put("0", "冻结");
            return status;
        }
    }

}