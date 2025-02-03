package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.oops.static_concept.Employee;

public class ArrayListExample {

	public static void main(String[] args) {
//		Colections are Object and they hold only Object

//		It can have duplicates
//		its dynamic
//		It can hold null values

		ArrayList list = new ArrayList();
		list.add(4);
		list.add(true);
		list.add(null);
		list.add(new Employee("Johny"));
		list.add(true);

		System.out.println(list);

		list.remove(true);
		System.out.println(list);

		list.remove(true);
		System.out.println(list);

		ArrayList<Integer> listOfNumbers = new <Integer>ArrayList();// <Integer> generics
		listOfNumbers.add(4);
		listOfNumbers.add(54);
//		listOfNumbers.add(null);
//		listOfNumbers.add(true);
		listOfNumbers.add(54);
		listOfNumbers.add(54);
		listOfNumbers.add(99);
		System.out.println(listOfNumbers);
		
//		1. Traditional for loop for, while, do while
		for (int i = 0; i < listOfNumbers.size(); i++) {
//			listOfNumbers.add(i);
			System.out.println(listOfNumbers.get(i));
		}

		System.out.println();
//		2. for each loop
		for (int num : listOfNumbers) {
//			listOfNumbers.add(8);//java.util.ConcurrentModificationException 
			System.out.println(num);
		}

		System.out.println();
//		3. iterators
		Iterator<Integer> itr = listOfNumbers.iterator();
		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			System.out.println(num);
//			listOfNumbers.add(7);//java.util.ConcurrentModificationException 
		}
//		TODO: learn how to iterate from reverse using Iterators

		System.out.println();
//		4. Using Java Streams
//		System.out::println method inference,reference
		listOfNumbers.stream().forEach(System.out::println);// [4, 54, 54, 54, 99]

		System.out.println();
		listOfNumbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);// [4, 54, 54, 54]

	}

}
