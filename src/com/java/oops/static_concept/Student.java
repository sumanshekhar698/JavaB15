package com.java.oops.static_concept;

class Student {
	String name;// instance/object var
	int roll;// instance/object var
	static String schoolName;// static variables | class level var

	
	{
		System.out.println("Block 1");
	}
	
	{
		System.out.println("Block 2");
	}
	
	
	static {
		System.out.println("Static Block 1");
	}
	
	{
		System.out.println("Block 3");
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
//		schoolName = "DAV";
		System.out.println(schoolName);
	}

	void sayMySchoolName() {//acessing  static inside not static is allowed
		System.out.println(schoolName);
	}
	
	static void sayMySchoolName2() {//acessing  a non static inside  static is NOT allowed
		System.out.println(schoolName);
//		System.out.println(name);
	}

	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

}