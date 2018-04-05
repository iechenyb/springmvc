package com.cyb.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
 public static ApplicationContext getContext(String fileName){
	 //调换位置，发现name的属性值就不一样了，夸xml文件，允许重复的id和name
	 String xmls[] = new String[]{"classpath:applicationContext_"+fileName+"2.xml","classpath:applicationContext_"+fileName+".xml"};
	 return new ClassPathXmlApplicationContext(xmls);
 }
}
