package com.java.oops.constructors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);

//		Integer num = new Integer(8);

		Bus b1 = new Bus();
		b1.color = "blue";
		b1.topSpeed = 100;
		b1.mielage = 8;
		System.out.println(b1.getBusInfo());
		System.out.println(b1);//61baa894
		System.out.println(b1.hashCode());
		System.out.println(b1.getCurrentObj().hashCode());

		System.out.println();
		Bus b2 = new Bus("Red", 20.0f, 80);
		System.out.println(b2.getBusInfo());
		System.out.println(b2);//b065c63
		System.out.println(b2.hashCode());
		System.out.println(b2.getCurrentObj().hashCode());

		

		
	}

}
