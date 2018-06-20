package com.ud.base.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ud.base.entity.UserInfo;

@Repository
@Table(name="userInfo")
public interface UserInfoDAO extends CrudRepository<UserInfo,Long> {

}
