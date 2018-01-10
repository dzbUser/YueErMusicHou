package com.yueer.etc.service;



import java.util.List;

import com.yueer.etc.pojo.User;



public interface UserService {

    
	public User queryUserById(Integer id);
	//用户
	public User loginCheck(String username, String password);
	
	public User usernameCheck(String username);
	
	public int regist(User reuser);
	
	public User userimfByuid(Integer uid);
	
	public int updateUserByuid(User newuser);
	
	public List<User> recommend();
	//歌手
	public List<User> partliveSinger();

	public List<User> hotSinger();

	public List<User> allLiveSinger();
	
	
	
	

	
}
