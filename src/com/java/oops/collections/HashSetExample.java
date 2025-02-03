package com.java.oops.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {
	public static void main(String[] args) {

		int arr[] = { 3, 32, 2, 2, 3, 23, 2, 43 };

		
//		Does not contains Duplicates
//		Order is not preserved
//		Searching is very fast
		HashSet<Integer> set = new HashSet<Integer>();//It uses Hashing
		
//		
//		for (Integer num : arr) {
//			set.add(num);
//		}
//		
//		System.out.println(set);
		
		Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(collect);
		
		
		for (Integer integer : collect) {
			System.out.println(integer);
			
		}
		
		boolean contains = collect.contains(3);
		System.out.println(contains);
		
//		Collections.sort(collect);

	}

}
