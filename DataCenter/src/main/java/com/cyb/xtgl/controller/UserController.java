package com.cyb.xtgl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyb.xtgl.dao.UserDaoImpl;

@Controller
@RequestMapping("user")
public class UserController {
	
    @Autowired
	UserDaoImpl userDao;
	
	@ResponseBody
	@RequestMapping("add")
	public String addUser(){
		userDao.save(null);
		return "success";
	}
	
}
