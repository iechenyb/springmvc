package com.cyb.ioc.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryMain {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_base.xml");
		Car car = (Car) ac.getBean("car1");
		System.out.println(car);//静态工厂
		
		Car car2 = (Car) ac.getBean("car2");
		System.out.println(car2);//实例工厂
		
		Car car3 = (Car) ac.getBean("car3");
		System.out.println(car3);//实例工厂
	}
}
