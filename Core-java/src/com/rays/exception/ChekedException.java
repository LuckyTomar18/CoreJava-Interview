package com.rays.exception;

public class ChekedException {
	
	public static void main(String[] args) {
		
		dad();
		
	}

	public static void dad() {
		try {
			mom();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void mom() throws Exception {
		son();
		
		
	}
	
	public static void son() throws Exception {
		
		throw new Exception("mistake");
	}
}
