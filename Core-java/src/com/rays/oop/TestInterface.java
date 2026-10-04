package com.rays.oop;

public class TestInterface implements MakeInterface{

	@Override
	public int sum(int a , int b) {
		return a  + b;
	}
	
	public static void main(String[] args) {
		
	 TestInterface in = new TestInterface();
	System.out.println(in.sum(10, 20));
	
	in.add();
	MakeInterface.sub();
	
	
	}
}
