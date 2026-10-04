package com.rays.oop.methodreturn;

public class Circle extends Shape {

	private int radius;

	public static final double PI = 3.14;

	public Circle(int radius) {

		this.radius = radius;
	}

	public double area() {
		double Area = PI * radius * radius;
		System.out.println("Circle Area = " + Area);
		return Area;
	}

}
