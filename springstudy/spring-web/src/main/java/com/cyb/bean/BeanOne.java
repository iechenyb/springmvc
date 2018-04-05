package com.cyb.bean;

public class BeanOne {
	public String name;
	public void show(){
		System.out.println("bean one!"+this.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
