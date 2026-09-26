package com.Methods;

public class Student2 {

	static final String collegeName = "Srikanth";

	static void hello() {
//		 local + primitive variables
		int x = 100;
		System.out.println("x value  : " + x);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		hello();

//		System.out.println("x value  : " + x);

		// The final field Student2.collegeName cannot be assigned
//		collegeName = "VSSIT";

		// local + Object variables
		String collegeName = "VSS";
//		var collegeName = 10;

		// local variables with var keyword
		var a = 10;
		var name = "sachin";
		var height = 5.9;

		System.out.println(a);
		System.out.println(name);
		System.out.println(collegeName);
		System.out.println(Student2.collegeName);

	}
// local variables capability is within the method block only  !!
}