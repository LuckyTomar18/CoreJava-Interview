package com.rays.oop.withconstructor;

public class Triangle extends Shape {

	private int base;
	private int hieght;

	public Triangle(int base, int hieght) {
		this.base = base;
		this.hieght = hieght;

	}

	

	public double area() {
		double tArea = (base * hieght) / 2;

		System.out.println("Triangle Area = " + tArea);

		return tArea;
	}

}
