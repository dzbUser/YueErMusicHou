package com.yueer.etc.service;

import java.util.List;

import com.yueer.etc.pojo.PlayList;
/**
 * 歌单业务管理接口
 * @author dzb
 *
 */
public interface PlayListService {

	//获取前10的歌单
	public List<PlayList> hotPlayList();
}
