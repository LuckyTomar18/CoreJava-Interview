package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Employee(1, "f", 60000));
		list.add(new Employee(3, "e", 30000));
		list.add(new Employee(2, "d", 50000));
		list.add(new Employee(5, "f", 40000));

		EmployeeSortByName byName = new EmployeeSortByName();

		Collections.sort(list, byName);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

//		EmployeeSortByIdName ByIdName = new EmployeeSortByIdName();
//
//		Collections.sort(list, ByIdName);

//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}

//		EmployeeSortByIdNameSalary byIdNameSalary = new EmployeeSortByIdNameSalary();
//
//		Collections.sort(list, byIdNameSalary);
//
//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//		}

	}

}
