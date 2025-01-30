package com.java.oops.exceptions;

public class ExceptionPropagation {
	
//	DEH : Default Exception Handler

	
	/*
	 * Stack Trace
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
	 * com.java.oops.exceptions.ExceptionPropagation.callC(ExceptionPropagation.java
	 * :21) at
	 * com.java.oops.exceptions.ExceptionPropagation.callB(ExceptionPropagation.java
	 * :16) at
	 * com.java.oops.exceptions.ExceptionPropagation.callA(ExceptionPropagation.java
	 * :11) at
	 * com.java.oops.exceptions.ExceptionPropagation.main(ExceptionPropagation.java:
	 * 6)
	 */
	public static void main(String[] args) throws InterruptedException {
		callA();

	}

	private static void callA() throws InterruptedException {
		callB();
		
	}

	private static void callB() throws InterruptedException {
		callC();
		
	}

	private static void callC() throws InterruptedException {
//		System.out.println(1/0);
		
		
		for (int i = 0; i < 10; i++) {
				Thread.sleep(500);//Checked Exception
			System.out.println(i);
		}
		
	}

}
