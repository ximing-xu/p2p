package com.ud.base.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ud.base.entity.SystemDictionary;

@Repository
@Table(name="systemDictionary")
public interface SystemDictionaryDAO extends CrudRepository<SystemDictionary,Long> {

}
