package com.java.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("Urvashi", 30);
		
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		
//		st1.age =80;
		
		st1.setName("Urvshi");
		System.out.println(st1.getName());
		System.out.println(st1.getAge());

	}

}
