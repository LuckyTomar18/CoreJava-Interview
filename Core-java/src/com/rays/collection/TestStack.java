package com.rays.collection;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(34);
		s.push(12);
		s.push(23);
		s.push(34);
		s.push(34);
		s.push(null);
		s.push(null);
		s.push(12);
		s.push(23);
		
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
	}

}
