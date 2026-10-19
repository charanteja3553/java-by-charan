package operators;

import java.util.Scanner;

public class EWasteRewardEngine {

	private final String customerName;
	private final String deviceType;
	private final int quantity;
	private final double weightKg;
	private int rewardPoints;

	// No-argument constructor
	public EWasteRewardEngine() {
		this("Guest", "Phone", 1, 1.0);
	}

	// Overloaded constructor
	public EWasteRewardEngine(String name, String type, int quantity) {
		this(name, type, quantity, quantity * 0.5);
	}

	// Parameterized constructor
	public EWasteRewardEngine(String name, String type, int quantity, double weightKg) {
		this.customerName = name;
		this.deviceType = type;
		this.quantity = quantity;
		this.weightKg = weightKg;
		this.rewardPoints = 0;
	}

	private int pointsPerDevice() {
		if (deviceType.equalsIgnoreCase("Laptop")) {
			return 100;
		} else if (deviceType.equalsIgnoreCase("Phone")) {
			return 50;
		} else if (deviceType.equalsIgnoreCase("Battery")) {
			return 20;
		}
		return 10;
	}

	public double calculateReward() {
		return quantity * pointsPerDevice();
	}

	public double estimateCarbonSaving() {
		return weightKg * 2.5;
	}

	public void generateReport() {
		rewardPoints = (int) calculateReward();

		System.out.println("\n--- E-WASTE REPORT ---");
		System.out.println("Customer: " + customerName);
		System.out.println("Device: " + deviceType);
		System.out.println("Quantity: " + quantity);
		System.out.println("Reward points: " + rewardPoints);
		System.out.println("Estimated carbon saving: " + estimateCarbonSaving() + " kg");

		boolean eligible = quantity > 0 && weightKg > 0;

		System.out.println(eligible ? "Status: Eligible for recycling" : "Status: Invalid submission");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Customer name: ");
		String name = sc.nextLine();

		System.out.print("Device type (Phone/Laptop/Battery): ");
		String type = sc.nextLine();

		System.out.print("Quantity: ");
		int quantity = sc.nextInt();

		System.out.print("Total weight in kg: ");
		double weight = sc.nextDouble();

		if (quantity <= 0 || weight <= 0) {
			System.out.println("Quantity and weight must be positive.");
		} else {
			EWasteRewardEngine engine = new EWasteRewardEngine(name, type, quantity, weight);
			engine.generateReport();
		}

		sc.close();
	}
}