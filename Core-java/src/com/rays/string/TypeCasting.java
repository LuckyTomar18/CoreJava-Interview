package com.rays.string;

public class TypeCasting {

	public static void main(String[] args) {

		
//		Interger to String
		
		int num = 100;

		String str = Integer.toString(num);
		System.out.println(str);
		
		String str1 = String.valueOf(num);
		System.out.println(str1);

		
//		String to Integer
		
		String name = "200";
		
		int srt = Integer.parseInt(name);
		System.out.println(name);
		
		int str11 = Integer.valueOf(name);
		System.out.println(str11);
		
	}

}
