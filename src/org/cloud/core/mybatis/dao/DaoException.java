package org.cloud.core.mybatis.dao;



import org.springframework.dao.DataAccessException;

public class DaoException extends DataAccessException
{
  public DaoException(String s)
  {
    super(s);
  }

  public DaoException(String s, Throwable throwable) {
    super(s, throwable);
  }
}