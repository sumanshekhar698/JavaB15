package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
//		List<Integer> list = List.of(23, 34, 3, 455);// immutable List

		ArrayList<String> words = new ArrayList<String>() {
			{
				add("Monkey");
				add("Lion");
				add("Peacock");
				add("Hen");
				add("Chick");
				add("Lion");

			}
		};

		System.out.println(words);
//		words.clear();
		
		words.add("Pig");
		words.addFirst("Swan");
		
		System.out.println(words);
		
		boolean contains = words.contains("hen");
		System.out.println(contains);// n is the size of the ArrayList
		
		boolean empty = words.isEmpty();
		System.out.println(empty);
		
//		words.getFirst();
		
		System.out.println(words);

//		Collections.shuffle(words);
		
		Collections.sort(words);//ASC
		System.out.println(words);
		Collections.sort(words,Collections.reverseOrder());//DESC
		System.out.println(words);



	}

}
