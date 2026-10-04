package com.java;

public class Garbage {

	public static void main(String[] args) {

		System.out.println("Main method started !");
		
		Garbage G1=new Garbage();
		System.out.println(G1);//com.java.Garbage@27716f4  @Hexa decimal value ---.> address of the object 
	//
		int objValue = 0x27716f4;
	
		System.out.println(objValue);// hachCode ...>41359092
		System.out.println(G1.hashCode());///41359092  proof for hashcode for object
		
		// NUllifing the object after using and completeing use of reference variable you shd do 
		G1=null;
		
		/// actually the jvm calls the garabage collector but if in case you want to call the gc then 
		System.gc();
		
	}// hashcode means  every uniqe value for object is hashcode 41359092

}
