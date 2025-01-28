package com.java.oops.abstraction;

import java.util.logging.Logger;


// 0 - 100%
public abstract class BankAccountAbs {// Abstract Class
	private static long noOfAccounts = 0L;
	final long acNo;
	final String name;
	long phoneNo;
	protected int balance;
	boolean hasRequestedLoan;

	protected static final Logger LOG = Logger.getLogger(BankAccountAbs.class.getName());

	public BankAccountAbs(String name, long phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.acNo = ++noOfAccounts;

	}

	abstract long checkBalance();// A fn/method without body is called abstract fn/method

	abstract void deposit(long amount);

	abstract long withdraw(long amount);

	@Override
	public String toString() {
		return "BankAccount [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance=" + balance
				+ ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}

}
