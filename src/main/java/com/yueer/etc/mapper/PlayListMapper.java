package com.yueer.etc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yueer.etc.pojo.Comment;
import com.yueer.etc.pojo.Music;
import com.yueer.etc.pojo.PlayList;
import com.yueer.etc.pojo.User;
/**
 * 歌单的mapper
 * @author dzb
 *
 */
public interface PlayListMapper {
	//获取播放量前10的歌单
	public List<PlayList> hotPlayList(Integer stid);
	
	//获取某个id的歌单
	public PlayList getAll(Integer lid);
	
	//判断该歌单是否被用户收藏
	public Integer ifCollection(Integer lid,Integer uid);
	
	//获取歌单页面的歌单信息按照播放量
	public List<PlayList> getPlayListByHot(Integer stid);
	
	//获取歌单页面的歌单信息上传时间
	public List<PlayList> getPlayListByTime(Integer stid);
	
	//获取用创建的歌单
	public List<PlayList> getCreateByUid(Integer uid);
	
	//获取用户收藏的歌单
	public List<PlayList> getCollectionByUid(Integer uid);
	
	//搜索歌单
	public List<PlayList> searchPlayList(String lname);
	
	//获取专辑 
	public List<PlayList> getAlbumPlayList(Integer uid);
	
	//获取飙升榜的歌单和歌曲
	public PlayList getBiaoShen(Integer lid);
	
	//获取新歌榜的歌单和歌曲
	public PlayList getXinge(@Param("lid")Integer lid);
	
	//获取风格榜的歌单和歌曲
	public PlayList getFengge(@Param("lid")Integer lid);
	
	//获取某个歌单评论
	public List<Comment> getCommentByLid(Integer lid);
	
	//获取某个歌单的歌曲
	public List<Music>	getMusicByLid(Integer lid);
	
	//获取飙升榜的歌曲
	public List<Music> getBiaoShenMusic();
	
	//获取新歌榜的歌曲
	public List<Music> getXingeMusic(@Param("date")String date);
	
	//获取风格榜的歌曲
	public List<Music> getFenggeMusic(@Param("stid")Integer stid);
	
	//获uid的获取user
	public User getUserByUid(@Param("uid")Integer uid);
	}