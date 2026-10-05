package com.java;

public class NativeMethod {
	
	{
		System.out.println("instance called!!");
	}

	void main(String[] args) {
		System.out.println("main method started ");
		dell();
		///welcome();
		//"main" java.lang.UnsatisfiedLinkError
		System.out.println("main method ended");
	}
	// native methods do not specify a body 
	native void welcome();// works with in jni (java native interface) & ntive method libraries

	// where java is build from c language some libraries Used for native methods (non-Java code, usually C/C++)
	void dell() {
		System.out.println("hello dell called");
	}
}
