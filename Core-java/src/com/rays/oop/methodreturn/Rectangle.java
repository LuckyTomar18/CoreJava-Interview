package com.rays.oop.methodreturn;

public class Rectangle extends Shape{

	private int lenght;

	private int width;

	public Rectangle(int lenght, int width) {

		this.lenght = lenght;

		this.width = width;

	}

	public double area() {

		double Area = lenght * width;

		System.out.println("Rectangle Area!! = "  + Area);
		return Area;
	}

}
