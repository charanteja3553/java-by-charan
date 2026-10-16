package operators;

import java.util.Scanner;

public class SmartBankingAnalyzer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double balance = 10000;
		double dailyLimit = 20000;
		double totalWithdrawn = 0;
		double fee = 10;

		System.out.println("===== SMART BANKING SYSTEM =====");

		System.out.print("Enter transaction amount: ");
		double amount = sc.nextDouble();

		System.out.print("Choose transaction (1=Deposit, 2=Withdraw): ");
		int choice = sc.nextInt();

		// Relational operators
		boolean validAmount = amount > 0;
		boolean validChoice = choice == 1 || choice == 2;

		// Logical operators
		if (validAmount && validChoice) {

			if (choice == 1) {

				// Assignment operator
				balance += amount;

				System.out.println("Deposit successful.");

			} else {

				// Relational + logical operators
				boolean sufficientBalance = amount <= balance;
				boolean withinLimit = totalWithdrawn + amount <= dailyLimit;

				if (sufficientBalance && withinLimit) {

					// Arithmetic + assignment operators
					double totalDebit = amount + fee;

					if (totalDebit <= balance) {
						balance -= totalDebit;
						totalWithdrawn += amount;

						System.out.println("Withdrawal successful.");
						System.out.println("Transaction fee: Rs. " + fee);
					} else {
						System.out.println("Insufficient balance for fee.");
					}

				} else if (!sufficientBalance) {

					System.out.println("Insufficient balance.");

				} else {

					System.out.println("Daily withdrawal limit exceeded.");
				}
			}

		} else {

			System.out.println("Invalid amount or transaction choice.");
		}

		// More relational operators
		System.out.println("\n===== ACCOUNT SUMMARY =====");
		System.out.println("Current balance: Rs. " + balance);

		if (balance >= 5000) {
			System.out.println("Account status: Healthy balance");
		} else if (balance < 5000 && balance > 0) {
			System.out.println("Account status: Low balance");
		} else if (balance == 0) {
			System.out.println("Account status: Zero balance");
		} else if (balance < 0) {
			System.out.println("Account status: Overdrawn");
		}

		// Modulus operator
		System.out.println("Balance remainder after division by 100: " + ((long) balance % 100));

		sc.close();
	}
}
