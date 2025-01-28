package com.java.oops.inheritance;

public class A {

	int x = 100;
	private int secret = 986;//private thing wil not get inherited

	public static void main(String[] args) {

		C c = new C();
		c.printX();
		c.foo();
//		c.foo1();

	}
	
	void foo() {
		System.out.println("A foo");
	}
	
	private void foo1() {
		System.out.println("A foo1");

	}
	
	final void foo2() {//final methods/fn cannot be overriden
		System.out.println("A foo2");
	}
	
	


}

class B extends A {
	int x = 99;
	
//	@Override
//	void foo2() {
//		System.out.println("B foo2");
//	}
}

class C extends B {
	int x = 98;

	void printX() {
		System.out.println(x);
		System.out.println(super.x);//super means IMMEDIATE parent
//		System.out.println(super.super.x);//super means IMMEDIATE parent
		
	}
	
	//Runtime Polymorphism
	@Override
	void foo() {//Methods/fn overriding :: the fn signature should exactly match
		System.out.println("C foo");
	}
	

	void bar() {//Specialized Fn
		System.out.println("C bar");
	}
}