package com.ud.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ud.base.entity.User;


public interface UserMapper {

	/**
	 * 根据id来查找一个用户
	 * 
	 * @param id
	 * @return
	 */
    User selectByPrimaryKey(Long id);
    
    /**
     * 查出所有用户
     * @return
     */
    List<User> selectAll();
    
    /**
     * 根据用户名来计算用户的个数
     * 
     * @param username
     * @return
     */
	int selectCountByUsername(String username);
	
	/**
	 * 根据用户名和密码来查询是否存在该用户
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	User findByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

}