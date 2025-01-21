package com.java.oops.arrays;

import java.util.Arrays;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] mat1 = { 
				{ 2, 6, 89 }, 
				{ 0, 9, 5 } 
				};
		
		int[][] mat2 = { 
				{ 3, 89, 49 }, 
				{ 23, 89, 2 } 
				};
		
		
		if ((mat1.length == mat2.length) && (mat1[0].length == mat2[0].length)){//pre check
			
			int mat3 [][] = new int[mat1.length][mat1[0].length];
			
			for (int i = 0; i < mat3.length; i++) {
				for (int j = 0; j < mat3[i].length; j++) {
					mat3[i][j] =  mat1[i][j]  +mat2[i][j];
					
				}
			}
			
			
			for (int i = 0; i < mat3.length; i++) {
				System.out.println(Arrays.toString(mat3[i]));
			}
			
		}else {
			System.out.println("Addition not possible");
		}
	}

}
