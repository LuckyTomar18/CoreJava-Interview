package com.rays.oop.inheritance;

public class Rectangle extends Shape{

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

	public void area() {

		int Area = lenght * width;

		System.out.println("Rectangle Area = " + Area);
	}

}
