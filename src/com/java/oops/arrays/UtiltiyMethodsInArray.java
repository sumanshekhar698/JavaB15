package com.java.oops.arrays;

import java.util.Arrays;

public class UtiltiyMethodsInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 23, 234, 23, 23 };
		int[] arr2 = arr;
		int arr3 [] = { 3, 2, 4, 23, 234, 23, 23 };
		
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, -1);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 2, 5, 10);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

		
		Arrays.sort(arr3);//ASC
		System.out.println(Arrays.toString(arr3));

		Arrays.sort(arr3);//DSC = ASC + Reverse
		System.out.println(Arrays.toString(arr3));
		

	}

}
