package com.java.oops.abstraction;

public class BankAccountAbsImpl extends BankAccountAbs {

	public BankAccountAbsImpl(String name, long phoneNo) {
		super(name, phoneNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	long checkBalance() {
		String msg = String.format("Hi, %s \n Your Balance is %d", name, balance);
		LOG.info(msg);
		return balance;
	}

	@Override
	void deposit(long amount) {

		if (amount > 0) {
			this.balance += amount;
		}

		String msg = String.format("Hi, %s \n Your New Balance is %d", name, balance);
		LOG.info(msg);
	}

	@Override
	long withdraw(long amount) {
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
