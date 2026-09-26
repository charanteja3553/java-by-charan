package com.Methods;

public class Student {
	
	int id;
	String Studentname;
	
	Student(){// no-arg constructor
		System.out.println("Constructor called");
		
		Studentname="Ramesh";
	}

	Student (int a, int b){// parameterized constructor
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	
	}

	public static void main(String[] args) {
// default constructor created by java compiler 
		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.Studentname);
		
		Student s1= new Student(20,500);
	
	}

}
