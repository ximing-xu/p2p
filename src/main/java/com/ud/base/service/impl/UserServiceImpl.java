package com.ud.base.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.base.dao.UserDAO;
import com.ud.base.entity.LoginRecord;
import com.ud.base.entity.User;
import com.ud.base.entity.UserAccount;
import com.ud.base.entity.UserInfo;
import com.ud.base.mapper.UserMapper;
import com.ud.base.service.LoginRecordService;
import com.ud.base.service.UserAccountService;
import com.ud.base.service.UserInfoService;
import com.ud.base.service.UserService;
import com.ud.base.util.HandleStatus;
import com.ud.base.util.MD5;
import com.ud.base.util.UserContext;

@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private UserAccountService userAccountService;
	
	@Autowired
	private LoginRecordService loginRecordService;
	
	/**
	 * 用户注册
	 */
	@Override
	public int register(String username, String password) {
		// 1：首先查询该用户名是否存在
		int count = userMapper.selectCountByUsername(username);

		// 2:如果不存在，那么就创建该用户并保存
		if (count <= 0) {

			User user = new User();
			user.setUsername(username);
			user.setPassword(MD5.encode(password));//进行密码加密
			user.setState(User.STATE_NORMAL);
			
			user = userDAO.save(user);//进过保存才会有id生成
			
			//创建一个UserInfo对象并保存
			UserInfo userInfo = new UserInfo();
			userInfo.setUserId(user.getId());
			userInfoService.save(userInfo);
			
			
			//创建一个UserAccount对象并保存
			UserAccount userAccount = new UserAccount();
			userAccount.setUserId(user.getId());
			userAccountService.save(userAccount);
			
			
			return HandleStatus.SUCCESS;
		}
		// 3:如果存在，那么就什么都不做，直接return一个状态吗给前端控制器
		return HandleStatus.FAILURE;

	}


	/**
	 * 检查用户名是否存在
	 */
	@Override
	public boolean isWithoutUsername(String username) {
		/**
		 * 查询结果如果大于0,那么表示该用户名已经 存在,则返回 的是true means username is not existed
		 */
		return userMapper.selectCountByUsername(username) <= 0;
	}


	/**
	 * 用户登录
	 */
	@Override
	public int login(String username, String password,String ip) {
		User user = userMapper.findByUsernameAndPassword(username,MD5.encode(password));//对密码进行加密在再来校对
		//创建登录日志对象,不管登录成功与否都要保存登录日志
		LoginRecord loginRecord = new LoginRecord();
		loginRecord.setIp(ip);
		loginRecord.setLoginDate(new Date());
		loginRecord.setUsername(username);
		
		
		if (user!=null) {
			//把当前用户放到session中
			UserContext.setCurrent(user);
			loginRecord.setState(LoginRecord.LOGIN_SUCCESS);
			loginRecordService.save(loginRecord);
			return HandleStatus.SUCCESS;
		}
		loginRecord.setState(LoginRecord.LOGIN_FAILURE);
		loginRecordService.save(loginRecord);
		return HandleStatus.FAILURE;
	}

	/**
	 * 用户注销,把USER_IN_SESSION从回话中移除
	 */
	@Override
	public void logout() {
		UserContext.removeCurrent();
		
	}

}
