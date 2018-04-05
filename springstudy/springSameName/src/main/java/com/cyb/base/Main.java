package com.cyb.base;

import org.springframework.context.ApplicationContext;
/**
 * 同一个xml中相同id和相同的name都是不允许的
 * 不同的xml，可以定义相同的bean
 * @author j
 *
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = SpringUtils.getContext("base");
		BeanOne one = (BeanOne) ac.getBean("one");
		one.show();
		BeanTwo two = (BeanTwo) ac.getBean("two");
		two.show();
	}
}
