package com.ud.base.service;

import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.ud.base.entity.LoginRecord;

@Transactional
public interface LoginRecordService {
	/**
	 * 保存用户登录日志
	 * 
	 * @param loginRecord
	 */
	void save(LoginRecord loginRecord);
	
	/**
	 * 使用pagehelper进行分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param username
	 * @return
	 */
	Page<LoginRecord> findByPage(int pageNum,int pageSize,String username);
	
}
