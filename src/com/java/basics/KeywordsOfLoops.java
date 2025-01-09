package com.java.basics;

public class KeywordsOfLoops {

	public static void main(String[] args) {

		System.out.println("START");
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i);
//
//			if (i == 50)
//				break;//stop the whole loop
//
//		}

		for (int i = 0; i < 100; i++) {

			if (i == 50) {
				continue;// skip the current iteration
			}

			System.out.println(i);

		}

		System.out.println("END");

	}

}
