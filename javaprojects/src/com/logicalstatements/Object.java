package com.logicalstatements;

public class Object {

	static void staticmethod1() {
		System.out.println("STATIC METHOD 1 CALLED !! ");
	}

	static void staticmethod2() {
		staticmethod1();
		System.out.println("STATIC METHOD 2 CALLED !! ");
	}

	void instancemethod1() {
        staticmethod2();
		System.out.println("INSTANCE METHOD 1 CALLED !! ");
	}

	void instancemethod2() {
		instancemethod1();
		System.out.println("INSTANACE METHOD 2 CALLED !! ");
	}

	static {
		Object o1 = new Object();
		o1.instancemethod2();
	}

	public static void main(String[] args) {

		System.out.println("Main method started !! ");
	}

}
