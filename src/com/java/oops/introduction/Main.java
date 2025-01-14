package com.java.oops.introduction;

public class Main {

	public static void main(String[] args) {

		int x = 9;// x
		
	
		// bus1 is a reference variable
		Bus bus1 = new Bus();// color, mielage, topSpeed

		Bus bus3 = bus1;

		Bus bus0 = null;
//		System.out.println(bus0.color);// null

		// Default Value
		System.out.println(bus1.color);// null
		System.out.println(bus1.mielage);// 0.0
		System.out.println(bus1.topSpeed);// 0

		bus1.color = "Red";
		bus1.mielage = 12.4f;
		bus1.topSpeed = 80;

		System.out.println(bus1.color);
		System.out.println(bus1.mielage);
		System.out.println(bus1.topSpeed);

		bus3.color = "SIlVER";
		System.out.println(bus1.color);

		bus1.move();
		bus1.stop();

		Bus bus2 = new Bus();// color, mielage, topSpeed
		System.out.println(bus2.color);//
		System.out.println(bus2.mielage);//
		System.out.println(bus2.topSpeed);//

		bus2.color = " Blue";
		bus2.mielage = 10;
		bus2.topSpeed = 50;
		System.out.println(bus2.color);
		System.out.println(bus2.mielage);
		System.out.println(bus2.topSpeed);

		bus2.move();

		bus2 = bus1;

		System.out.println(bus2.color);
//		int x;
//
//		x = 89;
//		System.out.println(x);// 0

//		Bus b2;

	}

}
