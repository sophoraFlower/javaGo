package com.imooc.o2o.entity;

import java.util.Date;

public class LocalAuth {
	
	private Long LocalAuthId;
	// 用户名
	private String name;
	// 密码
	private String password;
	private Date createTime;
	private Date lastEditTime;
	private PersonInfo personInfo;
	
	public Long getLocalAuthId() {
		return LocalAuthId;
	}
	public void setLocalAuthId(Long localAuthId) {
		LocalAuthId = localAuthId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}