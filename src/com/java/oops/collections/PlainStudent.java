package com.java.oops.collections;

public class PlainStudent {

	String name;
	int rollNo;

	public PlainStudent(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
}
