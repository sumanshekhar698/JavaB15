package com.java.oops.arrays;

public class PassByValAndRef {

	public static void main(String[] args) {

		int[] arr = { 4, 43, 342, 3 };
		int x = 9;
		foo(arr, x);

		System.out.println(x);//10 9 9 9
		System.out.println(arr[0]);//0 0 0 4

	}

	static void foo(int[] arr, int x) {
		x = 10;
		arr[0] = 0;

	}

}
