package com.cyb.aop.ano;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cyb.aop.BaseDao;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_anno.xml");
		BaseDao dao = (BaseDao) ac.getBean("baseDaoImpl");
		System.out.println(dao.add(1, 2));
		System.out.println(dao.sub(1, 2));
		System.out.println(dao.div(1, 0));
		System.out.println(dao.mul(1, 2));
	}
}
