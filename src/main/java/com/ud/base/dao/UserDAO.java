package com.ud.base.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ud.base.entity.User;

@Repository
@Table(name="user")
public interface UserDAO extends CrudRepository<User,Long> {

}
