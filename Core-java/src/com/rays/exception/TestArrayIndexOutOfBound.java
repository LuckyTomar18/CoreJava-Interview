package com.rays.exception;

public class TestArrayIndexOutOfBound {

	public static void main(String[] args) {

		String a[] = { "1", "2" };

		try {

			System.out.println(a[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
