package com.yueer.etc.mapper;

import com.yueer.etc.pojo.Comment;


public interface CommentMapper {
	int deleteByPrimaryKey(Integer cid);
	
	int insert(Comment record);
	
    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}