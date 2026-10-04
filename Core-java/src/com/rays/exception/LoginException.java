package com.rays.exception;

public class LoginException extends Exception {

	public LoginException() {

		super("login & password is incorrrect");

	}

	public LoginException(String msg) {

		super(msg);
	}

}
