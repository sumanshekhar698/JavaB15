package com.java.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		FootballPlayer messi = new FootballPlayer("Messi", 40, Gender.MALE, 20, 440, 80);
		System.out.println(messi);
		
		Child child = new Child();
		child.foo();//static things gets inherited
		

	}

}
