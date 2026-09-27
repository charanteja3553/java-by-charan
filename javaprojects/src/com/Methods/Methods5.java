package com.Methods;

import java.util.Scanner;

public class Methods5 {

	// 3) Method with return type + no parameters
	// WAP to print the Total Salary of the Employee ..?

	Scanner sc = new Scanner(System.in);

	{
		System.out.println("Hello instance ");
	}

	void main() {
		System.out.println("main  method started ");

		Methods5 t = new Methods5();

		double basic = basicSalary();
		double hra = hra();
		double lta = lta();
		double spa = specialAllowance();
		double mea = mealAllownances();
		double pf = pf();
		double gt = gratuity();

		System.out.println("Total Fixed Compensation : " + (basic + hra + lta + spa + mea + pf + gt));
		System.out.println("main  method ended ");
	}

	double basicSalary() {
		double bs = 0;
		System.out.println("Enter your Basic Salary : ");
		bs = sc.nextDouble();
		return bs;

	}

	double hra() {
		System.out.println("Enter HRA : ");
		double hra = sc.nextDouble();
		return hra;
	}

	double lta() {
		System.out.println("Enter LTA : ");
		return sc.nextDouble();
	}

	double specialAllowance() {
		System.out.println("ENter Special Allowance");
		double sa = sc.nextDouble();
		return sa;
	}

	double mealAllownances() {
		System.out.println("Enter your Meal Allowances ");
		double ma = sc.nextDouble();
		return ma;
	}

	double pf() {
		System.out.println("ENter your PF : ");
		double pf = sc.nextDouble();
		return pf;
	}

	double gratuity() {
		System.out.println("Enter your Gratuity");
		double gt = sc.nextDouble();
		return gt;
	}

}