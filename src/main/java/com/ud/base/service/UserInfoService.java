package com.ud.base.service;

import org.springframework.transaction.annotation.Transactional;

import com.ud.base.entity.UserInfo;

@Transactional
public interface UserInfoService {
	
	/**
	 * 保存一个UserInfo对象
	 * 
	 * @param userInfo
	 */
	void save(UserInfo userInfo);
	
	/**
	 * 根据user id查询出UserInfo对象
	 * 
	 * @param id
	 * @return
	 */
	UserInfo selectByUserId(Long userId);
	
}
