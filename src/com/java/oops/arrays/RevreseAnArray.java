package com.java.oops.arrays;

import java.util.Arrays;

public class RevreseAnArray {

	public static void main(String[] args) {

		int arrNum[] = { 4, 6, 78, 2, 4, 87, 34 };
		System.out.println(Arrays.toString(arrNum));

		
//		[34, 87, 4, 2, 78,  6, 4]
		
//		1. Backup Array
		
//		int reversedArray[] = new int[arrNum.length];
//
//		for (int i = arrNum.length - 1, j =0; i >= 0; i--) {
//			reversedArray[j++] = arrNum[i];
//
//		}
//		
//		System.out.println(Arrays.toString(reversedArray));
//
//		for (int i = 0; i < reversedArray.length; i++) {
//			arrNum[i] = reversedArray[i];
//		}

//		2. Double Pointer/Index
		int i = 0, j = arrNum.length - 1;
		while (i <= j) {

			int temp = arrNum[i];
			arrNum[i] = arrNum[j];
			arrNum[j] = temp;

			i++;
			j--;

		}

		System.out.println(Arrays.toString(arrNum));
	}

}
