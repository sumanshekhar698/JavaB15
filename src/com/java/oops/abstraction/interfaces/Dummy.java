package com.java.oops.abstraction.interfaces;

public interface Dummy {

//	JDK 8 onwards
	static void foo() {
		System.out.println("foo");
	}

	default void bar() {
		System.out.println("bar");
		toy();
	}

	
//	Java 11 onwards
	private void toy() {
		System.out.println("bar");
	}

}

interface Example2 extends Dummy{
	
}