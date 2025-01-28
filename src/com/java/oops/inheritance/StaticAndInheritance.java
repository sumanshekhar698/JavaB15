package com.java.oops.inheritance;

public class StaticAndInheritance {

	static void foo() {
		System.out.println("foo");
	}

}

class Child extends StaticAndInheritance {
	
//	@Override// static fn cannot be overriden
	static void foo() {//Methods/fn hiding
		System.out.println("foooooooooooooo ");
	}
}
