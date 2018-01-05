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
	
	@Override
	public List<Music> hotMusic(Integer stid) {
		// TODO Auto-generated method stub
		return musicMapper.hotMusic(stid);
	}

}
