package com.java.oops.arrays;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {

//		Arrays in Java

//		- Arrays is a simplest Data structure in Java
//		- Store bunch of Homogeneous data
//		- An Array Size cannot grow or shrink
//		- rray are Objects in Java

		int[] numArr = new int[10];

		System.out.println(numArr);

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(numArr));

		String strArr[] = new String[4];
		System.out.println(Arrays.toString(strArr));


//		for each loop
		String wordArray[] = { "Java", "Python", "Groovy", "Shell" };
		for (String word : wordArray) {
			System.out.println(word);

		}

	}

}
