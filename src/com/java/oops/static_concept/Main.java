package com.java.oops.static_concept;

public class Main {

	public static void main(String[] args) {
		
		Student.sayMySchoolName2();
		
		System.out.println(Student.schoolName);
		
		Student.schoolName = "Denobili";
		System.out.println(Student.schoolName);
//	
		Student st1 = new Student("John", 1);
		System.out.println(st1);
		System.out.println(st1.schoolName);	
//		
		Student.schoolName = "Denobili";
		System.out.println(Student.schoolName);
		System.out.println(st1.schoolName);

		
		Student st2 = new Student("Jim", 5);
		System.out.println(st2);
		st2.schoolName = "DPS";
//		
//		
		System.out.println(st2.schoolName);//DPS
		System.out.println(st1.schoolName);//DAV DPS

	}

}
