package com.java.oops.arrays;

public class CloningOfArray {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 23, 234, 23, 23 };
		int[] arr2 = arr;

		arr[0] = -111;
		System.out.println(arr2[0]);// -111

		int[] arrBackup = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arrBackup[i] = arr[i];
		}
		
		arr[0] = -100;
		System.out.println(arr[0]);
		System.out.println(arrBackup[0]);
		
		
		
		int[] clonedArr = arr.clone();//Makes Sure its a 1D array
		arr[0] = -1000;
		System.out.println(arr[0]);
		System.out.println(clonedArr[0]);


	}

}
