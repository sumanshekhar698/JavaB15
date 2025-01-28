package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount("John", 9879879867L);
		System.out.println(ac1);

		ac1.checkBalance();
		ac1.deposit(1000);
		long withdraw = ac1.withdraw(10000);

//		new BankAccountAbs("John", 9879879867L);//You cannot create a Object of Abstract class DIRECTLY
		
		BankAccountAbs ac0 = new BankAccountAbs("John", 9879879867L) {
			
			@Override
			long withdraw(long amount) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			void deposit(long amount) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			long checkBalance() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		BankAccountAbs ac2 = new BankAccountAbsImpl("Jane", 9897645348L);
		ac2.deposit(1000);
		long amount = ac2.withdraw(100);
		System.out.println(amount);
		ac2.checkBalance();

	}

}
