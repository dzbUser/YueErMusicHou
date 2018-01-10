package com.yueer.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueer.etc.mapper.UserMapper;
import com.yueer.etc.pojo.User;
import com.yueer.etc.service.UserService;




@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    

	public User queryUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.queryUserById(id);
	}


	@Override
	public List<User> partliveSinger() {
		// TODO Auto-generated method stub
		return userMapper.partliveSinger();
	}


	@Override
	public List<User> hotSinger() {
		// TODO Auto-generated method stub
		return userMapper.hotSinger();
	}


	@Override
	public List<User> allLiveSinger() {
		// TODO Auto-generated method stub
		return userMapper.allLiveSinger();
	}


	@Override
	public User loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.loginCheck(username,password);
	}


	@Override
	public User usernameCheck(String username) {
		// TODO Auto-generated method stub
		return userMapper.usernameCheck(username);
	}


	@Override
	public int regist(User reuser) {
		// TODO Auto-generated method stub
		return userMapper.regist(reuser);
	}


	@Override
	public User userimfByuid(Integer uid) {
		// TODO Auto-generated method stub
		return userMapper.userimfByuid(uid);
	}


	@Override
	public int updateUserByuid(User newuser) {
		// TODO Auto-generated method stub
		return userMapper.updateUserByuid(newuser);
	}


	@Override
	public List<User> recommend() {
		// TODO Auto-generated method stub
		return userMapper.recommend();
	}

}
