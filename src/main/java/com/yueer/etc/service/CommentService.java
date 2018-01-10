package com.yueer.etc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yueer.etc.pojo.Comment;

public interface CommentService {
	/*public List<Comment> getComment(Integer xid,Integer ctype);*/
	
	public List<Comment> getCommentByLid(Integer lid);
	public List<Comment> getCommentBySid(Integer sid);
	public List<Comment> getCommentByMid(Integer mid);
	public List<Comment> getCommentByShid(Integer shid);
	public void insert(Comment record);
}
