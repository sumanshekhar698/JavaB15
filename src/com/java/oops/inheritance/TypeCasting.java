package com.java.oops.inheritance;

public class TypeCasting {

	public static void main(String[] args) {
		Children children = new Children();
		System.out.println(children.x);// 100
		System.out.println(children.y);// 10
		System.out.println(children.z);// 30
		children.bar();

		Parent par1 = children;// Upcasting [Implicitly] :: promoting a child object to parent is called
								// UPCASTING

		System.out.println(par1.x);
		System.out.println(par1.y);
//		System.out.println(par1.z);

//		DOWNCASING: Its explicit, you have to force it
		Parent par2 = new Parent();

		if (par2 instanceof Children) {
			Children ch1 = (Children) par2;// ClassCastException
		} else {
			System.out.println("Downcasting not possible");
		}

//		DOWNCASING : you can only downcast which is already upcasted
		Children ch2 = (Children) par1;
		System.out.println(ch2.x);// 100
		System.out.println(ch2.y);// 10
		System.out.println(ch2.z);// 30

	}

}

class Parent {

	int x = 99;
	int y = 10;

	void foo() {
		System.out.println("foo Parent");
	}

}

class Children extends Parent {
	int x = 100;
	int z = 30;

	void foo() {
		System.out.println("foo Children");
	}

	void bar() {
		System.out.println("bar Children");

	}
}
