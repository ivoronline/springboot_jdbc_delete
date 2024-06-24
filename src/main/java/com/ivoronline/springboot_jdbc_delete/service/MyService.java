package com.ivoronline.springboot_jdbc_delete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class MyService {

  //PROPERTIES
  @Autowired private DataSource dataSource;

  //=========================================================================================================
  // DELETE
  //=========================================================================================================
  public int delete(String name, Integer age) throws SQLException {

    //GET DB CONNECTION
    Connection connection = dataSource.getConnection();

    //INSERT RECORDS (Use single quotes for Strings)
    String    sql       = " DELETE FROM  PERSON WHERE name = '"+name+"' AND age = "+age+";" +
                          " DELETE FROM  PERSON WHERE name = 'Bill'";
    Statement statement = connection.createStatement();
    int       success   = statement.executeUpdate(sql);

    //RETURN SUCCESS
    return success;

  }

}
