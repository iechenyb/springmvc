package com.cyb.ioc.factory;

import org.springframework.beans.factory.FactoryBean;
//实现3个接口，也可以添加自己的方法
public class CarFactoryBean implements FactoryBean<Car> {
    String brand;
    public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car getObject() throws Exception {
		return new Car(brand,30000);
	}

	public Class<?> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
