package com.rays.oop;

public class TestAbsractClass extends AbstractClass {

	@Override
	public void sum() {
		System.out.println("Sum method");
	}
	
	public TestAbsractClass() {
		super();   
		System.out.println("ChildClass default constructor");
	}
	
	public TestAbsractClass(String name) {
		super(name);   
		System.out.println(name);
	}

	public static void main(String[] args) {

//		TestAbsractClass t = new TestAbsractClass();
		TestAbsractClass t2 = new TestAbsractClass("Sandeep gurjar");

		t2.sum();
		t2.sub();
		
		
		

	}

}
