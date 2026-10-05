package com.java;

import java.util.Scanner;

public class Ternaryoperators {

	public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a number: ");
 int num=sc.nextInt();
 String result=(num>=0?"Positive":"Negative");
 System.out.println(result);
 System.out.println("Enter a number: ");
 int A=sc.nextInt();
 String marks =(A>=90)?"A Marks":(A>=75)?"B Marks":(A>=60)?"C Marks":(A>=40)?"D Marks":"fail";
 System.out.println("Marks:"+marks);
	}

}
