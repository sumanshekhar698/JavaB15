package com.java.oops.collections;

public class Student implements Comparable<Student> {

	String name;
	int rollNo;

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
