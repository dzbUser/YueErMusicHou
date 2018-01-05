package com.yueer.etc.service.impl;
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
	public List<PlayList> hotPlayList() {
		// TODO Auto-generated method stub
		return playListMapper.hotPlayList();
	}

}
