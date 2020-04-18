package com.java8.functional.interfaces._predicates.examples;

import java.util.function.Predicate;

import Models.Employee;

public class PredicateRealTimeUsage {

	public static void main(String[] args) {

		Predicate<String> p = i -> {

			boolean result = (i.isEmpty() || i.contentEquals("")) ? true : false;
			return result;

		};

		Employee emp = new Employee();
		emp.setEmail("	2332");
		emp.setMobile("gqt	");

		if (p.test(emp.getEmail()))
			System.out.println("input value for email cannot be empty");

		if (p.test(emp.getMobile()))
			System.out.println("input value for mobile cannot be empty");

	}

}
