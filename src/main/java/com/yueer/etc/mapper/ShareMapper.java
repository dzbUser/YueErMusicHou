package com.yueer.etc.mapper;

import com.yueer.etc.pojo.Share;

public interface ShareMapper {
    int deleteByPrimaryKey(Integer shareid);

    int insert(Share record);

    int insertSelective(Share record);

    Share selectByPrimaryKey(Integer shareid);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKey(Share record);
}