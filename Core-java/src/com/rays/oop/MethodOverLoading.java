package com.rays.oop;

public class MethodOverLoading {

	public int sum(int a, int b) {

		return a + b;

	}

	public int sum(int a, int b, int c) {

		return a + b + c;
	}

	public static void main(String[] args) {

		MethodOverLoading o = new MethodOverLoading();

		System.out.println(o.sum(12, 10));
		System.out.println(o.sum(10, 10, 10));

	}
}
