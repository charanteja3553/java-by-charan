package com.logicalstatements;

public class Datatypes04 {

	public static void main(String[] args) {
		System.out.println("main method started !");

//		Decimal Literals : Base is 10 : 0 to 9  
		int a1 = 100;
		int a2 = 200;
		int a3 = 123;
		
//		Whenever the number starts with 0 will consider as Octal.
//		Octal Literals : Base is 8 : 0 to 7 
//		0 + 1*8^2 +2*8^1 +3*8^0  = 64 + 16 + 3 = 83 
		int a4 = 0123;
		
		int a5 = 0345;//229
		int a6 = 0675;//423
//		int a7 = 0286;//198/The literal 0286 of type int is out of range
		
//		Whenever the number starts with 0x will consider as Hexa-Decimal Literal.
//		Hexa-Decomal Literals : The Base 16 : 0 to 9 and a-f ot A-F 
//		a/A=10,b/B=11.....f/F =15 
		
//		1*16^2 +2*16^1 +3*16^0  = 256 +32+3 = 291 
		int a7 = 0X123;
		int a8 =0x1a2b;
		int a9 = 0XDAD;
		int a10 = 0xbEe;
//		int a11 = 0XBeer;//Syntax error on token "r", delete this token
		
//		Binary Literals 
//		0b or OB ---> 2 --> 0 1 

		System.out.println(a1);// 100
		System.out.println(a2);// 200
		System.out.println(a3);// 123
		System.out.println(a4);//83
		System.out.println(a5);//229
		System.out.println(a6);//445
		System.out.println(a7);
	}

}
