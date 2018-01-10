package com.yueer.etc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueer.etc.pojo.Share;
import com.yueer.etc.service.ShareService;

@RequestMapping("/share")
@Controller
public class ShareController {
	@Autowired
	private ShareService shareService;
	
	//添加动态
	@RequestMapping("addShare")
	@ResponseBody
	public void addShare(Integer uid,Integer music,String content,String date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		Share share=new Share();
		share.setContent(content);
		share.setLikes(0);
		share.setUid(uid);
		share.setMusic(music);
		try {
			share.setTime(dateFormat.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(share.getTime());
		share.setVideo(" ");
		shareService.addShare(share);
	}
	//获取动态列表
	@RequestMapping("getAllShare")
	@ResponseBody
	public List<Share> getAllShare(){
		
		List<Share> share =shareService.getAllShare();
		return share;
	}
	
	//点赞
	@RequestMapping("addLike")
	@ResponseBody
	public void addLike(Integer shareid){
		shareService.addLike(shareid);
	}
}
