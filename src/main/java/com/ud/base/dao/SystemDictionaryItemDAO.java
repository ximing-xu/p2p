package com.ud.base.dao;

import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ud.base.entity.SystemDictionaryItem;

@Repository
@Table(name="systemDictionaryItem")
public interface SystemDictionaryItemDAO extends CrudRepository<SystemDictionaryItem,Long> {

}
