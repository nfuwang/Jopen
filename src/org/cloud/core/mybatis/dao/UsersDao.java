package org.cloud.core.mybatis.dao;

import org.cloud.core.mybatis.model.Users;

public interface UsersDao {
	
	
	 //根据id查找用户
	 public Users getById(int id);
	 
	 //添加一名用户
	 public int add(Users student);
	 
	 //修改用户
	 public int update(Users student);
	 
	 //删除用户
	 public int delete(int id);
	 
	 public String getPasswdByName(String name);

}
