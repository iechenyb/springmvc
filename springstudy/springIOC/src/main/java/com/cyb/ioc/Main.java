package com.cyb.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_bean.xml");
		User user = (User) ac.getBean("user");
		user.showName();
		ac.close();
	}
}
