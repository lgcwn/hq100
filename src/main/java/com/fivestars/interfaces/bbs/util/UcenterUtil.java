package com.fivestars.interfaces.bbs.util;

import com.fivestars.interfaces.bbs.client.Client;
import com.up72.hq.utils.MD5Util;
import com.up72.hq.utils.SNCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

/**
 * ================================================
 * Discuz! Ucenter API for JAVA
 * ================================================
 * 测试类
 * 示例：本类实现在如何实现在登入/登出，以及注册。
 * 
 * 更多信息：http://code.google.com/p/discuz-ucenter-api-for-java/
 * 作者：梁平 (no_ten@163.com) 
 * 创建时间：2009-2-20
 */
public class UcenterUtil {
	private static final Logger log= LoggerFactory.getLogger(UcenterUtil.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	/*	//testLogin();
		Client uc = new Client();
		String s = uc.uc_authcode("8485m7QEfsvnOg9tKGvAsxlwXpAzZU6LhFA04pD6N0XIYG1cJVDh2Th83Qcci130UPHbXp+UNG0","DECODE");
		System.out.println(s);*/
		//System.out.println(SNCode.getTradeNo()+"@qq.com");
		//System.out.println(MD5Util.toMD5("111111a"));
		//UcenterUtil.login("wenxuefeng","wenxuefeng");
		//UcenterUtil.logout();
		//UcenterUtil.register("liuguicheng1","liuguicheng1", SNCode.getTradeNo()+"@qq.com");
		editUser("liuguicheng","","2731600677@qq.com");
	}
	
	public static String login(String userName,String password){
		Client e = new Client();
		String result = e.uc_user_login(userName,password);
		LinkedList<String> rs = XMLHelper.uc_unserialize(result);
		if(rs.size()>0){
			int $uid = Integer.parseInt(rs.get(0));
			String $username = rs.get(1);
			String $password = rs.get(2);
			String $email = rs.get(3);
			log.warn("【环球论坛同步登录----账户："+$username+" ,密码："+$password+",邮箱："+$email+"】");
			if($uid > 0) {
				String $ucsynlogin = e.uc_user_synlogin($uid);
				log.warn("【环球论坛同步登录成功("+$ucsynlogin+")");
				return  $ucsynlogin;
			} else if($uid == -1) {
				log.error("【环球论坛】用户不存在,或者被删除");
			} else if($uid == -2) {
				log.error("【环球论坛】密码错误");
			} else {
				log.error("【环球论坛】未定义");
			}
		}else{
			System.out.println("Login failed");
			log.error("【环球论坛】登录失败;("+result+")");
		}
		return "";
	}
	
	public static String logout(){
		Client uc = new Client();
		//setcookie('Example_auth', '', -86400);
//		生成同步退出的代码
		String $ucsynlogout = uc.uc_user_synlogout();
		log.warn("【环球论坛同步退出成功("+$ucsynlogout+")】");
		return  $ucsynlogout;
	}

	public static void register(String userName,String password,String email){
		Client uc = new Client();
		//setcookie('Example_auth', '', -86400);
//		生成同步退出的代码
		String $returns = uc.uc_user_register(userName, password,email);
		int $uid = Integer.parseInt($returns);
		if($uid <= 0) {
			if($uid == -1) {
				log.error("【环球论坛同步注册失败(用户名不合法)】");
			} else if($uid == -2) {
				log.error("【环球论坛同步注册失败(包含要允许注册的词语)】");
			} else if($uid == -3) {
				log.error("【环球论坛同步注册失败(用户名已经存在)】");
			} else if($uid == -4) {
				log.error("【环球论坛同步注册失败(Email 格式有误)】");
			} else if($uid == -5) {
				log.error("【环球论坛同步注册失败(Email 不允许注册)】");
			} else if($uid == -6) {
				log.error("【环球论坛同步注册失败(该 Email 已经被注册)】");
			} else {
				log.error("【环球论坛同步注册失败(未定义)】");
			}
		} else {
			log.warn("【环球论坛同步注册成功("+$returns+")");
		}
	}

	public static void editUser(String userName,String newPwd,String email){
		Client uc = new Client();
		String $returns = uc.uc_user_edit(userName, "",newPwd,email,1,"","");
		int $uid = Integer.parseInt($returns);
		if($uid <= 0) {
			if($uid == 0) {
				log.error("【环球论坛编辑用户信息(没有任何修改)】");
			} else if($uid == -1) {
				log.error("【环球论坛编辑用户信息(旧密码不正确)】");
			} else if($uid == -4) {
				log.error("【环球论坛编辑用户信息(Email 格式有误)】");
			} else if($uid == -5) {
				log.error("【环球论坛编辑用户信息(Email 不允许注册)】");
			} else if($uid == -6) {
				log.error("【环球论坛编辑用户信息(该 Email 已经被注册)】");
			} else if($uid == -7) {
				log.error("【环球论坛编辑用户信息(没有做任何修改)】");
			} else if($uid == -8) {
				log.error("【环球论坛编辑用户信息(受保护的用户，没有权限修改)】");
			}
		} else {
			log.warn("【环球论坛用户信息修改成功("+$returns+")");
		}
	}

}
