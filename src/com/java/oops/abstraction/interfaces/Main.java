package com.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
//		new Bank();//You cannot create a Object of interface DIRECTLY

		Bank ac0 = new Bank() {

			@Override
			public long withdraw(long amount) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void deposit(long amount) {
				// TODO Auto-generated method stub

			}

			@Override
			public long checkBalance() {
				// TODO Auto-generated method stub
				return 0;
			}
		};// Annonymous Inner Type/Class

		BankImpl ac1 = new BankImpl("Ravi", 9008767653L);
		System.out.println(ac1);

//		Valid for Functional Interfaces

		Plane plane = () -> {// Lambda Expression
			System.out.println("flying..");
		};
		
		plane.fly();

	}

}
