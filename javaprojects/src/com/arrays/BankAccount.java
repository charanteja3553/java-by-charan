package com.arrays;

import java.util.Scanner;

public class BankAccount {

    private int balance = 5000;

    private void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(int amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }

        showBalance();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount obj = new BankAccount();

        System.out.println("Enter Deposit Amount");
        int amount = sc.nextInt();

        obj.deposit(amount);

        sc.close();
    }
}