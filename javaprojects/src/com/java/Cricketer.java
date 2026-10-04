package com.java;

//WAP to Represent Only Indian Cricket Team
//Whenever the data is not changing from Object to Object then go and make sure that data as static.
//Whenever the data is changing from Object to Object then go and make sure that data as instance.
//For Every Object a new copy will be created with default values for instance data.
//For all Objects same copy will be using with recent values for static data.
//Method Area :
//	- All static related information like variables & blocks even with metadata is storing inside the Method Area
//whenever the class loading. 
//- Without Object Creating, we can load & access static related information.
//Heap Area
//	- All instance related information like instance variables & instance blocks
//are loading into the Heap area whenever we created an object.
public class Cricketer {
//	1) Declaration
//	static variables
	static int countryId = 100;
	static String countryName= "indi";
//	instance variables or Non-static variables
	int jerseyNumber = 999;
	String cricketerName = "Unknown";
	public static void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println("Welcome to Indian Cricket Team ");
		System.out.println(" ");
//		Accessing the instance data
//		Note : In static area, We cannot access the instance data directly.
//		CE : Cannot make a static reference to the non-static field jerseyNumber
//		CE : Cannot make a static reference to the non-static field cricketerName
//		If we want to access instance data in static area,
//		we must need to create an Object.
//		LHS : Cricketer is a class name & msd is a Object Reference variable
//		RHS : new is the Java keyword to create Objects & Cricketer() constructor calling.
//		Whenever a class does not contain any constructor then Java Compiler will create default constructor.
		System.out.println("Object1 info **************");
		Cricketer msd = new Cricketer();// Object Creation
//		2) Initialization
		Cricketer.countryId = 91;
		Cricketer.countryName = "India";
		msd.jerseyNumber = 7;
		msd.cricketerName = "Mahendra Singh Dhoni ";
//		3) Accessing the static data directly.
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name: " + countryName);
		System.out.println("Jersey Number : " + msd.jerseyNumber);// 0
		System.out.println("Cricketer Name : " + msd.cricketerName);// null
		System.out.println(" ");
		System.out.println("Object2 info **************");
		Cricketer vk = new Cricketer();// Object Creation
		vk.jerseyNumber = 18;
		vk.cricketerName = "Virat Kohli";
		System.out.println("Country ID : " + countryId);// 91
		System.out.println("Country Name: " + countryName);// India
		System.out.println("Jersey Number : " + vk.jerseyNumber);// 0
		System.out.println("Cricketer Name : " + vk.cricketerName);// null
		System.out.println(" ");
		System.out.println("Object3 info **************");
		Cricketer hitman = new Cricketer();// Object Creation
		hitman.jerseyNumber = 45;
		hitman.cricketerName = "Rohit Sharma";
		System.out.println("Country ID : " + countryId);// 91
		System.out.println("Country Name: " + countryName);// India
		System.out.println("Jersey Number : " + hitman.jerseyNumber);// 0
		System.out.println("Cricketer Name : " + hitman.cricketerName);// null
		System.out.println(" ");
		System.out.println("Object4 info **************");
		Cricketer kl = new Cricketer();// Object Creation
		kl.jerseyNumber = 1;
		kl.cricketerName = "K Lokesh Rahul";
		System.out.println("Country ID : " + countryId);// 91
		System.out.println("Country Name: " + countryName);// India
		System.out.println("Jersey Number : " + kl.jerseyNumber);// 0
		System.out.println("Cricketer Name : " + kl.cricketerName);// null
		System.out.println(" ");
		System.out.println("Object5 info **************");
		Cricketer vs = new Cricketer();// Object Creation
		vs.jerseyNumber = 3;
		vs.cricketerName = "Vaibhav SooryaVanshi";
		countryId = 92;
		countryName = "Bharath";
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name: " + countryName);
		System.out.println("Jersey Number : " + vs.jerseyNumber);
		System.out.println("Cricketer Name : " + vs.cricketerName);
		System.out.println(" ");
		System.out.println("Object6 info **************");
		Cricketer gill = new Cricketer();// Object Creation
		
		gill.countryId = 999;
		gill.countryName = "Sindhoor";
		gill.jerseyNumber = 77;
		gill.cricketerName = "Shubhman Gill";
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name: " + countryName);
		System.out.println("Jersey Number : " + gill.jerseyNumber);
		System.out.println("Cricketer Name : " + gill.cricketerName);
		System.out.println(" ");
		
		
		System.out.println("Object7 info **************");
		Cricketer sri = new Cricketer();// Object Creation
		System.out.println("Country ID : " + countryId);
		System.out.println("Country Name: " + countryName);
		System.out.println("Jersey Number : " + sri.jerseyNumber);
		System.out.println("Cricketer Name : " + sri.cricketerName);
		System.out.println("main method ended ");
	}
}
