package com.rays.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("sandeep", 80000));
		list.add(new Employee("mohit", 40000));
		list.add(new Employee("goutam", 30000));
		list.add(new Employee("gourabh", 20000));
		list.add(new Employee("shivkant", 10000));

//		int secondHighest = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(1)
//				.findFirst().orElse(null);
//		
//		System.out.println(secondHighest);

//		Employee secondHighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
//				.findFirst().orElse(null);
//
//		System.out.println(secondHighest.getName() + " " + secondHighest.getSalary());

		List<Employee> highPaidEmployee = list.stream().filter(e -> e.getSalary() > 20000)
				.collect(Collectors.toCollection(ArrayList::new));

		highPaidEmployee.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
	}

}
