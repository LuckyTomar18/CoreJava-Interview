package com.rays.javabasic;

public class RandomNo {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			int a = (int) (Math.random() * 10);
			System.out.print(a + " ");
		}

	}
}
