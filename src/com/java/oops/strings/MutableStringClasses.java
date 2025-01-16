package com.java.oops.strings;

public class MutableStringClasses {

	public static void main(String[] args) {


//		StringBuilder
		StringBuilder sb = new StringBuilder("the lion king");
		sb.append(": mufasa");
		System.out.println(sb);
		sb.delete(3, 7);
		System.out.println(sb);

		
//		StringBuffer
		StringBuffer sbb = new StringBuffer("the lion king");
		sbb.append(": mufasa");
		System.out.println(sbb);
		sbb.delete(3, 7);
		System.out.println(sbb);

	}

}
