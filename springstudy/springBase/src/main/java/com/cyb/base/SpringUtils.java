package com.cyb.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
 public static ApplicationContext getContext(String fileName){
	 return new ClassPathXmlApplicationContext("classpath:applicationContext_"+fileName+".xml");
 }
}
