package operators;

import java.util.Scanner;

public class ATMGuard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pin = 2580;
		int attempts = 0;
		double balance = 25000;
		double dailyLimit = 15000;
		double withdrawn = 0;

		boolean locked = false;

		while (attempts < 3 && !locked) {

			System.out.print("Enter PIN: ");
			int enteredPin = sc.nextInt();

			if (enteredPin == pin) {

				System.out.print("Enter withdrawal amount: ");
				double amount = sc.nextDouble();

				System.out.print("Suspicious device? (true/false): ");
				boolean suspicious = sc.nextBoolean();

				boolean valid = amount > 0 && amount <= balance && withdrawn + amount <= dailyLimit;

				if (valid && !suspicious) {

					balance -= amount;
					withdrawn += amount;

					System.out.println("Withdrawal successful.");
					System.out.println("Balance: " + balance);

				} else if (suspicious || amount > balance) {

					System.out.println("Transaction blocked.");

				} else {

					System.out.println("Daily limit exceeded.");
				}

				break;

			} else {

				attempts++;
				System.out.println("Incorrect PIN. Attempts: " + attempts);
			}
		}

		if (attempts >= 3) {
			locked = true;
		}

		if (locked) {
			System.out.println("ATM session locked.");
		}

		System.out.println("Remaining balance: Rs. " + balance);
		System.out.println("Daily withdrawal remainder: " + ((int) withdrawn % 1000));

		sc.close();
	}
}