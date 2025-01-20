package com.java.oops.arrays;

import java.util.Arrays;

public class StoreFirstNSquaresOfIndicesOfAray {

	public static void main(String[] args) {

		int[] numArr = new int[7];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i*i;
		}
		
		
		System.out.println(Arrays.toString(numArr));

	}

}
