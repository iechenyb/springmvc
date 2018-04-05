package com.cyb.ioc.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
	private static Map<String, Car> cars = new HashMap<String, Car>();

	static {
		cars.put("auto", new Car("auto",10));
		cars.put("bmw", new Car("bmw",9000));
	}

	public static Car getCar(String name) {
		return cars.get(name);
	}
}
