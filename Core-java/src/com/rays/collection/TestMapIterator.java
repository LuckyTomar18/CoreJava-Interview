
package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMapIterator {
	
	public static void main(String[] args) {
		
		
		Map map = new HashMap();
		
		map.put(1, "sandeep");
		map.put(2, "mohit");
		map.put(3, "shiv");
		map.put(4, null);
		map.put(4, "snull");
		
		for(Object o : map.entrySet()) {
			System.out.println(o);
		}
		
		for(Object o : map.values()) {
			
			System.out.println(o);
		}
		
		for(Object o : map.keySet()) {
			System.out.println(o);
		}
	}

}
