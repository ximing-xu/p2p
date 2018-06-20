package com.ud.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.base.dao.UserInfoDAO;
import com.ud.base.entity.UserInfo;
import com.ud.base.mapper.UserInfoMapper;
import com.ud.base.service.UserInfoService;

@Service
public class UserInfoServiceImpl extends BaseService implements UserInfoService {
	
	@Autowired
	private UserInfoDAO userInfoDAO;
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public void save(UserInfo userInfo) {
		userInfoDAO.save(userInfo);
	}


	@Override
	public UserInfo selectByUserId(Long userId) {
		return userInfoMapper.selectByUserId(userId);
	}

}
