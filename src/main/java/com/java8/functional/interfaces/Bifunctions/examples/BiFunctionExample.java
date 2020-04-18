package com.java8.functional.interfaces.Bifunctions.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import Models.Employee;

public class BiFunctionExample {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(1, "Antony", "9492630159", "antonysampath333@gmail");
		Employee emp2 = new Employee(121, "Sampath", "9492630159", "antonysampath333@gmail");
		Employee emp3 = new Employee(122, "Kumar", "9492630159", "antonysampath333@gmail");
		Employee emp4 = new Employee(123, "Reddy", "9492630159", "antonysampath333@gmail");
		Employee emp5 = new Employee(11, "Raj", "9492630159", "antonysampath333@gmail");
		Employee emp6 = new Employee(12, "Tony", "9492630159", "antonysampath333@gmail");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		for (Employee emp : list) {

			if (map.containsKey(emp.getEmpId())) {
				emp = map.get(emp.getEmpId());
			} else {
				map.put(emp.getEmpId(), emp);
			}
		}

		BiFunction<Integer, String, Employee> function = (empId, name) -> {

			if (empId != 0 && !(name.isEmpty())) {
				return map.get(empId);
			}

			return null;
		};

		System.out.println(function.apply(101, "Antony"));
		System.out.println(function.apply(12, "Sampath"));
		System.out.println(function.apply(1, "Antony"));

	}

}
