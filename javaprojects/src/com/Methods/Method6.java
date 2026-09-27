package com.Methods;

public class Method6 {
	//3) Method with return type + no parameters
	// byte --> short --> int --> long --> float --> double 
	//int --> char --> int 


		{
			System.out.println("Hello instance ");
		}

		void main() {

			System.out.println("main method started ");

			double total = add();
			System.out.println(total);
			System.out.println(hello());
			System.out.println(hi());

			int a = 'B';// char --> int
			System.out.println(a);

			char c = 98;// int --> char
			System.out.println(c);

			System.out.println("main method ended ");

		}

		int add() {
			int a = 100;
			int b = 500;
			double sum = a + b;
			return (int) sum;
//			System.out.println(sum);/Unreachable code
		}

		char hi() {
			return (char) 65536;
		}

		int hello() {
			return 'D';
		}

	}