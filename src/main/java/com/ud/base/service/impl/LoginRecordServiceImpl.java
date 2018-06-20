package com.ud.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ud.base.dao.LoginRecordDAO;
import com.ud.base.entity.LoginRecord;
import com.ud.base.mapper.LoginRecordMapper;
import com.ud.base.service.LoginRecordService;

@Service
public class LoginRecordServiceImpl extends BaseService implements LoginRecordService {
	@Autowired
	private LoginRecordDAO loginRecordDAO;
	
	@Autowired
	private LoginRecordMapper loginRecordMapper;
	
	/**
	 * 保存一个用户登录日志
	 */
	@Override
	public void save(LoginRecord loginRecord) {
		loginRecordDAO.save(loginRecord);
		
	}

	/**
	 * 使用PageHelper进行登录日志的分页查询
	 * 
	 */
	@Override
	public Page<LoginRecord> findByPage(int pageNum, int pageSize,String username) {
		PageHelper.startPage(pageNum, pageSize);
		return loginRecordMapper.findByPage(username);
	}

}
