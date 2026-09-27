package com.Methods;

import java.util.Scanner;

public class Method7 {
	

	//Method with return type + with parameters 
	//WAP tiny POC related to Bank Account Transactions...


		double balance = 100000.00;

		void main() {
			System.out.println("main method started ");
			System.out.println("Welcome to Vcube Banking !!");

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter How much you want to Deposite : ");
			double dp = sc.nextDouble();
			balance = deposite(dp);
			System.out.println("AFter Depoiste your current balance is : " + balance);

			System.out.println("Enter how much you want to Withdraw :");
			double wa = sc.nextDouble();
			withdraw(wa);
			System.out.println("After Withdraw your current balance is : " + balance);

//			checkBalance();
			System.out.println("main method ended ");
		}

		double withdraw(double wAmount) {

			if (wAmount <= balance) {
				balance = balance - wAmount;
			} else {
				System.out.println("In SUfficient Balance : ");
			}
//			checkBalance();
			return balance;
			
		}

		double deposite(double dAmount) {

			if (dAmount >= 1) {
				balance = balance + dAmount;
			} else {
				System.out.println("Currently we are not accepting this much big amounts ");
			}

			return balance;

		}

		void checkBalance() {
			System.out.println("your current balance is : " + balance);
			System.out.println("Thanks for Visiting !");
		}

	}