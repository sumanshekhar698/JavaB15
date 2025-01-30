package com.java.oops.exceptions;

import java.util.Scanner;

public class FinallyExample {

//	try catch 
//	try catch catch catch catch
//	try catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
//	++ finally
//	try finally

	public static void main(String[] args) {

//		Unchecked Exception
		System.out.println("START");

		Scanner sc = new Scanner(System.in);

		int arr[] = { 34, 2, 23, 2 };

		try {
			// Risky lines
			System.out.println(arr[arr.length / sc.nextInt()]);// 1 : Exception
		} finally {
			System.out.println("finally!!!!");
			sc.close();
		}

		System.out.println("END");

	}

}
