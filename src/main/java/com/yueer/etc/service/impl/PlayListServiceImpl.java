package com.yueer.etc.service.impl;
 import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueer.etc.mapper.PlayListMapper;
import com.yueer.etc.pojo.PlayList;
import com.yueer.etc.service.PlayListService;

/**
 * 歌单业务处理
 * @author dzb
 *
 */
@Service
public class PlayListServiceImpl implements PlayListService{

	//注入歌单的mapper
	@Autowired
	private PlayListMapper playListMapper;
	
	//获取前10热门歌单
	@Override
	public List<PlayList> hotPlayList(Integer stid) {
		// TODO Auto-generated method stub
		return playListMapper.hotPlayList(stid);
	}

	@Override
	public PlayList getAll(Integer lid) {
		// TODO Auto-generated method stub
		PlayList list = playListMapper.getAll(lid);
		list.setMusics(playListMapper.getMusicByLid(lid));
		list.setComments(playListMapper.getCommentByLid(lid));
		return list;
	}
	
	//判断用户是否收藏歌单
	@Override
	public Boolean ifCollection(Integer lid, Integer uid) {
		// TODO Auto-generated method stub
		if(playListMapper.ifCollection(lid, uid)==null){
			return false;
		}
		return true;
	}

	//获取全部歌单某个风格的歌单
	public List<PlayList> getPlayList(Integer stid, Boolean hot) {
		// TODO Auto-generated method stub
		if(hot){
			return playListMapper.getPlayListByHot(stid);
		}
		return playListMapper.getPlayListByTime(stid);
	}

	//获取用户创建的歌单
	@Override
	public List<PlayList> getCreateByUid(Integer uid) {
		// TODO Auto-generated method stub
		return playListMapper.getCreateByUid(uid);
	}

	//获取用户收藏的歌单
	@Override
	public List<PlayList> getCollectionByUid(Integer uid) {
		// TODO Auto-generated method stub
		return playListMapper.getCollectionByUid(uid);
	}

	//搜索歌单
	@Override
	public List<PlayList> searchPlayList(String lname) {
		// TODO Auto-generated method stub
		return playListMapper.searchPlayList(lname);
	}

	//获取歌手的专辑
	@Override
	public List<PlayList> getAlbumPlayList(Integer uid) {
		// TODO Auto-generated method stub
		return playListMapper.getAlbumPlayList(uid);
	}

	//获取飙升榜
	@Override
	public PlayList getBiaoshen(Integer lid) {
		// TODO Auto-generated method stub
		PlayList list = playListMapper.getBiaoShen(lid);
		list.setMusics(playListMapper.getBiaoShenMusic());
		list.setComments(playListMapper.getCommentByLid(lid));
		return list;
	}

	//获取新歌榜
	@Override
	public PlayList getXinge(Integer lid) {
		// TODO Auto-generated method stub
		String str = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.roll(Calendar.DATE, -7);//日期回滚7天
        str=sdf.format(lastDate.getTime());
        
        
		PlayList list = playListMapper.getXinge(lid);
		list.setMusics(playListMapper.getXingeMusic(str));
		list.setComments(playListMapper.getCommentByLid(lid));
		return list;
	}

	//获取某个风格的榜单
	@Override
	public PlayList getFengge(Integer lid, Integer stid) {
		// TODO Auto-generated method stub
		PlayList list = playListMapper.getFengge(lid, stid);
		list.setMusics(playListMapper.getFenggeMusic(stid));
		list.setComments(playListMapper.getCommentByLid(lid));
		return list;
	}

}
