package com.rays.string;

public class CountOccuranceOfString {

	public static void main(String[] args) {

		String name = "sandeep";

//		name = name.toLowerCase();

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < name.length(); i++) {

				if (ch == name.charAt(i)) {
					count++;

				}

			}

			if (count != 0) {
				System.out.println(ch + "=" + count);
				count = 0;
			}
//			count = 0;
		}

	}

}
