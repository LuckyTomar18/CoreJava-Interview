package com.rays.exception;

public class TestStringIndexOutOfBound {

	public static void main(String[] args) {

		String s = "Sandeep";

		try {

			System.out.println(s.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e);

		}
	}
}
