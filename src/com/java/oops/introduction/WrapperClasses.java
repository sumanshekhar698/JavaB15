package com.java.oops.introduction;

public class WrapperClasses {

	public static void main(String[] args) {

		int x = 0;
		Integer xObj = new Integer(0);// Deprecated

		System.out.println(xObj);

		System.out.println(xObj.MIN_VALUE);

		// Autoboxing
		Integer yObj = x;// no need of using new keyword

		// AutoUnboxing
		int y = yObj;

		Float f = 0.9f;
		Character chg = 'd';
		Boolean b = true;

	}

}
