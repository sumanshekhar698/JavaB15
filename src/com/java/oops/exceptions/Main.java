package com.java.oops.exceptions;

import java.util.Scanner;

public class Main {

	
//	try catch 
//	try catch catch catch catch
//	try catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
	
	
	public static void main(String[] args) {

//		Unchecked Exception
		System.out.println("START");

		Scanner sc = new Scanner(System.in);

		int arr[] = { 34, 2, 23, 2 };

		try {
			// Risky lines
			System.out.println(arr[arr.length / sc.nextInt()]);// 1 : Exception
		} 
		
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		
//		specific catch block
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {//java 8 +
			e.printStackTrace();
		}
		catch (Exception e) {// Default Exception block at last
			e.printStackTrace();
		}

		System.out.println("END");

	}

}
