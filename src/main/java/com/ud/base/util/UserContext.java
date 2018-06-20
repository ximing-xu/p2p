package com.ud.base.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ud.base.entity.User;

/**
 * 把当前用户存放到session中
 * 
 * @author Simon_Xu
 *
 */
public class UserContext {
	public static final  String USER_IN_SESSION="user";
	private UserContext(){}
	
	/**
	 * 通过RequestContextHolder来获取HttpSession
	 * 
	 * @return
	 */
	//获取session,在service层获取session要通过一个RequestContextHolder类
	private static  HttpSession getHttpSession(){
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request.getSession();
	}
	
	/**
	 * 把当前用户存放到session中
	 * @param user
	 */
	public static void setCurrent(User user){
		getHttpSession().setAttribute(USER_IN_SESSION, user);
	}
	
	/**
	 * 获取当前session中的用户
	 * @return
	 */
	public static User getCurrent(){
		return (User) getHttpSession().getAttribute(USER_IN_SESSION);
	}
	
	/**
	 * 把当前用户从session中移除,注销登录
	 */
	public static void removeCurrent(){
		getHttpSession().removeAttribute(USER_IN_SESSION);
	}
	
}
