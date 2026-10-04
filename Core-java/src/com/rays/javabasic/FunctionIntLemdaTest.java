package com.rays.javabasic;


public class FunctionIntLemdaTest {
	public static void main(String[] args) {
		FunctionInt f = (a, b)->{
			return a +b;
			
		};
		
		int a  = 10;
		int b = 30;
		
		System.out.println(f.sum(a, b));
		
	}
	
}
