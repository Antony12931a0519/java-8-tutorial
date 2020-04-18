package com.java8.functional.interfaces.Biconsumer.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import Models.Employee;

public class BiConsumerExample {
	public static void main(String[] args) {

		BiConsumer<String, String> consumer = (i, j) -> {
			System.out.println("Name of employee is:" + i + " " + "and mobile number is:" + j);
		};

		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(1, "Antony", "9492630159", "antonysampath333@gmail");
		Employee emp2 = new Employee(1, "Sampath", "9492630159", "antonysampath333@gmail");
		Employee emp3 = new Employee(1, "Kumar", "9492630159", "antonysampath333@gmail");
		Employee emp4 = new Employee(1, "Reddy", "9492630159", "antonysampath333@gmail");
		Employee emp5 = new Employee(1, "Raj", "9492630159", "antonysampath333@gmail");
		Employee emp6 = new Employee(1, "Tony", "9492630159", "antonysampath333@gmail");

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		for (Employee emp : list) {
			consumer.accept(emp.getName(), emp.getMobile());
		}

	}

}
