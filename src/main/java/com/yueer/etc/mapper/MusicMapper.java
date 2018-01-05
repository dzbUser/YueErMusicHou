package com.yueer.etc.mapper;

import java.util.List;

import com.yueer.etc.pojo.Music;

public interface MusicMapper {
	//获取热门歌曲
	public List<Music> hotMusic(Integer stid);
}