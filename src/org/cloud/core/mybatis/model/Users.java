package org.cloud.core.mybatis.model;


import java.util.Date;

public class Users {
	
	private int id;
	private String userName; //用户名
	private String userPasswd; //密码
	private String email;
	private String mobile;
	private int sortFlag;
	private int validFlag;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSortFlag() {
		return sortFlag;
	}
	public void setSortFlag(int sortFlag) {
		this.sortFlag = sortFlag;
	}
	public int getValidFlag() {
		return validFlag;
	}
	public void setValidFlag(int validFlag) {
		this.validFlag = validFlag;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Users(int id, String userName, String userPasswd, String email,
			String mobile, int sortFlag, int validFlag, Date createTime,
			Date updateTime) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.email = email;
		this.mobile = mobile;
		this.sortFlag = sortFlag;
		this.validFlag = validFlag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	public Users() {
		super();
	}
	
	
	
	
	

}
