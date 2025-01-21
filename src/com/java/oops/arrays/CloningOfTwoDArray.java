package com.java.oops.arrays;

public class CloningOfTwoDArray {
	
	public static void main(String[] args) {

		int[][] mat1 = { 
				{ 2, 6, 89 }, 
				{ 0, 9, 5 } 
				};
		
//		int[][] cloned = mat1.clone();
		
		
		
		
		
//		mat1[0][0] = 100;
//		System.out.println(cloned[0][0]);
		
		
		int [][] matCloned = new int[mat1.length][];
		
		
		for (int i = 0; i < matCloned.length; i++) {
			matCloned[i] = mat1[i].clone();
		}
		
		
		mat1[0][0] = 100;
		System.out.println(matCloned[0][0]);
		
	}

}
