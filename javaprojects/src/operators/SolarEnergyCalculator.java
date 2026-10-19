package operators;

import java.util.Scanner;

public class SolarEnergyCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter daily solar generation (kWh): ");
		double generation = sc.nextDouble();

		System.out.print("Enter daily consumption (kWh): ");
		double consumption = sc.nextDouble();

		System.out.print("Enter number of days: ");
		int days = sc.nextInt();

		if (generation < 0 || consumption < 0 || days <= 0) {
			System.out.println("Invalid input.");
		} else {

			double totalGenerated = generation * days;
			double totalConsumed = consumption * days;
			double balance = totalGenerated - totalConsumed;
			double average = totalGenerated / days;
			int wholeEnergy = (int) totalGenerated;
			int remainder = wholeEnergy % days;

			System.out.println("\n===== SOLAR ENERGY REPORT =====");
			System.out.println("Total Generated: " + totalGenerated);
			System.out.println("Total Consumed: " + totalConsumed);
			System.out.println("Energy Difference: " + balance);
			System.out.println("Average Generation: " + average);
			System.out.println("Division Remainder: " + remainder);

			System.out.println("Total energy generated and consumed " + "are measured in kWh.");
		}

		sc.close();
	}
}
