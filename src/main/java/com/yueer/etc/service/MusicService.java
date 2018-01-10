package com.yueer.etc.service;

import java.util.List;

import com.yueer.etc.pojo.Music;

public interface MusicService {
	public List<Music> hotMusic(Integer stid);

	public List<Music> rankMusic1();

	public List<Music> rankMusic2();

	public List<Music> rankMusic3();

	public List<Music> rankMusic4();

	public Music songInfo(Integer songid);
	
	public List<Music> searchMusic(String mName);

	public List<Music> singerHot(Integer id);
}
