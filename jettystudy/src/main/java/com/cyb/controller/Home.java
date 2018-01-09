package com.cyb.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//http://localhost:8080/home/index?name=sfs
@Controller
@RequestMapping("/home" )
public class Home {
      @RequestMapping("/index")
      @ResponseBody
      public String Index(HttpServletRequest request){
            String name= request.getParameter( "name");
             return name+ "你好";
      }
}