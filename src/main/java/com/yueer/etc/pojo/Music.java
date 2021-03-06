package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;

public class Music  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 9095551007012296233L;


	private Integer mid;

    private String mname;

    private Integer length;

    //歌曲路径
    private String path;
    //图片路径
    private String image;

    private Date uptime;

    private Integer playnum;

    private Integer collect;

    private Integer weekplay;

    private String lyr;
    
    private String name;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
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

    public Integer getWeekplay() {
        return weekplay;
    }

    public void setWeekplay(Integer weekplay) {
        this.weekplay = weekplay;
    }

    public String getLyr() {
        return lyr;
    }

    public void setLyr(String lyr) {
        this.lyr = lyr == null ? null : lyr.trim();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}