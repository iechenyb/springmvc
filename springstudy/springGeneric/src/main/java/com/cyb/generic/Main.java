package com.cyb.generic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_base.xml");
		BaseService<User> service = (BaseService) ac.getBean("userServiceImpl");
		service.add(new User());
	}
}
