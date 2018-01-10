package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;

public class Share  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8226960142487957252L;

	private Integer shareid;

    private Integer uid;

    private String content;

    private Integer likes;

    private String video;

    private Integer music;
    
    private User user;
    
    private Music musicMessage;
    
    private Date time;
    

    
    public Integer getShareid() {
        return shareid;
    }

    public void setShareid(Integer shareid) {
        this.shareid = shareid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer like) {
        this.likes = like;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

	public Integer getMusic() {
		return music;
	}

	public void setMusic(Integer music) {
		this.music = music;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Music getMusicMessage() {
		return musicMessage;
	}

	public void setMusicMessage(Music musicMessage) {
		this.musicMessage = musicMessage;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}