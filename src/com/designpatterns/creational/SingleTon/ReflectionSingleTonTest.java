package com.designpatterns.creational.SingleTon;

import java.lang.reflect.Constructor;

//SingleTon is breaked by reflection here to avoid this we should use Enum.
public class ReflectionSingleTonTest {

	public static void main(String[] args) {
		SingleTonWithEagerInitialization instanceOne = SingleTonWithEagerInitialization.getInstance();
		SingleTonWithEagerInitialization instanceTwo = null;
		
		try {
			Constructor[] construtors = SingleTonWithEagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : construtors) {
				constructor.setAccessible(true);
				instanceTwo = (SingleTonWithEagerInitialization)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
