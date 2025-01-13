package com.java.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Menu Driven Program

//		Vending Machine

		// 1. Create a Scanner Object
		Scanner sc = new Scanner(System.in);

//		System.out.println(choice);

//		if (choice == 1) {
//			System.out.println("Enjoy your Coke");
//		} else if (choice == 2) {
//			System.out.println("Enjoy your Limca");
//
//		} else if (choice == 3) {
//			System.out.println("Have your Water");
//
//		} else if (choice == 4) {
//			System.out.println("Enjoy your Maza");
//
//		} else {
//			System.out.println("Invalid Option");
//		}

		boolean flag = true;
		loop1: while (true) {
			System.out.println("Enter you drink: \n1.Cocacola \n2.Limca \n3.Water \n4.Maza \n0 EXIT");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enjoy your Coke");
				break;
			}
			case 2: {
				System.out.println("Enjoy your Limca");
				break;
			}
			case 0: {
				System.out.println("Bye Bye !!");
//				System.exit(7);

//				flag = false;
				break loop1;
			}
			case 3: {
				System.out.println("Enjoy your Water");
				break;
			}
			case 4: {
				System.out.println("Enjoy your Maza");
				break;
			}
			default: {
				System.out.println("Invalid Option");
				break;
			}
			}

			System.out.println();
		}

		sc.close();
		System.out.println("Program Shutdown");
	}

}
