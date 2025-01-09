package com.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {

//		1 ---> 100 EVEN NOs ONLY

//		System.out.println(2);
//		System.out.println(4);// .... 100

//		SCOPE of variables
		int x = 9;

		int z;
		if (true) {
			int y = 10;
			z = 11;
			System.out.println("Line 18");
		}

		System.out.println(z);
//		1. for loop

//		for (int i = 1; i <= 100; i++) {// initialization; condition; updation
//
//			if (i % 2 == 0)
//				System.out.print(i + " ");
//
//		}
		int i = 2;
		for (i = 2; i <= 100; i += 2) {// initialization; condition; updation
			System.out.print(i + " ");
		}

		System.out.println(i);

//		Edge Case
//		for (i = 2; i >= 0; i += 1000) {// initialization; condition; updation
//			System.out.println(i + " ");
//		}

//		2. while

		int j = 0;
		while (j <= 100) {
			System.out.print(j + " ");
			j += 2;
		}

		System.out.println();
//		3. do while
		do {
			System.out.println("HEYYY!!");
		} while (6 == 7);// it will execute for one time at least

	}

}
