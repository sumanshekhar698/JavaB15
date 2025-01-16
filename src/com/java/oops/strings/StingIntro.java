package com.java.oops.strings;

public class StingIntro {

	public static void main(String[] args) {
//		A String is a sequence of characters
//		Strings are objects in Java
//		Strings are immutable in Java

		String str1 = "the lion king";
		String str2 = new String("the lion king");
		String str3 = "the lion king";
		String str4 = new String("the lion king");
		String str5 = "the lion king";
		String str6 = "The lion king";



		if (str1 == str3) {// == does not compare the values of a String rather it compares the objects address
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}

		if (str2 == str4) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		if (str5 == str1) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		
		if (str5 == str6) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		
		
		if (str5.equals(str6)) {
			System.out.println("Same Value");
		} else {
			System.out.println("Different Value");
		}
		
		
		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("Same Value");
		} else {
			System.out.println("Different Value");
		}

	}

}
