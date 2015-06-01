package org.cloud.core.mybatis.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;



public class BaseDaoImpl extends SqlSessionDaoSupport {
	
 
 @Autowired
 public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate)
    {
     super.setSqlSessionTemplate(sqlSessionTemplate);
    }
 
}