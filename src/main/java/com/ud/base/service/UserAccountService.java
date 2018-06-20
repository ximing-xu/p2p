package com.ud.base.service;

import org.springframework.transaction.annotation.Transactional;

import com.ud.base.entity.UserAccount;

@Transactional
public interface UserAccountService {
	
	/**
	 * 保存一个用户账户对象
	 * 
	 * @param userAccount
	 */
	void save(UserAccount userAccount);
	
	/**
	 * 根据用户User 对象的id查询一个UserInfo对象
	 * 
	 * @param userId
	 * @return
	 */
	UserAccount selectByUserId(Long userId);

}
