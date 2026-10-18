package operators;

import java.util.Scanner;

public class DataCenterOptimizer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter server count: ");
		int servers = sc.nextInt();

		System.out.print("Power per server (watts): ");
		double watts = sc.nextDouble();

		System.out.print("Daily running hours: ");
		double hours = sc.nextDouble();

		System.out.print("Electricity cost per kWh: ");
		double rate = sc.nextDouble();

		System.out.print("CPU utilization (%): ");
		double cpu = sc.nextDouble();

		boolean valid = servers > 0 && watts > 0 && hours > 0 && hours <= 24 && rate >= 0 && cpu >= 0 && cpu <= 100;

		if (!valid) {
			System.out.println("Invalid server configuration.");

		} else {

			double energy = servers * watts / 1000;
			energy *= hours;

			double dailyCost = energy * rate;
			double monthlyCost = dailyCost * 30;

			System.out.println("Daily energy: " + energy + " kWh");
			System.out.println("Daily cost: Rs. " + dailyCost);
			System.out.println("Monthly cost: Rs. " + monthlyCost);

			if (cpu >= 90 && hours >= 20) {
				System.out.println("Alert: High CPU and long runtime.");
			} else if (cpu < 20 && servers > 5) {
				System.out.println("Recommendation: Review idle servers.");
			} else {
				System.out.println("Server operation appears normal.");
			}

			double unusedCapacity = 100 - cpu;
			unusedCapacity /= 100;

			System.out.println("Unused CPU fraction: " + unusedCapacity);
		}

		sc.close();
	}
}