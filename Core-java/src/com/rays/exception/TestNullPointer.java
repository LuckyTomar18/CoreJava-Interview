package com.rays.exception;

public class TestNullPointer {

	public static void main(String[] args) {

		String s = null;
		String a = "sandeep";
		try {
			System.out.println(s.length());
			System.out.println(a.charAt(10));

		} catch (ArithmeticException e) {

			System.out.println(e);
		} catch (NullPointerException e) {

			System.out.println(e);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
}
