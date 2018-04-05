package com.cyb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//test/json.do
@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/json")
	@ResponseBody
	public String test() {
		return "sd";
	}
}
