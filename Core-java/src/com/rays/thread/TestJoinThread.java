package com.rays.thread;

public class TestJoinThread {

	public static void main(String[] args) throws InterruptedException {

		JoinThread t1 = new JoinThread("Sandeep");
		JoinThread t2 = new JoinThread("Gurjar");

		t1.start();
		t1.join();

		t2.start();
		t2.join();

	}

}
