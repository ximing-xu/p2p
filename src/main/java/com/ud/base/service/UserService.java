package com.ud.base.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {

	/**
	 * 用户注册
	 * @param username
	 * @param password
	 */
	public int register(String username, String password);
	
	
	/**
	 * 检查用户名是否存在
	 * 
	 * @param username
	 * @return
	 * 返回true表示该用户名 没有
	 */
	public boolean isWithoutUsername(String username);
	
	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @param ip 用户登录 的IP地址
	 * 
	 * @return 返回登录状态是否成功
	 */
	public int login(String username, String password, String ip);
	
	/**
	 * 用户注销
	 */
	public void logout();
	
	
}
