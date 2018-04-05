package com.cyb.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcesser implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		if(name.equals("user"))
			System.out.println("Bean后置处理器 "+bean+","+name);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		if(name.equals("user"))
			System.out.println("Bean前置处理器 "+bean+","+name);
		return bean;
	}

}
