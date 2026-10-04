package com.rays.javabasic;

import java.lang.reflect.Constructor;

public class ObjectUsingReflection {
	public void display() {
		System.out.println("Object created using Constructor.newInstance()");
	}

	public static void main(String[] args) {
		try {
			Constructor<ObjectUsingReflection> constructor = ObjectUsingReflection.class.getDeclaredConstructor();
			ObjectUsingReflection example = constructor.newInstance();
			example.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}