package com.rays.oop.Interface;

public class TestBusinessman {

	public static void main(String[] args) {

		Businessman b = new Businessman();
		
		b.abc();
		b.donation();
		b.party();
		b.earnMoney();
		b.helpToOthers();
	

		Richmam r = new Businessman();
		r.donation();
		r.party();
		b.earnMoney();
		

		SocialWorker s = new Businessman();
		
		s.helpToOthers();

	}

}
