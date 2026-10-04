package com.rays.thread;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("Sandeep");
		Racing t2 = new Racing("Gurjar");

		t1.start();
		t2.start();

	}

}
