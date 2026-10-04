package com.rays.streamapi;

import java.util.ArrayList;
import java.util.List;

public class testtt {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("sandeep", 80000));
		list.add(new Employee("mohit", 40000));
		list.add(new Employee("goutam", 30000));
		list.add(new Employee("gourabh", 20000));
		list.add(new Employee("shivkant", 10000));

		list.stream().filter(e -> e.getSalary() < 40000).distinct()
				.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

	}
}
