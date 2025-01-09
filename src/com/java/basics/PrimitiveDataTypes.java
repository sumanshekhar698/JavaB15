package com.java.basics;

//C3 the class name should be in PascalCase
public class PrimitiveDataTypes {

	public static void main(String[] args) {

//		1. INTEGERS :: 2s complement

//		-2 ^ (n-1)  <------> 0  <-----> 2 ^ (n-1) - 1 
		byte a = 9;// 1 byte = 8 bits
		short b = 78;// 2 bytes = 16 bits
		int c = 786;// 4 bytes = 32 bits
		long d = 8979;// 8 bytes = 64 bits

		a = 127;

//		phone number ?
		long phoneNumber = 9006567388L;
		phoneNumber = 7992256123L;

		int a7sd = 0;
//		R3 : var name should not start with numbners
//		_ $
		int valueOfADozen = 12;// C2 the variable name, fn/method should be in camelCase

//		2. DECIMALS/FLOATING POINTS  :: IEEE algorithm
		float valueOfAPie = 3.14f;// 4 bytes
		double valueOfAPieAccurated = 3.14159;// 8 bytes

		d = b;
		System.out.println(d);

		float flt = 423.354f;

		flt = phoneNumber;// 7992256123
		System.out.println(flt);// 7.992256E9 = 7.992256 * 10^9 = 7992256000
		
		double phone = phoneNumber;// 7992256123
		System.out.println(phone);// 7.992256123E9 = 7.992256123 * 10^9 = 7992256123

//		3. boolean
		boolean isJavaEasy = false;// 1 bit
		isJavaEasy = true;

//		4. characters
		char ch = 'D';// 256 characters ASCII characters
//		UTF 16
		System.out.println((int) ch);// typecasting

		char rupeeSymbol = '₹';
		System.out.println((int) rupeeSymbol);// typecasting

		char randomSymbol = (char) 79879;
		System.out.println(randomSymbol);
		
//		Number System : 
//		Decimal System (0 - 9) Base 10
//		Binary System (0,1)  Base 2
//		Octal System (0 - 7) Base 8
//		Hexadecimal System (0 - 9  + A - F) Base 16
		
		int base8 = 0101010106;//Octal 101010106 ---> decimal 17043526
		System.out.println(base8);//printing is always in decimal format
		
		int base2 = 0b10101;// Binary 0b10101 ---> decimal 21
		System.out.println(base2);//printing is always in decimal format
		
		int base16 = 0x101018FA;//Hex 101018FA ---> decimal 269490426
		System.out.println(base16);//printing is always in decimal format

		
		
	}

}
