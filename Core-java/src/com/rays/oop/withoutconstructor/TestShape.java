package com.rays.oop.withoutconstructor;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Rectangle();

		s[1] = new Circle();

		s[2] = new Triangle();

		Rectangle r = (Rectangle) s[0];

		r.setLenght(10);
		r.setWidth(10);

		Circle c = (Circle) s[1];
		c.setRadius(10);

		Triangle t = (Triangle) s[2];

		t.setBase(10);
		t.setHeight(10);
		
		for (int i = 0; i < s.length; i++) {
			
			s[i].area();
			
			
			
//			
//			Rectangle rn = new Rectangle();
//			rn.setLenght(2);
//			rn.setWidth(2);
//			rn.area();
//			
//			Circle cr = new Circle();
//			cr.setRadius(10);
//			cr.area();
//			
//			Triangle tr = new Triangle();
//			
//			tr.setBase(10);
//			tr.setHeight(10);
//			tr.area();
//			
			
		}

	}

}
