package com.java8.functional.interfaces.supplier.examples;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> {
			return new Date().toString();

		};

		System.out.println(supplier.get());
	}

}
