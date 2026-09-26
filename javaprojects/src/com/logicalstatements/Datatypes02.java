package com.logicalstatements;

import java.math.BigInteger;
import java.math.BigDecimal;

// == operator checks the value if the data is Primitive types.
// == Operator checks the address if the data is object types.
class Dog {

	String name;

	Dog(String name) {
		this.name = name;
	}

}

class Cat {

}

public class Datatypes02 {

	String str = "Ganesh";
	// String is a collection of Characters store it into a double quotes.
	String str1 = new String();// string object
	// String literals
	String str2 = new String("Charan");// string object

	// the below object is created with the help of default constructor provided by
	// java compiler
	// whenever your class does not contain any other constructors then only java
	// compiler will create a default constructor
	/// Datatypes02 d2=new Datatypes02();

	// BigInteger bi =100;
	// Type mismatch: cannot convert from int to BigInteger
	// BigInteger bi =new BigInteger();
	// The constructor BigInteger() is undefined

	BigInteger bi1 = new BigInteger("467269689266575850236");
	BigInteger bi2 = new BigInteger("46726926657585023456778836");
	BigDecimal bd;

	// converting primitive data types values to wrapper object data types will
	// consider as auto boxing
	Integer in = 100;
	// int --> Integer -->Auto Boxing
	// Internally it works with valueof()method Integer class.
	// Integer in1=Integer.valueof(100);

	// converting wrapper object data type value into primitive data types will
	// consider as auto un boxing
	int a = in;

	// Internally it works with intValue()or byteValue()
	// int Aa1 =in.inValue();

	// The constructor integer(String) is deprecated since version 9
	Integer D2 = new Integer("24689292");

	Float f = 5.9F;
	Character ch = 'c';
	Boolean boo = true;

	Dog d = new Dog("Puppy");
	Cat c;

	public static void main(String[] args) {

		System.out.println(" MAIN METHOD STARTED !! ");

		// -128 to 127---> Internally its taking the same address
		// if the values are more than 127 then for every value its creating new object
		// will consider as Wrapper Caching

		int i5 = 200;
		int i6 = 200;
		System.out.println(i5 == i6);

		byte a = 10;
		byte b = (byte) (a + 120);

		byte c = 10 + 20;
		byte d = 128 - 20;

		Integer i1 = 100;
		System.out.println(System.identityHashCode(i1));
		Integer i2 = 100;
		System.out.println(System.identityHashCode(i2));
		System.out.println(i1 == i2);// true

		Integer i3 = 200;
		System.out.println(System.identityHashCode(i3));
		Integer i4 = 200;
		System.out.println(System.identityHashCode(i4));
		System.out.println(i3 == i4);// false
		System.out.println("**********");

		Datatypes02 D2 = new Datatypes02();

		System.out.println(D2.str);

		/// System.out.println(D2.bi1+D2.bi2);
		// The operator + is undefined for the argument type(s) java.math.BigInteger,
		// java.math.BigInteger
		// this works in literals and strings but not works with objects
		// objects objects works string string also works

		System.out.println(D2.bi1);
		System.out.println(D2.bi2);

		System.out.println(D2.bi1.add(D2.bi2));
		System.out.println(D2.bi1.multiply(D2.bi2));
		System.out.println(D2.str);
		System.out.println(D2.bi1);
		System.out.println(D2.bd);
		System.out.println(D2.in);
		System.out.println(D2.f);
		System.out.println(D2.ch);
		System.out.println(D2.boo);

		System.out.println(D2.d);
		System.out.println(D2.c);

		System.out.println(" MAIN METHOD ENDED !! ");
	}
	// object data types codee

}
