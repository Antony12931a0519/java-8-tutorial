package com.java8.functional.interfaces;

@FunctionalInterface
public interface AdditonCalculator {

	public void add(int a, int b);

	static void method1() {
		System.out.println("Hey am static method");
	}

	static void method2() {
		System.out.println("Hey am static method");
	}

	default void defaultMethod() {
		System.out.println("Hey am default method");
	}
	default void defaultMethod1() {
		System.out.println("Hey am default method");
	}

	// public void sub(int a,int b);

}
