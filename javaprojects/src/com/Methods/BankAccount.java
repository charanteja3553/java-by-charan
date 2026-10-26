package com.Methods;

public class BankAccount {

    static int balance = 1500;

    static void deposit(int amount) {
        balance = balance + amount;
        System.out.println(BankAccount.balance);

    }


    static void withdraw(int amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {

    	System.out.println(BankAccount.balance);

        deposit(5000);
        withdraw(3000);
        System.out.println(BankAccount.balance);

        System.out.println("Final Balance: " + balance);
    }
}