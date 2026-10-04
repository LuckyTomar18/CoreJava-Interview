package com.rays.collection;

import java.util.Stack;

public class TestStackExercise {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char ch = 'a'; ch <= 'z'; ch++) {

			System.out.print(s.push(ch));

		}
		System.out.println(" ");
		Stack s1 = new Stack();

		while (!s.isEmpty()) {

			System.out.print(s1.push(s.pop()));

		}

	}

}
