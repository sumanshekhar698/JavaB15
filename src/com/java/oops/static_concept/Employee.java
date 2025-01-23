package com.java.oops.static_concept;

public class Employee {
	String name;
	String empId;
	private static int counter = 0;

	public Employee(String name) {
		this.name = name;
		empId = "EMP" + ++counter;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

	
	// empID EMP1 EMP2 EMP3 ....

}
