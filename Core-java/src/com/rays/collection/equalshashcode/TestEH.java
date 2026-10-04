package com.rays.collection.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class TestEH {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Ram", 5000);
		Employee e2 = new Employee(2, "shyam", 1000);
		Employee e3 = new Employee(3, "mohit", 3000);
		Employee e4 = new Employee(1, "Ram", 5000);

		List list = new ArrayList();

		list.add(e1);
		list.add(e2);

		System.out.println(e1.equals(e2));
		
		System.out.println(e1.equals(e4));
		
		System.out.println(e1.hashcode() == e2.hashcode());
		
		System.out.println(e2.hashcode());
		
		System.out.println(e1.equals(e4));
	}

}
