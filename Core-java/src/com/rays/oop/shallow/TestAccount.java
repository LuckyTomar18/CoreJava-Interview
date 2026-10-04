package com.rays.oop.shallow;

public class TestAccount {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account ac = new Account();

		ac.balance = 10;

		Account aa = (Account) ac.clone();
		aa.balance = 20;

		System.out.println(ac.balance);
		System.out.println(aa.balance);

	}

}
