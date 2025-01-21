package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();

		System.out.println(shape.areaOfCircle(10));
		System.out.println(shape.areaOfTriangle(10, 6.2f));
		
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(10.0));
		System.out.println(shapePolymorphic.area(10, 6.2f));
		
		System.out.println();//println is also overloaded

	}

}
