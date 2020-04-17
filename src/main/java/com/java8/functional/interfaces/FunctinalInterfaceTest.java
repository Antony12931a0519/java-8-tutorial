package com.java8.functional.interfaces;

public class FunctinalInterfaceTest {

	public static void main(String[] args) {

		AdditonCalculator ref = (int a, int b) -> {

			System.out.println(a + b);
		};

		/*
		 * public int sub(int a,int b) { return a-b; }
		 */

		SubtractionTestWithReturnType ref1 = (int a, int b) -> {

			return a - b;
		};

		SubtractionTestWithReturnType ref2 = (a, b) -> {

			return a - b;
		};

		SubtractionTestWithReturnType ref3 = (a, b) -> a - b;
		;

		ref.add(1, 2);
		System.out.println(ref1.sub(10, 2));
		System.out.println(ref2.sub(10, 2));

		System.out.println(ref3.sub(10, 2));

		AdditonCalculator.method1();
		AdditonCalculator.method2();

		// AdditonCalculator ref1 = new AdditonCalculator();
		// FunctinalInterfaceTest ref1 = new FunctinalInterfaceTest();

	}

}
