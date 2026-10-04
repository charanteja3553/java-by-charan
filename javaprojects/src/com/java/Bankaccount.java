package com.java;

public class Bankaccount {

    String accountHolder;
    long accountNumber;
    double balance;

    Bankaccount() {
        this("Unknown");
    }
    
    Bankaccount(String AccountHolder) {
        this(AccountHolder, 0);
    }

    Bankaccount(String accountHolder, long AccountNumber) {
        this(accountHolder, AccountNumber, 0.0);
    }

    Bankaccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        Bankaccount b1 = new Bankaccount();

        Bankaccount b2 = new Bankaccount("Krishna");

        Bankaccount b3 = new Bankaccount("Krishna", 1234567890L);

        Bankaccount b4 = new Bankaccount("Krishna", 1234567890L, 50000.0);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }


	}


