package com.cyb.example.controller;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年12月6日
 *http://localhost:8088/springmvc/hello/123
 */
@RestController
public class ExampleController {
	Log log = LogFactory.getLog(ExampleController.class);
	
	@ResponseBody
	@RequestMapping("hello/{name}")
	public String hello(@PathVariable String name){
		return "Hello "+name+"!";
	}
	
	@ResponseBody
	@RequestMapping("user/{name}")
	public User user(@PathVariable String name){
		return new User(name);
	}
	
	@RequestMapping("page")
	public ModelAndView page(){
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
	
	@ResponseBody
	@RequestMapping("map/{name}")
	public Map<String,Object> map(@PathVariable String name){
		Map<String,Object> ret = new HashMap<String, Object>();
		ret.put("name", name);
		return ret;
	}
}

class User{
	private String name;
    public User(String name){
    	this.name = name;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
