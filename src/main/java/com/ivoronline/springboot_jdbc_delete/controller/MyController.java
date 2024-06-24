package com.ivoronline.springboot_jdbc_delete.controller;

import com.ivoronline.springboot_jdbc_delete.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired
  private MyService myService;

  //=========================================================================================================
  // DELETE
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/delete")
  public int delete() throws SQLException {
    int    success = myService.delete("John", 10);
    return success;
  }

}
