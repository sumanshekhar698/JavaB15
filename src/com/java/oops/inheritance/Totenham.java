package com.java.oops.inheritance;

public class Totenham extends FootballPlayer{
	
	
	String city;

	
	public Totenham(String name, int age, Gender gender, int jerseyNo, int matchesPlayed, int noOfGoals, String city) {
		super(name, age, gender, jerseyNo, matchesPlayed, noOfGoals);
		this.city = city;
	}




}
