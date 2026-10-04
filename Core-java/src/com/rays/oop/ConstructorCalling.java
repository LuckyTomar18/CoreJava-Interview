package com.rays.oop;

public class ConstructorCalling {

	private String fName;
	private String lName;

	public ConstructorCalling() {
		System.out.println("Default Constructor");
	}

	public ConstructorCalling(String fName) {
		this();
		this.fName = fName;

		System.out.println(fName);

	}

	public ConstructorCalling(String fName, String lName) {

		this(fName);
		this.lName = lName;

		System.out.println(lName);

	}

}