package com.java.oops.encapsulation;

public class Student {

	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void sayMyName() {
		System.out.println(name);
	}

}
