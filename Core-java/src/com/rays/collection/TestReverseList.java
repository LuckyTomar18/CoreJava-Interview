package com.rays.collection;

import java.util.ArrayList;

public class TestReverseList {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add("s");


		for (int i = l.size() - 1; i >= 0; i--) {

			System.out.println(l.get(i));

		}
		
		
	

	}

}
