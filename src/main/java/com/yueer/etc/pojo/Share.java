package com.yueer.etc.pojo;

import java.io.Serializable;

public class Share  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8226960142487957252L;

	private Integer shareid;

    private Integer uid;

    private String content;

    private Integer like;

    private String video;

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

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }
}