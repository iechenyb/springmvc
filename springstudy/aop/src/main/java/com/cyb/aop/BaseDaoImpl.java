package com.cyb.aop;

import org.springframework.stereotype.Component;

@Component
public class BaseDaoImpl implements BaseDao{

	public int add(int a, int b) {
		int result = a+b;
		System.out.println("add...");
		return result;
	}

	public int sub(int a, int b) {
		int result = a-b;
		System.out.println("add...");
		return result;
	}

	public int mul(int a, int b) {
		int result = a*b;
		System.out.println("add...");
		return result;
	}

	public int div(int a, int b) {
		int result = a/b;
		System.out.println("add...");
		return result;
	}

}
