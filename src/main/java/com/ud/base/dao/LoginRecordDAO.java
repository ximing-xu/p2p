package com.ud.base.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ud.base.entity.LoginRecord;

@Repository
@Table(name="loginRecord")
public interface LoginRecordDAO extends CrudRepository<LoginRecord, Long>{

}
