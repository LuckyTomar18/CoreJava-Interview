package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestNoSuchElement {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		try {
			System.out.println(it.next());
		} catch (NoSuchElementException e) {

			System.out.println(e);
//			System.exit(0);
//			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}

}
