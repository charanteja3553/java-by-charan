package com.Methods;

public class Student3 {
	
 static int count=0;
 
 Student3(){
	 count++;
 }
	public static void main(String[] args) {

		Student3 s = new Student3();
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		Student3 s3 = new Student3();
		
		System.out.println("Count the objects in prgoram :"+count);

	}

}
