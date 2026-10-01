package com.constructor;

class BankAccount {

    long accountNumber;
    String customerName;
    String accountType;
    double balance;

    BankAccount(long accountNumber, String customerName,
                String accountType, double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount b1 =
            new BankAccount(10101, "Rahul", "Savings", 25000);

        BankAccount b2 =
            new BankAccount(20202, "Arun", "Current", 50000);

        b1.display();
        b2.display();
    }
}