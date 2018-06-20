package com.ud.base.mapper;

import com.ud.base.entity.SystemDictionary;
import java.util.List;

public interface SystemDictionaryMapper {
    
    SystemDictionary selectByPrimaryKey(Long id);

    List<SystemDictionary> selectAll();

}