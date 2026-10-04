package com.rays.oop.methodreturn;

public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;

	}

	public double area() {
		double Area = (base * height) / 2;
		System.out.println("Triangle Area !! =  " + Area);
		return Area;
	}

}
