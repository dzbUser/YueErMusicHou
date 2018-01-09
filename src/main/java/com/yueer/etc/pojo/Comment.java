package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;

public class Comment  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1028707282588595263L;
	private Integer cid;
	private String content;
	private Integer ctype;
	private Date time;
	private String name;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getCtype() {
		return ctype;
	}
	public void setCtype(Integer ctype) {
		this.ctype = ctype;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", content=" + content + ", ctype=" + ctype + ", time=" + time + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}