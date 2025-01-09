package com.java.basics;

public class ConditionalsAndOperators {

	public static void main(String[] args) {

//		Date 1 -31
		int dateOfMonth = 9;

		if (dateOfMonth >= 0 && dateOfMonth <= 31) {// &&: Logical AND
//			|| Logical OR
			if (dateOfMonth % 2 == 0) {// Comparison Operators == > < >= <= !=
				System.out.println("Even Numbers Cars are allowed");
			} else if (dateOfMonth % 2 != 0) {
				System.out.println("Odd Numbers  Cars are allowed");
			} else {
				System.out.println("Cannot Decide");
			}
		}

	}

}
