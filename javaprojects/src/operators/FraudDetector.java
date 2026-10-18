package operators;

import java.util.Scanner;

public class FraudDetector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double balance = 50000;
		double dailySpent = 0;
		int suspiciousAttempts = 0;

		System.out.println("===== SMART FRAUD DETECTOR =====");

		System.out.print("Enter transaction amount: ");
		double amount = sc.nextDouble();

		System.out.print("Enter daily spending limit: ");
		double dailyLimit = sc.nextDouble();

		System.out.print("Enter OTP verified? (true/false): ");
		boolean otpVerified = sc.nextBoolean();

		System.out.print("Enter unknown device? (true/false): ");
		boolean unknownDevice = sc.nextBoolean();

		boolean validAmount = amount > 0;
		boolean validLimit = dailyLimit > 0;

		boolean suspicious = amount >= 20000 || unknownDevice || !otpVerified;

		if (!validAmount || !validLimit) {
			System.out.println("Invalid transaction details.");

		} else if (suspicious && amount >= 10000) {

			suspiciousAttempts++;
			System.out.println("ALERT: Transaction flagged for review.");

		} else if (amount <= balance && dailySpent + amount <= dailyLimit && otpVerified) {

			balance -= amount;
			dailySpent += amount;

			System.out.println("Transaction approved.");

		} else {

			System.out.println("Transaction declined.");
		}

		System.out.println("\n===== TRANSACTION REPORT =====");
		System.out.println("Remaining Balance: Rs. " + balance);
		System.out.println("Daily Spending: Rs. " + dailySpent);
		System.out.println("Suspicious Attempts: " + suspiciousAttempts);

		if (balance == 0) {
			System.out.println("Balance status: Empty");
		} else if (balance < 1000) {
			System.out.println("Balance status: Low");
		} else {
			System.out.println("Balance status: Normal");
		}

		sc.close();
	}
}