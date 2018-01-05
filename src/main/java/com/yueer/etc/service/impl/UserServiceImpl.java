package com.yueer.etc.service.impl;

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

}
