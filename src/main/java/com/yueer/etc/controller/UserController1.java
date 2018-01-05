package com.yueer.etc.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yueer.etc.pojo.User1;
import com.yueer.etc.service.UserService;



@RequestMapping("/user1")
@Controller
public class UserController1 {
	
	@Autowired
	private UserService userService;

//	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
//	public ResponseEntity<User1> queryUserById(@PathVariable("userId")Integer userId){
//		
//		try {
//			//根据用户id查询用户
//			User1 user = userService.queryUserById(userId);
//			
//			return ResponseEntity.ok(user);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		//返回500
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//	}

	
	@RequestMapping("/show1")
	@ResponseBody
	public ModelAndView show1(User1 user){
		System.out.println(user);
//		String chiStr = null;
//		try {
//			chiStr = URLDecoder.decode(name, "utf-8");
//			System.out.println(chiStr);
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ModelAndView vm = new ModelAndView("test");
		vm.addObject("msg","json:"+user);
		return vm;
	}
	
	@RequestMapping("/show2")
	@ResponseBody
	public List<User1> show2(){
		List<User1> lists = new ArrayList<User1>();
		for(Long i=0L;i<5;i++)
		{
			User1 user  = new User1();
			user.setId(i);
			user.setUserName("name"+i);
			user.setAge(1);
			lists.add(user);
		}
		return lists;
	}
	
}
