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
	
	//鑾峰彇鐑棬鎺ㄨ崘姝屾洸
	@RequestMapping(value = "/hotMusic/{stid}", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> hotMusicByStid(@PathVariable("stid")Integer stid){
		System.out.println(stid);
		List<Music> musics = musicService.hotMusic(stid);
		return musics;
	}
	
	//鑾峰彇鎾斁鏁版帓琛屾鐨勬瓕鏇�
	@RequestMapping(value ="/rank1.do", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> rankingMusic1(){
		List<Music> musiclist1 = musicService.rankMusic1();
		return musiclist1;
	}
	
	//鑾峰彇鏀惰棌鏁版帓琛屾鐨勬瓕鏇测��
	@RequestMapping(value ="/rank2.do", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> rankingMusic2(){
		List<Music>  musiclist2 = musicService.rankMusic2();
		return musiclist2;
	}
	
	//鑾峰彇鍛ㄦ挱鏀鹃噺鎺掕鐗堢殑姝屾洸
	@RequestMapping(value ="/rank3.do", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> rankingMusic3(){
		List<Music> musiclist3 = musicService.rankMusic3();
		return musiclist3;
	}

	//鑾峰彇鏂版瓕鎺掕鐗堢殑姝屾洸
	@RequestMapping(value ="/rank4.do", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> rankingMusic4(){
		List<Music> musiclist4 = musicService.rankMusic4();
		return musiclist4;
	}
	
	//获取歌曲详细信息
	@RequestMapping(value = "/song/{songid}", method = RequestMethod.GET)
	@ResponseBody
	public Music deatailSong(@PathVariable("songid")Integer songid){
		System.out.println("song/"+songid);
		Music music = musicService.songInfo(songid);
		System.out.println(music.getMname());
		return music;
	}
	
	//根据歌名模糊查询歌曲
	@RequestMapping(value = "/searchMusic", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> findMusic(String mName){
		System.out.println(mName);
		List<Music> mlist = musicService.searchMusic(mName);
		return mlist;
	}
	
	//根据歌手id查询热门50曲
	@RequestMapping(value = "/SingerHot", method = RequestMethod.GET)
	@ResponseBody
	public List<Music> singerHot(Integer id){
		List<Music> mlist = musicService.singerHot(id);
		return mlist;
	}
	
}
