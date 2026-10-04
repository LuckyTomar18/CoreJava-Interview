package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "mohit");
		map.put(2, "sandeep");
		map.put(3, "shivkant");
		map.put(4, "goutam");
		
		
//		map.clear();
//		map.remove(1);
//		System.out.println(map.get(1));
		map.containsValue("sandeep");
		System.out.println(map.containsValue("sandeep"));
		System.out.println(map);
		  
		
		
		
	}

}
