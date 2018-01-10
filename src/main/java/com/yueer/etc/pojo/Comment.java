package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;

public class Comment  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1028707282588595263L;
	private Integer cid;
	private Integer uid;
	private String content;
	private Integer ctype;
	private Date time;
	private Integer sid;
	private Integer shid;
	private Integer lid;
	private Integer mid;
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
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getShid() {
		return shid;
	}
	public void setShid(Integer shid) {
		this.shid = shid;
	}
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	/*	public Integer getXid() {
		return xid;
	}
	public void setXid(Integer xid) {
		this.xid = xid;
	}*/
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", content=" + content + ", ctype=" + ctype + ", time=" + time + "]";
	}
	
	
}