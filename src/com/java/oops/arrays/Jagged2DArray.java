package com.java.oops.arrays;

import java.util.Arrays;

public class Jagged2DArray {

	public static void main(String[] args) {
		int[][] jagged2DArray = new int[3][];
		
		jagged2DArray[0]= new int[5];
		jagged2DArray[1]= new int[3];
		jagged2DArray[2]= new int[4];
		
		for (int i = 0; i < jagged2DArray.length; i++) {
			System.out.println(Arrays.toString(jagged2DArray[i]));
		}
		
		

	}

}
