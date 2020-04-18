package com.java8.functional.interfaces.bipredicates.examples;

import java.util.function.BiPredicate;

public class PredicateEvenNumberExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> predicate = (i, j) -> {
			int sumOfNumbers = (i + j);
			if (sumOfNumbers >= 100)
				return true;
			return false;

		};

		if (predicate.test(10, 20)) {
			System.out.println("Promoted to next level");
		}

		else {
			System.out.println("Cannot be promoted to next level due to less marks");

		}
		
		if (predicate.test(12, 88)) {
			System.out.println("Promoted to next level");
		}

		else {
			System.out.println("Cannot be promoted to next level due to less marks");

		}


	}

}
