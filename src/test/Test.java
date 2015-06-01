package test;

import org.cloud.core.mybatis.dao.impl.UsersDaoImpl;
import org.cloud.core.mybatis.model.Users;
import org.mybatis.spring.support.SqlSessionDaoSupport;  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test extends SqlSessionDaoSupport{  
	
 public static void main(String[] args) {  
	 
  // TODO Auto-generated method stub  
  new Test().firstTest();  
 }  
 public void firstTest() {  
  BeanFactory factory = new ClassPathXmlApplicationContext("core/applicationContext.xml");  
  UsersDaoImpl test = (UsersDaoImpl)factory.getBean("usersDaoImpl");  
  test.init();
  System.out.println(test.getById(1).getUserName());  
 }  
} 
