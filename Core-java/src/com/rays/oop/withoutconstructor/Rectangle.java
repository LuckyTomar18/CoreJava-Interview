package com.rays.oop.withoutconstructor;

public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public double area() {
		
		double Area = lenght * width;
		System.out.println("Area = " + Area);
		return Area;
	}

}
