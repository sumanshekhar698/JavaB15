package com.java.oops.arrays;

import java.util.Arrays;

public class StringArgs {

	public static void main(String ... suman) {
		
		System.out.println(suman.length);
		System.out.println(Arrays.toString(suman));


		foo(8, 9, 4, 2, 1, 3, 43);

	}

	static void foo(int... arr) {// Var Args
		System.out.println(Arrays.toString(arr));

	}

}
