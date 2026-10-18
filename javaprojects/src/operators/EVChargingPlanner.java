package operators;

import java.util.Scanner;

public class EVChargingPlanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter battery capacity (kWh): ");
		double capacity = sc.nextDouble();

		System.out.print("Enter current charge (%): ");
		double charge = sc.nextDouble();

		System.out.print("Enter target charge (%): ");
		double target = sc.nextDouble();

		System.out.print("Enter electricity price per kWh: ");
		double rate = sc.nextDouble();

		System.out.print("Enter range per kWh (km): ");
		double efficiency = sc.nextDouble();

		boolean valid = capacity > 0 && charge >= 0 && charge <= 100 && target >= charge && target <= 100 && rate >= 0
				&& efficiency > 0;

		if (!valid) {
			System.out.println("Invalid charging details.");
		} else {

			double energy = capacity * (target - charge) / 100;

			double cost = energy * rate;
			cost += cost * 0.05; // Illustrative 5% service charge

			double estimatedRange = capacity * target / 100;
			estimatedRange *= efficiency;

			System.out.println("Energy required: " + energy + " kWh");
			System.out.println("Estimated charging cost: Rs. " + cost);
			System.out.println("Estimated range at target charge: " + estimatedRange + " km");

			if (target == 100) {
				System.out.println("Target: Full charge");
			} else if (target >= 80) {
				System.out.println("Target: High charge");
			} else {
				System.out.println("Target: Partial charge");
			}
		}

		sc.close();
	}
}
