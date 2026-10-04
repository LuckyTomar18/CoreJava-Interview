package com.rays.string;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Sandeep");

		System.out.println("length :" + sb.length());
		
		System.out.println("insert : " + sb.insert(6, "sa"));

		System.out.println("Capacity : " + sb.capacity());

		System.out.println("IndexOf:" + sb.indexOf("n"));

		System.out.println("CharAt:" + sb.charAt(1));

		System.out.println("Reverse: " + sb.reverse());

		System.out.println("Replace:" + sb.replace(0, 2, "w"));

		System.out.println("Append:" + sb.append(" Gurjar"));
	}

}
