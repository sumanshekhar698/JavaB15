package com.java.oops.strings;

public class StringMethods {

	public static void main(String[] args) {

//		Strings are immutable in Java
		String str1 = "the lion king";

		int length = str1.length();
		System.out.println(length);
		System.out.println(str1.charAt(1));// indexing starts form 0 not 1
		System.out.println(str1.charAt(str1.length() - 1));

		String str2 = " the lion kingg  ";
		str2 = str2.trim();// the lion kingg
		System.out.println(str2);
//		System.out.println(str3);

		boolean contains = str2.contains("lion");
		System.out.println(contains);

		str2 = "the lion iii i king";
		int str2I = str2.indexOf('i');
		System.out.println(str2I);

		str2I = str2.lastIndexOf('i');
		System.out.println(str2I);

		str2 = "lion7";
//		String str3 = str2.toUpperCase();
		str2 = str2.toUpperCase();
//		str2.toUpperCase();
		System.out.println(str2);

		String str4 = "";
		boolean isEmpty = str4.isEmpty();
		System.out.println(isEmpty);

//		String str5 = null;
//		isEmpty = str5.isEmpty();
//		System.out.println(isEmpty);

		String str6 = "the lion king";
		String substring1 = str6.substring(4);
		System.out.println(substring1);
		String substring2 = str6.substring(4, 8);// starting index is inclusive BUT ending index is EXCLUSIVE
		System.out.println(substring2);

//		String concatination
		String tom = "TOM";
		String jerry = "JERRY";
		String concat = tom.concat(jerry);
		System.out.println(concat);

		String tomAndJerry = tom + " & " + jerry;
		System.out.println(tomAndJerry);
		
//		TODO trim() vs strip() fn of difference
		
	}

}
