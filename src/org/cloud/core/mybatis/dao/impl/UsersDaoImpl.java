package org.cloud.core.mybatis.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.cloud.core.mybatis.dao.PageInfo;
import org.cloud.core.mybatis.dao.UsersDao;
import org.cloud.core.mybatis.model.Users;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public   class UsersDaoImpl extends BaseDaoImpl {
	
	private UsersDao userDao;

	public Users getById(int id) {
		return this.userDao.getById(id);
	}

	public int add(Users student) {
		// TODO Auto-generated method stub
		return this.userDao.add(student);
	}

	public int update(Users student) {
		// TODO Auto-generated method stub
		return this.userDao.update(student);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return this.userDao.delete(id);
	}

	public String getPasswdByName(String name) {
		// TODO Auto-generated method stub
		return this.userDao.getPasswdByName(name);
	}

	
	@PostConstruct
	public void init() {
	  this.userDao 
	       = this.getSqlSession().getMapper(UsersDao.class);
	 }

}
