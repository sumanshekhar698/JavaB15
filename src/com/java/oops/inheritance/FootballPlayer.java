package com.java.oops.inheritance;

public class FootballPlayer extends Player{
	
	int jerseyNo;
	int matchesPlayed;
	int noOfGoals;
	
	
	public FootballPlayer(String name, int age, Gender gender, int jerseyNo, int matchesPlayed, int noOfGoals) {
		super(name, age, gender);//super mans of immediate parent
		System.out.println("FootballPlayer(String name, int age, Gender gender, int jerseyNo, int matchesPlayed, int noOfGoals) called");
		this.jerseyNo = jerseyNo;
		this.matchesPlayed = matchesPlayed;
		this.noOfGoals = noOfGoals;
	}


	@Override
	public String toString() {
		return "FootballPlayer [jerseyNo=" + jerseyNo + ", matchesPlayed=" + matchesPlayed + ", noOfGoals=" + noOfGoals
				+ ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
//	Rules
//	1. Whenever you have a constructor in child class It will call the parent constructor also
//	2. the super statement should be the 1st statement
//	3. You can have only one parent [Multiple inheritance is not allowed] Diamond Problem
//	4. MultiLevel inheritance is  allowed
//	5. Circular/Cyclic inheritance in not allowed
//	6. Inheritance does not happen backward
//	7. final classes cannot be inherited
//	8. private thing will not get inherited
//	9. final methods/fn cannot be overridden
	
	

	
	/*
	 * class A extends B{
	 * 
	 * }
	 * 
	 * class B extends A{
	 * 
	 * }
	 */
}
