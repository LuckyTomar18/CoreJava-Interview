package com.rays.oop.inheritance;

public class Shape {

	private String color;
	private String borderWidth;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(String borderWidth) {

		this.borderWidth = borderWidth;
	}

	public void area() {
		System.out.println("Shape Area Method");
	}
}
