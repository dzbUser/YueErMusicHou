package com.yueer.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueer.etc.mapper.CommentMapper;
import com.yueer.etc.pojo.Comment;
import com.yueer.etc.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;
	
	/*@Override
	public List<Comment> getComment(Integer xid, Integer ctype) {
		// TODO Auto-generated method stub
		if(ctype.intValue()==1){
			return commentMapper.getCommentBySid(ctype,xid);
		}	
		else if(ctype.intValue()==2){
			Integer lid =xid;
			System.out.println("service"+lid);
			return commentMapper.getCommentByLid(ctype,lid);
		}
		else if(ctype.intValue()==3){
			return commentMapper.getCommentByShid(ctype,xid);
		}
		else if(ctype.intValue()==4){
			return commentMapper.getCommentByMid(ctype,xid);
		}
		else
		return null;
	}
*/
	@Override
	public void insert(Comment record) {
		// TODO Auto-generated method stub
		commentMapper.insert(record);
	}

	@Override
	public List<Comment> getCommentByLid(Integer lid) {
		// TODO Auto-generated method stub
		return commentMapper.getCommentByLid(lid);
	}

	@Override
	public List<Comment> getCommentBySid(Integer sid) {
		// TODO Auto-generated method stub
		return  commentMapper.getCommentBySid(sid);
	}

	@Override
	public List<Comment> getCommentByMid(Integer mid) {
		// TODO Auto-generated method stub
		return  commentMapper.getCommentByMid(mid);
	}

	@Override
	public List<Comment> getCommentByShid(Integer shid) {
		// TODO Auto-generated method stub
		return  commentMapper.getCommentByShid(shid);
	}

}
