package com.java.oops.constructors;

public class Bus {

	// has (properties) instance variables/fields

	String color;// null
	float mielage;// 0.0
	int topSpeed;// 0

	void move() {
		System.out.println("Bus is moving at " + topSpeed);
	}

	void stop() {
		System.out.println("Bus has stopped");
	}

	// Constructor
//	1. Its a special fn
//	2. The name should exactly match the class Name
//	3. It has NO return type
//	4. It is automatically called while obj creation
//	5. It cannot be invoked manually
//	6. Constructor is used to help while Object creation, we can do the initialization work here

//	Default Constructor is always parameter less & its added by Java ONLY if you haven't declared any 1 of your constructor
//	Bus() {
//		
//	}

//	Explicit Constructor is declared by the programmer
//	Parameter less constructor
	Bus() {
//		this();//don't do a self Constructor call
//		this("red",6.9f,98);//don't do a loop Constructor call

		System.out.println("Bus() called");
	}

//	Explicit Parameterized constructor

	Bus(String color, float mielage, int topSpeed) {
//		this();//Constructor Chaining RULE: it should always be the 1st statement
//		Chaining only happens from within the constructor
		this("Blue", true);
		System.out.println("Bus(String color, float mielage, int topSpeed) called");
//		Shadow Problem
		this.color = color;
		this.mielage = mielage;
		this.topSpeed = topSpeed;
	}

	Bus(String color, boolean flag) {
		this();
		System.out.println("Bus(String color,boolean flag) called");
	}

	String getBusInfo() {
		System.out.println("Unique bus code: "+this.hashCode());
		return "Color: " + color + "\nMielage: " + mielage + "\nTop Speed: " + topSpeed;
	}
	
	Bus getCurrentObj(){
		return this;
	}
	
	

}
