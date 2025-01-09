package com.java.basics;

public class BaiscOperators {

	public static void main(String[] args) {

		int x = 9;

		System.out.println("Arithmetic Operators");

		x = 9 * 7;// * / - + %
		System.out.println(5 % 2);
//		System.out.println(5 / 0);
		System.out.println(2 % 10);

		System.out.println("Unary Operators");
		x = 100;
		System.out.println(x);// 100
		x++;// post increment
		System.out.println(x);// 101
		++x;// pre increment
		System.out.println(x);// 102

		x = 100;
		System.out.println(x);// 100
		System.out.println(x++);// 100 ---> x = 100 + 1 = 101
//		System.out.println(x);//101
		System.out.println(++x);// 102

//		TODO
		x = 100;
		int y = 50;
		y = --x - ++y - y-- + x++ - --x + ++y - --x + --y;
//		System.out.println(y);
//		System.out.println(x);

		System.out.println("Shorthand Operators");
		x = 100;
//		x = x * 5;
		x *= 5;
		System.out.println(x);

		System.out.println("Bitwise Operators");
		System.out.println(41 | 5);// Bitwise OR: convert 41 to binary the | convert 5 to binary --> binary --->
									// decimal
		System.out.println(41 & 5);// Bitwise AND: convert 41 to binary the & convert 5 to binary --> binary --->
									// decimal
		System.out.println(~5);// Bitwise NOT: convert 5 to binary and flip the bits ---> decimal
		System.out.println(7 ^ 3);// Bitwise XOR: convert 7 to binary the ^ convert 3 to binary --> binary --->
									// decimal
		System.out.println(16 << 3);// Bitwise Left Shift: convert 16 to binary and shift the bit towards left 3
									// times
		System.out.println(16 >> 3);// Bitwise Right Shift: convert 16 to binary and shift the bit towards right 3
									// times

	}

}
