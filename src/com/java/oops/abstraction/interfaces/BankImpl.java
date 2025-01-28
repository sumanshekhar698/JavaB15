package com.java.oops.abstraction.interfaces;

public class BankImpl implements Bank {

	private static long noOfAccounts = 0L;
	final long acNo;
	final String name;
	long phoneNo;
	private int balance;
	boolean hasRequestedLoan;

	public BankImpl(String name, long phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.acNo = ++noOfAccounts;
	}

	@Override
	public String toString() {
		return "BankImpl [acNo=" + acNo + ", name=" + name + ", phoneNo=" + phoneNo + ", balance=" + balance
				+ ", hasRequestedLoan=" + hasRequestedLoan + "]";
	}

	@Override
	public long checkBalance() {
		String msg = String.format("Hi, %s \n Your Balance is %d", name, balance);
		LOG.info(msg);
		return balance;
	}

	@Override
	public void deposit(long amount) {

		if (amount > 0) {
			this.balance += amount;
		}

		String msg = String.format("Hi, %s \n Your New Balance is %d", name, balance);
		LOG.info(msg);
	}

	@Override
	public long withdraw(long amount) {
		if (amount < this.balance) {
			this.balance -= amount;
			return amount;
		} else {
			LOG.warning("Insuficient Balance");
		}
		String msg = String.format("Hi, %s \n Your Current Balance is %d", name, balance);
		LOG.info(msg);
		return 0;

	}

}
