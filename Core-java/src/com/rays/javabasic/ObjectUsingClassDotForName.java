package com.rays.javabasic;

public class ObjectUsingClassDotForName {

	public void display() {
		System.out.println("Object created using Class.forName() and newInstance()");
	}

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("com.rays.javabasic.ObjectUsingClassDotForName ");
			ObjectUsingClassDotForName objectUsingClassDotForName = (ObjectUsingClassDotForName) clazz.getDeclaredConstructor()
					.newInstance();
			objectUsingClassDotForName.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
