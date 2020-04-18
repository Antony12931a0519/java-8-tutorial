package com.java8.functional.interfaces.functions.examples;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		Function<Integer, String> function = i -> {

			if (i % 2 != 0)
				return i + ": is an Odd Number";
			else
				return i + ": is an Even Number";

		};
		
		System.out.println(function.apply(101));
		System.out.println(function.apply(12));
		
	}

}
