package com.rays.oop.Interface;

public class Businessman implements Richmam, SocialWorker {

	@Override
	public void helpToOthers() {

		System.out.println("helpToOthers");

	}

	@Override
	public void earnMoney() {

		System.out.println("EarnMoney");

	}

	@Override
	public void donation() {

		System.out.println("Donation");

	}

	@Override
	public void party() {

		System.out.println("Party");

	}

	public void abc() {
		System.out.println("abc");
	}

}
