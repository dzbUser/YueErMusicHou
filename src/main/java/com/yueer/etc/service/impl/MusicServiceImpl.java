package com.yueer.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueer.etc.mapper.MusicMapper;
import com.yueer.etc.pojo.Music;
import com.yueer.etc.service.MusicService;

@Service
public class MusicServiceImpl implements MusicService{
	@Autowired
	private MusicMapper musicMapper;
	
	//鑾峰彇鐑棬鎺ㄨ崘姝屾洸
	@Override
	public List<Music> hotMusic(Integer stid) {
		// TODO Auto-generated method stub
		return musicMapper.hotMusic(stid);
	}
	
	//鑾峰彇鎾斁鏁版帓琛屾鐨勬瓕鏇�
	@Override
	public List<Music> rankMusic1() {
		// TODO Auto-generated method stub
		return musicMapper.rankMusic1();
	}

	//鑾峰彇鏀惰棌鏁版帓琛屾鐨勬瓕鏇�
	@Override
	public List<Music> rankMusic2() {
		// TODO Auto-generated method stub
		return musicMapper.rankMusic2();
	}

	//鑾峰彇鍛ㄦ挱鏀鹃噺鎺掕鐗堢殑姝屾洸
	@Override
	public List<Music> rankMusic3() {
		// TODO Auto-generated method stub
		return musicMapper.rankMusic3();
	}

	//鑾峰彇鏂版瓕鎺掕鐗堢殑姝屾洸
	@Override
	public List<Music> rankMusic4() {
		// TODO Auto-generated method stub
		return musicMapper.rankMusic4();
	}
	
	//根据歌曲id精确查询信息
	@Override
	public Music songInfo(Integer songid) {
		// TODO Auto-generated method stub
		return musicMapper.getInfo(songid);
	}
	
	//根据歌手名模糊查询
	@Override
	public List<Music> searchMusic(String mName) {
		// TODO Auto-generated method stub
		return musicMapper.searchMusic(mName);
	}

	//根据歌手id，找到前50首热门歌曲
	@Override
	public List<Music> singerHot(Integer id) {
		// TODO Auto-generated method stub
		return musicMapper.singerHot(id);
	}

}
