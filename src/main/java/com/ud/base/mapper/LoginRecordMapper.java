package com.ud.base.mapper;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.ud.base.entity.LoginRecord;

public interface LoginRecordMapper {



    /**
     * 通过用户名来过滤登录日志查询并进行分页
     * 
     * @param username
     * @return
     */
    Page<LoginRecord> findByPage(@Param(value = "username")String username);
}