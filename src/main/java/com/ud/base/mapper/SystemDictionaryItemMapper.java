package com.ud.base.mapper;

import com.ud.base.entity.SystemDictionaryItem;
import java.util.List;

public interface SystemDictionaryItemMapper {


    SystemDictionaryItem selectByPrimaryKey(Long id);

    List<SystemDictionaryItem> selectAll();

}