package com.yueer.etc.mapper;

import java.util.List;

import com.yueer.etc.pojo.Music;

public interface MusicMapper {
	//鑾峰彇鐑棬姝屾洸
	public List<Music> hotMusic(Integer stid);
	
	//鑾峰彇鎾斁鏁版帓琛屾鐨勬瓕鏇�
	public List<Music> rankMusic1();

	//鑾峰彇鏀惰棌鏁版帓琛屾鐨勬瓕鏇�
	public List<Music> rankMusic2();

	//鑾峰彇鍛ㄦ挱鏀鹃噺鎺掕鐗堢殑姝屾洸
	public List<Music> rankMusic3();

	//鑾峰彇鏂版瓕鎺掕鐗堢殑姝屾洸
	public List<Music> rankMusic4();
	
	//根据id查找音乐
	public Music getInfo(Integer songid);
	
	//根据名字，模糊搜索歌曲列表
	public List<Music> searchMusic(String mName);

	public List<Music> singerHot(Integer id);
}

