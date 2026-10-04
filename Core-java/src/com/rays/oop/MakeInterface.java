package com.rays.oop;

public interface MakeInterface {
	

	public static final String NAME = "Sandeep Gurjar";
	
	public static final int NUM = 123;
	
	public int sum(int a, int b);
	
	
	public static void sub() { 
		System.out.println("sub method" );
	}

	
	public default void add () {
		
		System.out.println("add method" );
	}
	
	
}
