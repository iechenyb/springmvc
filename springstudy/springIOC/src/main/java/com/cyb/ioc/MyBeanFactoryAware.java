package com.cyb.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MyBeanFactoryAware implements BeanFactoryAware{

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		//便利beanfactory中的所有bean,执行定制化
		System.out.println("BeanFactoryAware "+arg0.getBean("user"));		
	}
}
