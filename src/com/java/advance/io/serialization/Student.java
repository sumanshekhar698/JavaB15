package com.java.advance.io.serialization;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {//Serializable is a MARKER interface

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String name;//Static things are not Serialized
	transient private int rollNo;// private things are  Serialized

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student st) {
		if (st.rollNo == this.rollNo)
			return 0;
		else if (st.rollNo > this.rollNo)
			return -1;
		else
			return 1;

	}

}
