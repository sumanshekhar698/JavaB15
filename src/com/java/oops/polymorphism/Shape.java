package com.java.oops.polymorphism;

public class Shape {

	int areaOfSquare(int side) {
		return side * side;
	}

	double areaOfCircle(double radius) {
//		return 3.14159 * radius * radius;

		return Math.PI * radius * radius;

	}

	int areaOfRectangle(int l, int b) {
		return l * b;
	}

	float areaOfTriangle(int base, float height) {
		return 0.5f * base * height;
	}

	float areaOfParalleloGram(int base, float height) {
		return base * height;
	}

}
