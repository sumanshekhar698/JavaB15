package com.java.oops.exceptions;

public class ErrorExample {
	
	static int x = 0;
	
	public static void main(String[] args) {
		
		
		call();//java.lang.StackOverflowError
	}

	private static void call() {//Recursive Code
		System.out.println("calling.. "+ ++x);//5422
		call();
		
	}

}
