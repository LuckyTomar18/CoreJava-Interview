package com.rays.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

	
	public static void main(String[] args) {
		
		
		Stream<String> stream = Stream.of("a", "c" , "b");
		
		String[] sa = stream.toArray(e -> new String[e]);
		
//		All string print
//		Arrays.stream(sa).forEach(System.out::println);    
		
		System.out.println(sa[1]);
	}
}
