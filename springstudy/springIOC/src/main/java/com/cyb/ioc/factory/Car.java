package com.cyb.ioc.factory;

public class Car {
	public String name;
	public int money;

	public Car(String name,int money){
		this.name = name;
	    this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public String toString(){
		return "["+this.getName()+","+this.money+"]";
	}
	
}
