package com.java;

public class Coustomer {

	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize method called");
	}

	void helo() {
		System.out.println("hello");
	}
	public static void main(String[] args) {

		System.out.println("Main method started");

		Coustomer c1 = new Coustomer();
		Coustomer c2 = new Coustomer();
		Coustomer c3 = new Coustomer();
		Coustomer c4 = new Coustomer();
		// 10) Nullifying the object
		c1 = null;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.gc();
		//2) re-assigining the object
		Coustomer c5= new Coustomer();
		System.out.println(c5);
		c5=c3;
		System.gc();
		
		//3) anonymous object 
		new Coustomer().helo();
		System.gc();
		System.out.println("after***********");
	
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		// 4) out of scope or object inside a method 
		c3.helo();
		System.gc();
System.out.println("after***********");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("Main method ended");

	}

}
