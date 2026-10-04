package com.rays.oop.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		
		Shape s = new Shape();
		
		s.area();
		
		
		Rectangle r = new Rectangle();
		r.area();
		
		
		Shape shape = new Rectangle();
		
		Rectangle rectangle = (Rectangle) shape;
		
		rectangle.setLenght(12);
		rectangle.setWidth(10);
		
		shape.area();
		shape.setBorderWidth("2");
		;System.out.println(shape.getBorderWidth());
		
		
	}

}
