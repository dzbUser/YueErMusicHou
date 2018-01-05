package com.yueer.etc.mapper;

import java.util.List;

import com.yueer.etc.pojo.PlayList;
/**
 * 歌单的mapper
 * @author dzb
 *
 */
public interface PlayListMapper {
	//获取播放量前10的歌单
	public List<PlayList> hotPlayList();
}