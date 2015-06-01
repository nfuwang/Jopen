package org.cloud.core.mybatis.dao;



//数据库分页信息
import java.util.List;

public class PageInfo
{
  List objectList = null;
  int pageCount;
  int rowCount;
  int pageNum;
  int pageSize;

  public List getObjectList()
  {
    return this.objectList;
  }

  public void setObjectList(List objectList) {
    this.objectList = objectList;
  }

  public int getPageCount()
  {
    return this.pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public int getRowCount() {
    return this.rowCount;
  }

  public void setRowCount(int rowCount) {
    this.rowCount = rowCount;
  }

  public int getPageNum() {
    return this.pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
}
