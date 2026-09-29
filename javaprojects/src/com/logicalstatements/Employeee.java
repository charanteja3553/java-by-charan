package com.logicalstatements;

class Address{
	String flat="v-353";
	String plot="353";
	String city="khansar";
	String street="dinosor";
}

public class Employeee {
	
	int eid=101;
	String ename="Deva";
	Address address=new Address();
	
	public static void main (String [] args) {
		Employeee E =new Employeee();
		
		System.out.println(E.eid);//0
		System.out.println(E.ename);//null
		System.out.println(E.address);//address of the object 
		System.out.println(E.address.flat);//address of the object 
		System.out.println(E.address.plot);//address of the object 
		System.out.println(E.address.city);//address of the object 
		System.out.println(E.address.street);//address of the object 
	}
//user defined object data type
}
