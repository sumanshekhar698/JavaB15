package com.java.oops.exceptions;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int age = sc.nextInt();
			checkVotingEligiblity(age);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");

	}

	private static void checkVotingEligiblity(int age) throws InvalidVotingAge {
		
		if (age < 0 || age > 150) {
			throw new InvalidVotingAge("Invalid Entered Age");
		} else if(age < 18) {
			throw new InvalidVotingAge("Under Age for Voting");
		}

	}

}

class InvalidVotingAge extends Exception{

	public InvalidVotingAge(String message) {
		super(message);
	}
	

}
