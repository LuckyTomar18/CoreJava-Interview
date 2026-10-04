package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		{

			c.add(1);
			c.add(2);
			c.add(3);
			c.add(4);
			c.add('a');
			c.add(8);
			c.add('b');

			Collection c2 = new ArrayList();

			c2.add(9);
			c2.add(8);
			c2.add('b');

			System.out.println(c);
			System.out.println(c2);

			c.retainAll(c2);

			System.out.println(c);
		}
	}

}
