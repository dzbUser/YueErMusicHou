package com.yueer.etc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yueer.etc.pojo.Comment;
import com.yueer.etc.pojo.PlayList;
/**
 * 歌单业务管理接口
 * @author dzb
 *
 */
public interface PlayListService {

	//获取前10的歌单
	public List<PlayList> hotPlayList(Integer stid);
	//获取某个id的歌单
	public PlayList getAll(Integer lid);
	
	//判断用户是都收藏歌单
	public Boolean ifCollection(Integer lid,Integer uid);
	
	//获取全部歌单或者风格歌单
	public PageInfo<PlayList> getPlayList(Integer stid, Boolean hot,Integer page);
	
	//获取用户创建的歌单
	public List<PlayList> getCreateByUid(Integer uid);
	
	//获取用户收藏的歌单
	public List<PlayList> getCollectionByUid(Integer uid);
	
	//搜索歌单
	public List<PlayList> searchPlayList(String lname);
	
	//获取歌手的专辑
	public List<PlayList> getAlbumPlayList(Integer uid); 
	
	//获取飙升榜
	public PlayList getBiaoshen(Integer lid);
	
	//获取新歌榜
	public PlayList getXinge(Integer lid);
	
	//获取某个风格的排行榜
	public PlayList getFengge(Integer lid,Integer stid);
	
	//获取某个歌单的评论
	public  PageInfo<Comment> getComment(Integer lid,Integer page);
}
