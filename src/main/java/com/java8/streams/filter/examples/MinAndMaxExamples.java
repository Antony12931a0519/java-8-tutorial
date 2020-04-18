package com.java8.streams.filter.examples;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxExamples {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(101);
		list.add(103);
		list.add(11);
		list.add(21);
		list.add(31);
	

		
		
		long leastNumber = list.stream().min((e1,e2)->e1.compareTo(e2)).get();
		long bigNumber = list.stream().min((e1,e2)->e2.compareTo(e1)).get();
		
		System.out.println("Least number is :"+leastNumber);
		System.out.println("Big number is :"+bigNumber);
		
		long big = list.stream().min((e1,e2)->-e1.compareTo(e2)).get();
		System.out.println("Big number is :"+bigNumber);
		

	}

}
