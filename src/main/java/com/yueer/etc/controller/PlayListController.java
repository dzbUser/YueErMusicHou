package com.yueer.etc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueer.etc.pojo.PlayList;
import com.yueer.etc.service.PlayListService;

/**
 * 歌单控制器
 * @author dzb
 *
 */
@RequestMapping("/playList")
@Controller
public class PlayListController {
	
	//注入歌单业务处理类
	@Autowired
	private PlayListService playListService;
	
	//返回热门歌单的json对象
	@RequestMapping("hotPlayList")
	@ResponseBody
	public List<PlayList> hotPlayList(){
		List<PlayList> playLists = playListService.hotPlayList();
		return playLists;
	}
	
}
