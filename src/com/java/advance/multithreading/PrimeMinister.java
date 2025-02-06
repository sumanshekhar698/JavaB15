package com.java.advance.multithreading;

public class PrimeMinister {// Singleton Pattern

	String name;
	int age;
	private static PrimeMinister pm;

	private PrimeMinister(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	static synchronized PrimeMinister declarePM(String name, int age) {
		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;

	}

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + "]";
	}

}
