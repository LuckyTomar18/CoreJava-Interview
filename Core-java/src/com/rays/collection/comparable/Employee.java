package com.rays.collection.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public int compareTo(Employee o) {

		if (name == o.name) {

			return salary - o.salary;
		}

		return id - o.id;
	}
	
	public String toString() {
		
		return id + " " + name + " " + salary;
	}

}
