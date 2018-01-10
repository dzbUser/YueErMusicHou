package com.yueer.etc.controller;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueer.etc.pojo.Comment;
import com.yueer.etc.service.CommentService;

@RequestMapping("/comment")
@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	//获取评论类型为歌手sid
	@RequestMapping("getCommentBySid")
	@ResponseBody
	public List<Comment> getCommentBySid(@Param("sid")Integer sid){
		
		List<Comment> comment=commentService.getCommentBySid(sid);
		return comment;
		
	}
	//获取评论类型为歌曲mid
	@RequestMapping("getCommentByMid")
	@ResponseBody
	public List<Comment> getCommentByMid(@Param("mid")Integer mid){
		
		
		List<Comment> comment=commentService.getCommentByMid(mid);
		return comment;
		
	}
	//获取评论类型为歌单lid
	
	@RequestMapping("getCommentByLid")
	@ResponseBody
	public List<Comment> getCommentByLid(Integer lid){
		
		System.out.println("contrllor"+lid);
		List<Comment> comment=commentService.getCommentByLid(lid);
		return comment;
		
	}
	
	//获取评论类型为动态shid
	@RequestMapping("getCommentByShid")
	@ResponseBody
	public List<Comment> getCommentByShid(@Param("shid")Integer shid){
		
		List<Comment> comment=commentService.getCommentByShid(shid);
		return comment;
		
	}
	
	/**
	 * 插入评论
	 * */
	//插入歌手评论
	@RequestMapping("insertCommentBySid")
	@ResponseBody
	public void insertCommentBySid(Integer uid,String content,Integer ctype,Integer sid){
		Comment comment =new Comment();
		comment.setUid(uid);
		comment.setContent(content);
		comment.setCtype(ctype);
		comment.setSid(sid);
		comment.setLid(0);
		comment.setMid(0);
		comment.setShid(0);
		comment.setTime(new Date());
		commentService.insert(comment);
		
	}
	
	//插入歌单评论
	@RequestMapping("insertCommentByLid")
	@ResponseBody
	public void insertCommentByLid(Integer uid,String content,Integer ctype,Integer lid){
		Comment comment =new Comment();
		comment.setUid(uid);
		comment.setContent(content);
		comment.setCtype(ctype);
		comment.setSid(0);
		comment.setLid(lid);
		comment.setMid(0);
		comment.setShid(0);
		comment.setTime(new Date());
		commentService.insert(comment);	
	}
	
	//插入歌曲评论
	@RequestMapping("insertCommentByMid")
	@ResponseBody
	public void insertCommentByMid(Integer uid,String content,Integer ctype,Integer mid){
		Comment comment =new Comment();
		comment.setUid(uid);
		comment.setContent(content);
		comment.setCtype(ctype);
		comment.setSid(0);
		comment.setLid(0);
		comment.setMid(mid);
		comment.setShid(0);
		comment.setTime(new Date());
		commentService.insert(comment);	
	}
	
	//插入动态评论
	@RequestMapping("insertCommentByShid")
	@ResponseBody
	public void insertCommentByShid(Integer uid,String content,Integer ctype,Integer shid){
		Comment comment =new Comment();
		comment.setUid(uid);
		comment.setContent(content);
		comment.setCtype(ctype);
		comment.setSid(0);
		comment.setLid(0);
		comment.setMid(0);
		comment.setShid(shid);
		comment.setTime(new Date());
		commentService.insert(comment);	
	}
}
