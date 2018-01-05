package com.yueer.etc.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * user_table的持久类
 * @author dzb
 *
 */
public class User  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4492483247489531277L;
	//用户表id
    private Integer uid;
    //用户账号	
    private String username;
    //用户密码
    private String password;
    //名字
    private String name;
    //性别
    private String sex;
    //邮箱
    private String email;
    //生日
    private Date birthday;
    //图片路径
    private String image;
    //介绍
    private String content;
    //关注量
    private Integer atten;
    //分享量
    private Integer shares;
    //粉丝数
    private Integer fans;
    //用户类型，0普通用户，1为歌手，2为入驻歌手
    private Integer role;
    
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getAtten() {
        return atten;
    }

    public void setAtten(Integer atten) {
        this.atten = atten;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    
}