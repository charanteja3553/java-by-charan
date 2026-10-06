package com.logicalstatements;

public class TestLiterals {
	public static void main(String[] args) {
		int a1 = 0b1011;// 32 16 8 4 2 1
		int a2 = 0b11011101;// 128 64 32 16 8 4 2 1
//								1   1  0	 1	1 1 0 1	

		System.out.println(a1);// 11
		System.out.println(a2);// 11
	
		//Floating Literals
		//byte short int long float double 
		
				float f1 = 123;
				float f2 = 123F;
				float f3 = 123.5F;
//				float f4 = 123.5;//CE : Type mismatch: cannot convert from double to float 
				float f5 = 0123.5F;
				float f6 = 0123;
//				float f7 = 0123.5;//CE : Type mismatch: cannot convert from double to float
				float f8 = 0x123;
				float f9 = 0x123F;// a-f/A-F
//				float f10 = 0x123.5F;//Invalid hex literal number
//				float f11 =0x123.5;//Invalid hex literal number

				System.out.println(f1);// 123.0
				System.out.println(f2);// 123.0
				System.out.println(f3);// 123.5
				System.out.println(f5);// 123.5
				System.out.println(f6);// 83.0
				System.out.println(f8);// 291.0
				System.out.println(f9);// 291.0
				
	
				
//						String Literals 
						String s = "Srikanth";// String Literal storing in String Constant Pool
						System.out.println(s);

//						String Object 
						String s2 = new String("Java");//String Object storing Heap memory 
						System.out.println(s2);

//						null Literals 
						String s1 = null;
						System.out.println(s1);

//						boolean Literals : true/ false 
						boolean status = false;

						if (status) {
							System.out.println("Good morning ");
						} else {
							System.out.println("Bad Morning ");
						}

						// Char Literals
						char c1 = 'A';
						char c2 = 99;
						char c3 = '\u0040';
						char c4 = '\uabcd';

						System.out.println(c1);
						System.out.println(c2);
						System.out.println(c3);
						System.out.println(c4);// junk characters
					}

			}
		
		


