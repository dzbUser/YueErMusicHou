package com.yueer.etc.service;

import java.util.List;

import com.yueer.etc.pojo.Share;

public interface ShareService {
	public void addShare(Share share);
	public List<Share> getAllShare();
	public void addLike(Integer shareid);
	
}
