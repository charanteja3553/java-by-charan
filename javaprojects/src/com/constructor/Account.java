
package com.constructor;

public class Account {

	String accountHolder;
	double balance;

	public Account(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;

		System.out.println("Account constructor called");
	}

	public void displayAccount() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
}
