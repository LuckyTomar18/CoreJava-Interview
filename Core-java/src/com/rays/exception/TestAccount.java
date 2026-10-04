package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(5000);
		

		try {
			a.withdrwal(1000);
			a.deposite(2000); 
			a.setBalance(10000);
			System.out.println(a.getBalance());
			
		} catch (InsufficentFundException e) {
			System.out.println(e);
		}

	}

}
