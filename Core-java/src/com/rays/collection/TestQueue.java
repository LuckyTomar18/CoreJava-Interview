package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public interface TestQueue {

	public static void main(String[] args) {

		Queue u = new ArrayBlockingQueue(2);

//		u.add(1);
//		u.add(2);
//		u.add(3);

		u.offer(3);
		u.offer(4);
		u.offer(5);
		System.out.println(u.offer(5));

		System.out.println(u);

	}

}
