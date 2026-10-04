package com.rays.oop;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {

		balance = balance + amount;
		System.out.println("balance = " + balance);

	}

	public void withdrawl(int amount) {

		balance = balance - amount;
		if (balance >= 0) {

			System.out.println("balance = " + balance);

		} else {
			System.out.println("Insufficient balance");
		}

	}
}
