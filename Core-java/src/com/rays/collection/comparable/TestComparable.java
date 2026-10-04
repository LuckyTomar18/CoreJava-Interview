package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Sandeep", 100000));
		list.add(new Employee(2, "Mohit", 3000));
		list.add(new Employee(8, "Gourabh", 2500));
		list.add(new Employee(9, "Gourabh", 1200));
		list.add(new Employee(3, "Goutam", 5000));

		Collections.sort(list);

		for (Object object : list) {

			System.out.println(object);

		}

	}

}
