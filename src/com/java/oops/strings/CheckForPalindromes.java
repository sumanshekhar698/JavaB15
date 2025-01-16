package com.java.oops.strings;

import java.util.Scanner;

public class CheckForPalindromes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		
		if (reversedStr.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
		scanner.close();
		


	}

}
