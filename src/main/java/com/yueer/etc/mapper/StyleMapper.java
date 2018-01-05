package com.yueer.etc.mapper;

import com.yueer.etc.pojo.Style;

public interface StyleMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Style record);

    int insertSelective(Style record);

    Style selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Style record);

    int updateByPrimaryKey(Style record);
}