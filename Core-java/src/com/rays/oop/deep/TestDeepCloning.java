package com.rays.oop.deep;

public class TestDeepCloning implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Customer c1 = new Customer("Sandeep");
		
		Customer c2 = (Customer) c1.clone();
		
		c2.name = "syam";
		c2.account.balance = 200;
		
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		
		System.out.println(c2.name);
		System.out.println(c2.account.balance);
		
	}
}
