package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("Mary", 20));
		list.add(new Student("Simran", 20));
		list.add(new Student("Vijay", 10));
		list.add(new Student("Priya", 2));
		list.add(new Student("John", 26));
		list.add(new Student("Jane", 23));
		list.add(new Student("Priyanka", 76));

		list.forEach(System.out::println);

		Collections.sort(list);
		System.out.println();
		list.forEach(System.out::println);

		ArrayList<PlainStudent> list2 = new ArrayList<PlainStudent>();

		list2.add(new PlainStudent("Mary", 20));
		list2.add(new PlainStudent("Simran", 20));
		list2.add(new PlainStudent("Vijay", 10));
		list2.add(new PlainStudent("Priya", 2));
		list2.add(new PlainStudent("John", 26));
		list2.add(new PlainStudent("Jane", 23));
		list2.add(new PlainStudent("Priyanka", 76));

		System.out.println();
		list2.forEach(System.out::println);

		list2.sort(new RollNoSorterDsc());

		System.out.println();
		list2.forEach(System.out::println);

		list2.sort(new RollNoSorterAsc());

		System.out.println();
		list2.forEach(System.out::println);

		list2.sort((st1, st2) -> {//Lambda fn
			return st1.name.compareTo(st2.name);
		});

		System.out.println();
		list2.forEach(System.out::println);

	}

}

class RollNoSorterDsc implements Comparator<PlainStudent> {

	@Override
	public int compare(PlainStudent st1, PlainStudent st2) {
		if (st1.rollNo == st2.rollNo)
			return 0;
		else if (st1.rollNo > st2.rollNo)
			return -1;
		else
			return 1;
	}

}

class RollNoSorterAsc implements Comparator<PlainStudent> {

	@Override
	public int compare(PlainStudent st1, PlainStudent st2) {
		if (st1.rollNo == st2.rollNo)
			return 0;
		else if (st1.rollNo < st2.rollNo)
			return -1;
		else
			return 1;
	}

}

class NameSorter implements Comparator<PlainStudent> {

	@Override
	public int compare(PlainStudent st1, PlainStudent st2) {
		return st1.name.compareTo(st2.name);
	}

}
