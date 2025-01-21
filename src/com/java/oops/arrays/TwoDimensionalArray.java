package com.java.oops.arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] matrix = new int[3][5];

		for (int i = 0; i < matrix.length; i++) {// matrix.length ==> no of 1D arrays in this 2D array
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		

	}

}
