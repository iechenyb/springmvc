package com.cyb.ioc.factory;

import java.util.HashMap;
import java.util.Map;
//实例工厂方法：需要创建工厂实例
public class InstanceFactory {
	private static Map<String, Car> cars = null ;

	public InstanceFactory() {
		cars = new HashMap<String, Car>();
		cars.put("auto", new Car("auto",10));
		cars.put("bmw", new Car("bmw",9000));
	}

	public  Car getCar(String name) {
		return cars.get(name);
	}
}
