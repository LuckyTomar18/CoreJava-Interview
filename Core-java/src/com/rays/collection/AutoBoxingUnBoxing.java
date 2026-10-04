package com.rays.collection;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		// auto
		String str = "Sandeep";
		String s1 = new String(str);

		System.out.println(s1);

		// inboxing
		String s2 = new String("Sandeep");
		String s3 = s2;
		System.out.println(s3);
	}

}
