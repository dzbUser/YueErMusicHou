package com.yueer.etc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueer.etc.pojo.Music;
import com.yueer.etc.service.MusicService;

@RequestMapping("/music")
@Controller
public class MusicController {
	@Autowired
	private MusicService musicService;
	
	//获取热门推荐歌曲
	@RequestMapping(value = "/hotMusic/{stid}", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> hotMusicByStid(@PathVariable("stid")Integer stid){
		System.out.println(stid);
		List<Music> musics = musicService.hotMusic(stid);
		return musics;
	}
}
