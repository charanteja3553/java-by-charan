package com.constructor;

class DigitalWallet {

    String owner;
    double balance;

    DigitalWallet() {
        this("Guest", 0);
    }

    DigitalWallet(String owner) {
        this(owner, 1000);
    }

    DigitalWallet(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        DigitalWallet w =
                new DigitalWallet("Charan", 5000);

        w.deposit(1500);
        w.withdraw(2000);
        w.displayBalance();
    }
}