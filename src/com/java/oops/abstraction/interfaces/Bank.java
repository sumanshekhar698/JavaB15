package com.java.oops.abstraction.interfaces;

import java.util.logging.Logger;

//100% abstraction
public interface Bank {
//	You can ONLY have abstract methods
	Logger LOG = Logger.getLogger(Bank.class.getName());

	int IFSC_CODE = 876;// All the variables in interface are Constants [public static final]

	long checkBalance();// A fn/method without body is called abstract fn/method

	void deposit(long amount);

	abstract long withdraw(long amount);

}
