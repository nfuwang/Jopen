package org.cloud.core.service.impl;

import org.cloud.core.mybatis.dao.impl.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl  extends BaseServiceImpl{
	
	private UsersDaoImpl usersDaoImpl;


	public void setUsersDaoImpl(UsersDaoImpl usersDaoImpl) {
		this.usersDaoImpl = usersDaoImpl;
	}

	public String getPasswdByName(String name){
		return this.usersDaoImpl.getPasswdByName(name);
	}
}
