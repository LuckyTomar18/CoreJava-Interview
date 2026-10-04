package com.rays.thread;

public class Account {

	public int balance;

	public void setBalance(int balance) {

		this.balance = balance;

	}

	public int getBalance() {

		return balance;
	}

	public void deposite(String name, int amount) {

		int total = getBalance() + amount;

		setBalance(total);

		System.out.println(name + " " + getBalance());
	}

}
