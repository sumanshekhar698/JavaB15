package com.java.advance.multithreading;

public class SynchronizationProblem {

	public static void main(String[] args) {
//		PrimeMinister pm1 = new PrimeMinister("Narendra Modi", 50);
//		PrimeMinister pm2 = new PrimeMinister("Rahul Gandhi", 40);
		
		PrimeMinister pm1 =PrimeMinister.declarePM("Narendra Modi", 50);
		System.out.println(pm1);
		System.out.println(pm1.hashCode());
		PrimeMinister pm2 = PrimeMinister.declarePM("Rahul Gandhi", 40);
		System.out.println(pm2);
		System.out.println(pm2.hashCode());



	}

}


