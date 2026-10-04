package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	
	public static void main(String[] args) {
		
		
		Set s = new HashSet();
		
		s.add(1);
		s.add("one");
		s.add(23);
		s.add(null);
		s.add(null);
		s.add(23);
		s.add(" ");
		s.add(" ");
		
		System.out.println(s);
		
	}
}
