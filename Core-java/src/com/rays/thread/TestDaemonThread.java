package com.rays.thread;

public class TestDaemonThread {
	
	public static void main(String[] args) {
		
	
	
	BackgroundThread t1 = new BackgroundThread("Sandeep");
	BackgroundThread t2 = new BackgroundThread("Gurjar");
	
	t1.setDaemon(true);
	
	t1.start();
	
	for (int i = 1; i <= 5; i++) {
		
		try {
			
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.getMessage();
			
			
		}
		
		System.out.println(i + " main" );
		
	}
	
	}
	
}
