package com.java.oops.maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
//		K:V
//		3: john
//		67: Priyanka

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();// Hashing is applied on Keys so the order is
																			// not mainatined
		hashMap.put(3, "John");// Keys cannot be duplicate
		hashMap.put(67, "Priyanka");// Values can be Duplicate
		hashMap.put(3, "jim");
		hashMap.put(5, "jim");
		hashMap.put(33, "Mary");
		hashMap.put(432, "Kim");

		System.out.println(hashMap);
		System.out.println(hashMap.containsKey(3));

		System.out.println(hashMap.containsValue("Kim"));

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
