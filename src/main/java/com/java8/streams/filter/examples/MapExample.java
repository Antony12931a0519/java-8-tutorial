package com.java8.streams.filter.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Models.Employee;

public class MapExample {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(1, "Antony", "9492630159", 1000, "antonysampath333@gmail");
		Employee emp2 = new Employee(1, "Sampath", "9492630159", 2000, "antonysampath333@gmail");
		Employee emp3 = new Employee(1, "Kumar", "9492630159", 3000, "antonysampath333@gmail");
		Employee emp4 = new Employee(1, "Reddy", "9492630159", 4000, "antonysampath333@gmail");
		Employee emp5 = new Employee(1, "Raj", "9492630159", 5000, "antonysampath333@gmail");
		Employee emp6 = new Employee(1, "Tony", "9492630159", 6000, "antonysampath333@gmail");

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		List<Long> updatedSalaries = list.stream().map(employee -> employee.getSalary() + 5000)
				.collect(Collectors.toList());
		System.out.println("Current Salaries are:");
		for (Employee e : list) {
			System.out.println(e.getSalary());
		}

		System.out.println("updated Salaries are:");
		System.out.println(updatedSalaries);

	}
}
