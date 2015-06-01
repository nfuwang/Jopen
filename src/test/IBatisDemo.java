package test;


import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.cloud.core.mybatis.model.Users;
import org.cloud.utils.SpringUtil;


public class IBatisDemo {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader; 

    static{
        try{
            reader    = Resources.getResourceAsReader("core/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
    
    public static void main(String[] args) {
    	SqlSessionFactory ssf = (SqlSessionFactory) SpringUtil.getBean("sqlSessionFactory");
        SqlSession session = sqlSessionFactory.openSession();
    	//SqlSession session = ssf.openSession();
        try {
        
        Users user = (Users) session.selectOne("org.cloud.mybatis.dao.impl.UsersDao.getById", 1);
        System.out.println(user.getUserPasswd());
        System.out.println(user.getId());
        } finally {
        session.close();
        }
    	
    }
}