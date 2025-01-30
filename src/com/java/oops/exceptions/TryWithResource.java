package com.java.oops.exceptions;

import java.util.Scanner;

public class TryWithResource {

//	try catch 
//	try catch catch catch catch
//	try catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
//	++ finally
//	try finally
//	++ try(with resource)
//	try(with resource)  


	public static void main(String[] args) {

//		Unchecked Exception
		System.out.println("START");

		int arr[] = { 34, 2, 23, 2 };

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println(arr[arr.length / sc.nextInt()]);// 1 : Exception
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {// java 8 +
			e.printStackTrace();
		} catch (Exception e) {// Default Exception block at last
			e.printStackTrace();
		}
//		finally {
//			System.out.println("finally!!!!");
//			sc.close();
//		}

		System.out.println("END");

	}

}
