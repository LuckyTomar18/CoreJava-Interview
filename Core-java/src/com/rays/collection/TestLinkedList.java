package com.rays.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("sandeep");
		list.add("mohit");
		list.add("abbet");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println(list.indexOf("sandeep"));
		
		list.set(2, "goutam");

		System.out.println(list);
		
		System.out.println(list);
	}

}
