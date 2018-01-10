package com.yueer.etc.mapper;

import java.util.List;

import com.yueer.etc.pojo.User;

public interface UserMapper {


	public User queryUserById(Integer uid);
	
	public User loginCheck(String username, String password);

	public User usernameCheck(String username);

	public int regist(User reuser);

	public User userimfByuid(Integer uid);
	
	public List<User> partliveSinger();

	public List<User> hotSinger();

	public List<User> allLiveSinger();

	public int updateUserByuid(User newuser);

	public List<User> recommend();



	
	
}
