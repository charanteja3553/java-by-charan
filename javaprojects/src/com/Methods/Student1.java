package com.Methods;

public class Student1 {

	// Object + static variables
	static String collegeName = "VSS";

	// Primitive + static variables
	static int collegeId = 555;

	// int + instance variables
	int roll_number;

	// String + instance variables
	String name;

	public static void main(String[] args) {
		System.out.println("main method started from student1  ");
		Student1 s1 = new Student1();

		System.out.println(Student1.collegeName);

		int x;// declaration is not a problem !!
//			The local variable x may not have been initialized
//			JVM, Will not provide default values for local variables.
//			We can consider local variables are temporary variables.
//			System.out.println(x);//CE: but accessing without a value is the problem

		int a;
		a = 100;

//			Local variables, we can access directly !!
//			We cannot access by using class or Object reference variables.
//			if we use static for local variables : Illegal modifier for parameter a; only final is permitted
//			The only applicable modifier for local variables is final keyword.
		System.out.println(a);

		int b = 200;
		System.out.println(b);

		System.out.println("Accessing static data directly within the class");
		System.out.println(collegeName);
		System.out.println(collegeId);
		System.out.println("**************************************");
		System.out.println("Accessing static data using the class name");
		System.out.println(Student1.collegeId);
		System.out.println(Student1.collegeName);

//			The static field Student1.collegeId should be accessed in a static way
		System.out.println("Äccessing the static data by using object reference variable also");
		System.out.println(s1.collegeId);
		System.out.println(s1.collegeName);

//			Even though s2 is null, we can able to access static data, 
//			that means there is no impact with object reference variables.
//			so compiler is Giving warning and saying static data should access in a static way.
		Student1 s2 = null;
		s2.collegeId = 666;
		s2.collegeName = "Vcube";
		System.out.println(s2.collegeId);
		System.out.println(s2.collegeName);

//			null dot any operation is NPE.
//			System.out.println(s2.roll_number);//NullPointerException

		s1.roll_number = 123;
		s1.name = "Srikanth";
		System.out.println("Äccessing instance data, by using Object Reference variables !!");
		System.out.println(s1.roll_number);
		System.out.println(s1.name);

	}

}
