package com.java.oops.abstraction;

import java.util.logging.Logger;

//public class BankAccount extends Object{

public class BankAccount {//Concrete Class
	private static long noOfAccounts = 0L;
	final long acNo;
	final String name;
	long phoneNo;
	private int balance;
	boolean hasRequestedLoan;
	
	
	private static final Logger LOG = Logger.getLogger(BankAccount.class.getName());

	public BankAccount(String name, long phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.acNo = ++noOfAccounts;

	}

	long checkBalance() {
		String msg = String.format("Hi, %s \n Your Balance is %d", name, balance);
//		System.out.println(msg);
		LOG.info(msg);
//		System.out.println("Balance :: " + balance);
		return balance;
	}

	void deposit(long amount) {

		if (amount > 0) {
			this.balance += amount;
		}

		String msg = String.format("Hi, %s \n Your New Balance is %d", name, balance);
//		System.out.println(msg);
		LOG.info(msg);
	}

	long withdraw(long amount) {
		if (amount < this.balance) {
			this.balance -= amount;
			return amount;
		}else {
			LOG.warning("Insuficient Balance");
		}
		String msg = String.format("Hi, %s \n Your Current Balance is %d", name, balance);
//		System.out.println(msg);
		LOG.info(msg);
		return 0;
		
	}

	@Override
	public String toString() {
		return "BankAccount [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance=" + balance
				+ ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}
	
	

}
