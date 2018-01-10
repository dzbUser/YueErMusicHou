 package com.yueer.etc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueer.etc.pojo.User;
import com.yueer.etc.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<User> queryUserById(@PathVariable("uid")Integer uid){
		
		try {
			//鏍规嵁鐢ㄦ埛id鏌ヨ鐢ㄦ埛
			User user = userService.queryUserById(uid);
			
			return ResponseEntity.ok(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//杩斿洖500
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	/**
	 * 鐢ㄦ埛閮ㄥ垎
	 */
	//鐧诲綍
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public User logincheck(@Param("username") String username,@Param("password") String password){
		System.out.println(username+password);
		User user = userService.loginCheck(username,password);
		return user;
	}
	//娉ㄥ唽
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	@ResponseBody
	public int registcheck(@Param("username") String username,@Param("password") String password,
			@Param("name") String name,@Param("sex")String sex,@Param("email")String email){
		User user = userService.usernameCheck(username);
		if(user != null){
			//杩斿洖-1浠ｈ〃璐﹀彿宸插瓨鍦�
			return -1;
		}
		int num=0;
		User reuser  = new User();
		reuser.setUsername(username);
		reuser.setPassword(password);
		reuser.setName(name);
		reuser.setSex(sex);
		reuser.setEmail(email);
		//num杩斿洖1浠ｈ〃娉ㄥ唽鎴愬姛锛�
		num = userService.regist(reuser);
		return num;
		
	}
	/**
	 * 鏄剧ず涓汉淇℃伅
	 * 1.姝屾墜璇︾粏椤甸潰锛�
		姝屾墜浠嬬粛
	 * 2.鏈嬪弸椤甸潰锛�
		鑾峰彇鐢ㄦ埛淇℃伅
	 * 3.涓汉涓婚〉锛�
		鍏虫敞锛屽姩鎬侊紙寰呭畾锛夛紝绮変笣
	 */
	
	@RequestMapping(value = "/userImf/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public User userimfByuid(@PathVariable("uid") Integer uid){
		User userimf = userService.userimfByuid(uid);
		return userimf;
	}
	//淇敼涓汉淇℃伅
	@RequestMapping(value = "/updateUser/{uid}", method = RequestMethod.GET)
	@ResponseBody
	public int updateUserByuid(@PathVariable("uid") Integer uid,@Param("name") String name,@Param("content") String content,
			@Param("sex") String sex, @Param("year") String year,@Param("month") String month,@Param("day") String day
			){
		String birth = year+"-"+month+"-"+day;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd "); 
		Date birthday = new Date();
		try {
			birthday =  sdf.parse(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User newuser = new User();
		newuser.setUid(uid);
		newuser.setName(name);
		newuser.setContent(content);
		newuser.setSex(sex);
		newuser.setBirthday(birthday);;
		int num = userService.updateUserByuid(newuser);
		return num;
	}
	
	//闅忔満閫�3涓叧娉ㄩ噺杈冮珮鐨勭敤鎴锋垨姝屾墜
	@RequestMapping(value = "/recommend", method = RequestMethod.GET)
	@ResponseBody
	public List<User> recommend(){
		List<User> reuser = userService.recommend();
		return reuser;
	}
	/**
	 * 姝屾墜閮ㄥ垎
	 * @return
	 */
	//杩斿洖鍏ラ┗姝屾墜锛堟帹鑽愭瓕鎵嬶級
	@RequestMapping(value = "/partliveSinger", method = RequestMethod.GET)
	@ResponseBody
	public List<User> partliveSinger(){
		List<User> partliveSingers = userService.partliveSinger();
		return partliveSingers;
	}
	//杩斿洖鎵�鏈夌儹闂ㄦ瓕鎵嬶紙鎺ㄨ崘姝屾墜锛�	
	@RequestMapping(value = "/hotSinger", method = RequestMethod.GET)
	@ResponseBody
	public List<User> hotSinger(){
		List<User> hotSingers = userService.hotSinger();
		return hotSingers;
	}
	//杩斿洖鎵�鏈夊叆椹绘瓕鎵�
	@RequestMapping(value = "/allLiveSinger", method = RequestMethod.GET)
	@ResponseBody
	public List<User> allLiveSinger(){
		List<User> allLiveSingers = userService.allLiveSinger();
		return allLiveSingers;
	}
}
