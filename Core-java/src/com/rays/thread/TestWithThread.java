package com.rays.thread;

public class TestWithThread {
	
	public static void main(String[] args) {
		
	
	
	WithThread t1 = new WithThread("Sandeep");
	WithThread t2 = new WithThread("Gurjar");
	
	t1.start();
	t2.start();
	
	}

}
