package com.ud.base.mapper;

import com.ud.base.entity.UserAccount;
import java.util.List;

public interface UserAccountMapper {


    UserAccount selectByPrimaryKey(Long id);

    List<UserAccount> selectAll();
    
    /**
     * 根据userId来查询UserInfo对象
     * 
     * @param id
     * @return
     */
	UserAccount selectByUserId(Long userId);

}