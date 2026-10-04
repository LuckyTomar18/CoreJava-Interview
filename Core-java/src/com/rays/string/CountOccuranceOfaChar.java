package com.rays.string;

public class CountOccuranceOfaChar {

	public static void main(String[] args) {

		String name = "sandeep";
		int count = 0;

		char ch = 'e';

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {
				count++;
			}

		}

		System.out.println(count);
	}

}
