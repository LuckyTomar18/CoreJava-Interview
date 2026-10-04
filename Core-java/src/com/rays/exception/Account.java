package com.rays.exception;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amt) {

		balance = balance + amt;

		System.out.println("After deposite balance  = " + balance);
	}

	public void withdrwal(double amt) throws InsufficentFundException {

		balance = balance - amt;

		if (balance >= 0) {
			System.out.println("withdrawl amouiunt = " + balance);

		} else {

			InsufficentFundException e = new InsufficentFundException();

			throw e;

		}

	}
}
