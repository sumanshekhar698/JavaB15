package com.java.oops.exceptions;

public class CheckedExceptions {

	public static void main(String[] args) {


		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {//Checked Exceptions
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
