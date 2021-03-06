package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PlayList  implements Serializable{

	private static final long serialVersionUID = -4388236815515293029L;

	private Integer lid;

    private String lname;

    private Date publishTime;

    private Integer playnum;

    private Integer collect;

    private Integer num;

    private Integer isalbum;

    private String liamge;
    
    private List<Music> musics;
   
	private Integer stid;
	
	private String content;
	
	private Integer uid;
	
	private String name;
	
	private User user;
    
//    private List<Comment> comments;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getPlaynum() {
        return playnum;
    }

    public void setPlaynum(Integer playnum) {
        this.playnum = playnum;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    public Integer getIsalbum() {
        return isalbum;
    }

    public void setIsalbum(Integer isalbum) {
        this.isalbum = isalbum;
    }

    public String getLiamge() {
        return liamge;
    }

    public void setLiamge(String liamge) {
        this.liamge = liamge == null ? null : liamge.trim();
    }

	public List<Music> getMusics() {
		return musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Comment> getComments() {
//		return comments;
//	}
//
//	public void setComments(List<Comment> comments) {
//		this.comments = comments;
//	}
}