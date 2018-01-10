package com.yueer.etc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yueer.etc.pojo.Comment;


public interface CommentMapper {
	int deleteByPrimaryKey(Integer cid);
	
	
	
    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    
    List<Comment> getCommentBySid(Integer sid);
    List<Comment> getCommentByMid(Integer mid);
    List<Comment> getCommentByLid(@Param("lid")Integer lid);
    List<Comment> getCommentByShid(Integer shid);
    void insert(Comment comment);
}