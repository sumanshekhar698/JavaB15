package com.java.oops.final_keyword;

public class Main {

	public static void main(String[] args) {
		final float pi = 3.14159f;// final inside a fn

		final int valueOfDozen;
		valueOfDozen = 12;

		final Student student = new Student();// You cannot reassign
		student.name = "John";
		student.name = "Jim";

//		student = new Student();

//		valueOfDozen =13;

//		pi = -99;
	}

	static class Student {// inner classes
		String name;

	}

	class Bus {// inner classes
		String name;

	}

	static class School {
//		final String name= "DAV";//final with instance variables
		final String name;// final with instance variables

		{
			name = "";
		}

		public School(String name) {
//			this.name = name;
		}

	}

}
