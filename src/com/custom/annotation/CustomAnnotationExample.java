package com.custom.annotation;

import java.lang.reflect.Method;

// Accessing annotation
class CustomAnnotationExample {
	public static void main(String args[]) throws Exception {

		CustomAnnotationExample h = new CustomAnnotationExample();
		Method m = h.getClass().getMethod("sayHello");

		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: " + manno.value());
	}
	
	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}
