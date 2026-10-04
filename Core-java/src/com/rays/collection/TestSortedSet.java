package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {

	public static void main(String[] args) {
		
		
		SortedSet s = new TreeSet();
		
		s.add(15);
		s.add(10);
		s.add(5);
		s.add(20);
		
		
		System.out.println(s);
	        System.out.println(s.first());   // 5
	        System.out.println(s.last());    // 20
	        System.out.println(s.headSet(15)); // [5,10]
	        System.out.println(s.tailSet(10)); // [10,15,20]
	        System.out.println(s.subSet(5, 20)); // [5,10,15]
	}
}
