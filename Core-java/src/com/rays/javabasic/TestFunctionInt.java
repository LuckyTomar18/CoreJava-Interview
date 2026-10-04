package com.rays.javabasic;

public class TestFunctionInt {

	public static void main(String[] args) {

	FunctionInt f = new FunctionInt() {
		
		public int sum (int a , int b) {
			return a + b;
		}
	};
	
	int a = 10;
	int b = 20;
	
	System.out.println(f.sum(a, b));
	}

}
