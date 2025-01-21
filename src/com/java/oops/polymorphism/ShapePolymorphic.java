package com.java.oops.polymorphism;

public class ShapePolymorphic {

//	The fn/method name should be same
//	- Parameter number
//	- Parameter type
//	- Parameter position
//	return type has nothing to do with polymorphism
//	area() is overloaded

	
//	Method Overloading: Compile Time Polymorphism
//	Method Overridng: Run Time Polymorphism: Runtime Polymorphism
	
	
	int area(int side) {
		return side * side;
	}

	double area(double radius) {
//		return 3.14159 * radius * radius;

		return Math.PI * radius * radius;

	}

	int area(int l, int b) {
		return l * b;
	}

	float area(int base, float height) {
		return 0.5f * base * height;
	}

	float area(float height, int base) {
		return base * height;
	}

}
