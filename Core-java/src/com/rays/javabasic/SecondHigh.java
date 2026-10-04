package com.rays.javabasic;

public class SecondHigh {
	
	public static void main(String[] args) {
		
		int [] num = {23,34,45,56,67,890};
		int count = 0;
		int temp = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (temp<num[i]) {
				
				count = temp;
				temp = num[i];
				
				
			}
			
			if (count<num[i] && temp>num[i]) {
				count = num[i];
			}
			
		}
		
		System.out.println(count);
		
	}

}
