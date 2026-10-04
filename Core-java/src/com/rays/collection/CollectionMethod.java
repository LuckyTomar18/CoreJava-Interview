package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {

	public static void main(String[] args) {

		Collection<Integer> c = new ArrayList();
		Collection<Integer> c1 = new ArrayList();

		c1.add(1);
		c1.add(11);
		c.add(12);
		c.add(13);
		c.add(14);
		c.add(15);
		c.add(16);

		System.out.println(c.add(17));
		System.out.println(c);
		System.out.println(c.addAll(c1));
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c1.contains(1));
		System.out.println(c.containsAll(c1));
		System.out.println(c.isEmpty());
		System.out.println(c.remove(1));
		System.out.println(c);
		System.out.println(c.removeAll(c1));
		System.out.println(c);
		c.clear();
		System.out.println(c);
		

	}

}
