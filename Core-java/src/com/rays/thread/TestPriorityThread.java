package com.rays.thread;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("Sandeep");
		PriorityThread t2 = new PriorityThread("Gurjar");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();

		t1.getPriority();

	}

}
