package com.java;


public class Employe {
	
	protected void finalize() {
		System.out.println(" main method called ");
	}

public static void main(String[] args) {

System.out.println("main method started ");

Employe e1 = new Employe();

//com.javaintro. Employee@1dbd16a6

System.out.println(e1);//com.javaintro. Employee@Hexa-DecimalValue --> Address of the ob

int objValue = 0X1dbd16a6;



System.out.println(objValue); // hashCode --> 498931366

System.out.println(e1.hashCode());// 498931366


Employe e2 = new Employe();

System.out.println(e2);//com[javaintro. Employee@7ad041f3


e1 = null;

System.gc();
}
}