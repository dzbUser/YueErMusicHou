package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;

public class User1 implements Serializable {

	private static final long serialVersionUID = -7644967201570973657L;
	private Long id;
//	private String account;
//	private String password;
	private String userName;
//	private Integer gender;
	private Integer age;
//	private Date birthday;
//	private Date createTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public String getAccount() {
//		return account;
//	}
//	public void setAccount(String account) {
//		this.account = account;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public Integer getGender() {
//		return gender;
//	}
//	public void setGender(Integer gender) {
//		this.gender = gender;
//	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
//	public Date getBirthday() {
//		return birthday;
//	}
//	public void setBirthday(Date birthday) {
//		this.birthday = birthday;
//	}
//	public Date getCreateTime() {
//		return createTime;
//	}
//	public void setCreateTime(Date createTime) {
//		this.createTime = createTime;
//	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", account=" + account + ", password=" + password + ", userName=" + userName + ", gender=" + gender + ", age=" + age + ", birthday=" + birthday + ", createTime="
//				+ createTime + "]";
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
	
	
	
}
