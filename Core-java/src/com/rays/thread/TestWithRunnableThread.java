package com.rays.thread;

public class TestWithRunnableThread {
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new WithRunnableThread("Sandeep"));
		Thread t2 = new Thread(new WithRunnableThread("Gurjar"));
		
		t1.start();
		t2.start();
		
	}

}
