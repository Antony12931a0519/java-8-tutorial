package com.java8.functional.interfaces._predicates.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PredicateEvenNumberExample {

	static Predicate<Integer> predicate = i -> {
		if (i % 2 == 0)
			return true;
		else
			return false;
	};

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(new Random(i).nextInt());

		}

		System.out.println("Number are :" + numbers);
		for (Integer i : numbers) {
			if (predicate.test(i)) {
				System.out.println(i + " is an Even number.");
			}

		}

	}

}
