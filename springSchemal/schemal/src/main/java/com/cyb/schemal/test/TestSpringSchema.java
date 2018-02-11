package com.cyb.schemal.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyb.schemal.bean.User;

/**
 * 作者 : iechenyb<br>
 * 类描述: 说点啥<br>
 * 创建时间: 2018年2月11日
 */
public class TestSpringSchema {
	Log log = LogFactory.getLog(TestSpringSchema.class);

	@SuppressWarnings("resource")
	public static void test() {
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		User user = (User) context.getBean("eric");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getSex());
		System.out.println(user.getAge());
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		user = (User) context.getBean("eric1");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getSex());
		System.out.println(user.getAge());
	}

	public static void main(String[] args) {
		test();
	}
}
