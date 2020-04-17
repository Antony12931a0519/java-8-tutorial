package com.java8.sorting.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNumbersUsingJava8 {
	public static void main(String[] args) {

		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(100);
		numbers1.add(2);
		numbers1.add(-1);
		numbers1.add(23);
		numbers1.add(4);
		numbers1.add(0);
		numbers1.add(40);

		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(100);
		numbers2.add(2);
		numbers2.add(-1);
		numbers2.add(23);
		numbers2.add(4);
		numbers2.add(0);
		numbers2.add(40);

		SortingNumbersUsingJava8 tester = new SortingNumbersUsingJava8();
		System.out.println("Sort using Java 7 syntax: ");
		System.out.println("Before Sorting:" + numbers1);
		tester.sortUsingJava7(numbers1);
		System.out.println("After Sorting:" + numbers1);

		System.out.println("Sort using Java 8 syntax: ");
		System.out.println("Before Sorting:" + numbers2);
		tester.sortUsingJava8(numbers2);
		System.out.println("After Sorting:" + numbers2);
	}

	// sort using java 7
	private void sortUsingJava7(List<Integer> numbers) {
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
	}

	// sort using java 8
	private void sortUsingJava8(List<Integer> numbers) {
		Collections.sort(numbers, (s1, s2) -> s1 - s2);
	}

}
