package com.rays.exception;

public class UnchekedException {

	public static void main(String[] args) {
		dad();

	}

	public static void dad() {
		mom();
	}

	public static void mom() {
		son();
	}

	public static void son() {

		throw new RuntimeException("make mistake");
	}

}
