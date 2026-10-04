package com.rays.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		List<Contestent> list = new ArrayList<>();

		list.add(new Contestent("mohit", "9876543212"));
		list.add(new Contestent("sandeep", "8815603982"));
		list.add(new Contestent("shivkant", "6268923724"));
		list.add(new Contestent("goutam", "8349516759"));
		list.add(new Contestent("gourabh", "8349516759"));
		list.add(new Contestent("gourabh", "8349516759"));

		list.stream().filter(e -> e.phoneNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
  
					return e.stream();
				})).limit(1).forEach(e -> {

					System.out.println(e.name + " " + e.phoneNo);
				});

	}

}
