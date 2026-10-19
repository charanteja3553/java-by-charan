package operators;

import java.util.Scanner;

public class EVBatterySimulator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter initial battery percentage: ");
		double battery = sc.nextDouble();

		System.out.print("Enter charging percentage: ");
		double charging = sc.nextDouble();

		System.out.print("Enter driving consumption: ");
		double consumption = sc.nextDouble();

		if (battery < 0 || battery > 100 || charging < 0 || consumption < 0) {
			System.out.println("Invalid input.");
		} else {

			battery = battery + 0; // Assignment (=)
			battery += charging; // Add charge
			battery -= consumption; // Consume energy
			battery *= 0.95; // Apply 5% efficiency adjustment
			battery /= 2; // Calculate half of adjusted charge

			int wholeBattery = (int) battery;
			wholeBattery %= 10; // Remainder after division by 10

			System.out.println("\n===== BATTERY REPORT =====");
			System.out.println("Calculated battery value: " + battery + "%");
			System.out.println("Remainder after grouping by 10: " + wholeBattery + "%");

			if (battery >= 20) {
				System.out.println("Battery status: Sufficient");
			} else {
				System.out.println("Battery status: Low");
			}
		}

		sc.close();
	}
}
