package com.ud.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.base.dao.UserAccountDAO;
import com.ud.base.entity.UserAccount;
import com.ud.base.mapper.UserAccountMapper;
import com.ud.base.service.UserAccountService;

@Service
public class UserAccountServiceImpl extends BaseService implements UserAccountService {
	
	@Autowired
	private UserAccountDAO userAccountDAO;
	
	@Autowired
	private UserAccountMapper userAccountMapper;
	
	/**
	 * 保存一个用户 账户对象
	 * 
	 */
	@Override
	public void save(UserAccount userAccount) {
		userAccountDAO.save(userAccount);
		
	}
	
	/**
	 * 根据user id 查询
	 */
	@Override
	public UserAccount selectByUserId(Long userId) {
		
		return userAccountMapper.selectByUserId(userId);
	}

}
