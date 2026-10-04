package com.rays.javabasic;

public class CountNoInt {

	public static void main(String[] args) {

		int[] arr = { 1, 12, 13, 12, 1 };
		int num = 12;
		int temp = -1;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {

				temp = i;

			}

		}
		System.out.println(temp);

	}
}