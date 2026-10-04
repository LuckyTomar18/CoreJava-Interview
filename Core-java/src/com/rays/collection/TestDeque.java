package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
	
	public static void main(String[] args) {
		
		Deque q  = new ArrayDeque();
		
		q.offer(13);
		q.offer(12);
		q.offer(13);
		q.offer(19);
		q.offer(90);
		q.offer(78);
		
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q);
//		System.out.println(q.pop());
//		System.out.println(q);
		System.out.println(q.pollFirst());
		System.out.println(q);
		
		
	}

}
