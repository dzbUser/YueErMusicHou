package com.yueer.etc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public List<PlayList> hotPlayList(Integer stid){
		System.out.println(stid);
		List<PlayList> playLists = playListService.hotPlayList(stid);
		return playLists;
	}
	
	//根据lid返回歌单的json
		@RequestMapping(value = "/getAll/{lid}", method = RequestMethod.GET)
		@ResponseBody
		public PlayList getAll(@PathVariable("lid")Integer lid){
			System.out.println(lid);
			PlayList playLists = playListService.getAll(lid);
			return playLists;
		}
	
		//用户是都收藏歌单
		@RequestMapping("ifCollection")
		@ResponseBody
		public Boolean ifCollection(Integer lid,Integer uid){
			System.out.println(lid+"  "+uid);
			return playListService.ifCollection(lid, uid);
		}
		
		//获取全部歌单某个风格的歌单
		@RequestMapping("getPlayList")
		@ResponseBody
		public List<PlayList> getPlayList(Integer stid,Boolean hot){
			System.out.println(stid);
			List<PlayList> playLists = playListService.getPlayList(stid,hot);
			return playLists;
		}
		
		//获取用户创建的歌单
		@RequestMapping("getCreateByUid")
		@ResponseBody
		public List<PlayList> getCreateByUid(Integer uid){
			System.out.println(uid);
			List<PlayList> playLists = playListService.getCreateByUid(uid);
			return playLists;
		}
		
		//获取用户创建的歌单
		@RequestMapping("getCollectionByUid")
		@ResponseBody
		public List<PlayList> getCollectionByUid(Integer uid){
			System.out.println(uid);
			List<PlayList> playLists = playListService.getCollectionByUid(uid);
			return playLists;
		}
		
		//搜索歌单
		@RequestMapping("searchPlayList")
		@ResponseBody
		public List<PlayList> searchPlayList(String lname){
			System.out.println(lname);
			List<PlayList> playLists = playListService.searchPlayList(lname);
			return playLists;
		}
		
		//获取专辑
		@RequestMapping("getAlbumPlayList")
		@ResponseBody
		public List<PlayList> getAlbumPlayList(Integer uid){
			System.out.println(uid);
			List<PlayList> playLists = playListService.getAlbumPlayList(uid);
			return playLists;
		}
		
		//获取排行榜
		@RequestMapping("getBiaoshen")
		@ResponseBody
		public PlayList getBiaoshen(){
			PlayList playLists = playListService.getBiaoshen(1);
			return playLists;
		}
		
		
		//获取新歌榜
		@RequestMapping("getXinge")
		@ResponseBody
		public PlayList getXinge(){
			PlayList playLists = playListService.getXinge(2);
			return playLists;
		}
		
		//获取风格榜单
		@RequestMapping("getFengge")
		@ResponseBody
		public PlayList getFengge(Integer stid){
			PlayList playLists = playListService.getFengge(3, stid);
			return playLists;
		}
		
}
