package com.ud.base.mapper;

import com.ud.base.entity.UserInfo;
import java.util.List;

public interface UserInfoMapper {

	/**
	 * 根据id查找用户信息对象
	 * 
	 * @param id
	 * @return
	 */
    UserInfo selectByPrimaryKey(Long id);

    List<UserInfo> selectAll();
    
    /**
     * 根据用户id来查询 用户资料对象
     * 
     * @param userId
     * @return
     */
	UserInfo selectByUserId(Long userId);

}