package com.rays.thread;

public class WithRunnableThread implements Runnable{
	
	String name = null;
	
	
	public WithRunnableThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(i + " " + name);
		}
		
	}

}
