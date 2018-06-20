package com.ud.base.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ud.base.entity.UserAccount;

@Repository
@Table(name="userAccount")
public interface UserAccountDAO extends CrudRepository<UserAccount,Long> {

}
