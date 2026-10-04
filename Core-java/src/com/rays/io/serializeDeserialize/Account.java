package com.rays.io.serializeDeserialize;

import java.io.Serializable;

public class Account implements Serializable {

	public String accountNo;

	public transient double balance;

	public Account(String accountNo, double balance) {

		this.accountNo = accountNo;
		this.balance = balance;

	}

	public String toString() {

		return accountNo +" "  + balance;
	}

}
