package com.yueer.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueer.etc.mapper.MusicMapper;
import com.yueer.etc.mapper.PlayListMapper;
import com.yueer.etc.mapper.ShareMapper;
import com.yueer.etc.pojo.Share;
import com.yueer.etc.service.ShareService;

@Service
public class ShareServiceImpl implements ShareService {
	@Autowired
	private ShareMapper shareMapper;
	
	@Autowired
	private PlayListMapper playListMapper;
	
	@Autowired
	private MusicMapper musicMapper;
	
	@Override
	public void addShare(Share share) {
		// TODO Auto-generated method stub
		shareMapper.addShare(share);
		
	}
	@Override
	public List<Share> getAllShare() {
		// TODO Auto-generated method stub
		List<Share> shares = shareMapper.getAllShare();
		for(int i=0;i<shares.size();i++){
			shares.get(i).setUser(playListMapper.getUserByUid(shares.get(i).getUid()));
			if(shares.get(i).getMusic()!=null){
				shares.get(i).setMusicMessage(musicMapper.getInfo(shares.get(i).getMusic()));
			}			
		}
		return shares;
	}
	@Override
	public void addLike(Integer shareid) {
		// TODO Auto-generated method stub
		shareMapper.addLike(shareid);
	}
	

}
