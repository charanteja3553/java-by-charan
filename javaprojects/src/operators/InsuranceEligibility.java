package operators;

import java.util.Scanner;

public class InsuranceEligibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		System.out.print("Enter monthly income: ");
		double income = sc.nextDouble();

		System.out.print("Enter health score (0-100): ");
		int healthScore = sc.nextInt();

		double premium = 2000;
		boolean valid = age > 0 && income >= 0 && healthScore >= 0 && healthScore <= 100;

		if (!valid) {
			System.out.println("Invalid input.");
		} else if (age >= 18 && age <= 60 && income >= 20000 && healthScore >= 50) {

			premium *= 1.2;

			if (age >= 40) {
				premium += 500;
			}

			System.out.println("Insurance eligible.");
			System.out.println("Estimated premium: Rs. " + premium);

		} else {
			System.out.println("Standard policy eligibility not met.");
		}

		sc.close();
	}
}
