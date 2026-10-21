package operators;

import java.util.Scanner;

abstract class Drone {

	protected final String droneId;
	protected double battery;
	protected final double distance;
	protected final double baseCost;

	public Drone(String id, double battery, double distance, double baseCost) {
		this.droneId = id;
		this.battery = battery;
		this.distance = distance;
		this.baseCost = baseCost;
	}

	public boolean isMissionReady() {
		return battery >= distance * 2 && distance > 0 && battery <= 100;
	}

	public abstract double calculateMissionCost();

	public void displayMission() {
		System.out.println("Drone ID: " + droneId);
		System.out.println("Battery: " + battery + "%");
		System.out.println("Distance: " + distance + " km");
		System.out.println("Mission status: " + (isMissionReady() ? "READY" : "NOT READY"));
		System.out.println("Mission cost: Rs. " + calculateMissionCost());
	}
}

class CargoDrone extends Drone {

	private final double payloadKg;

	public CargoDrone(String id, double battery, double distance, double baseCost, double payloadKg) {
		super(id, battery, distance, baseCost);
		this.payloadKg = payloadKg;
	}

	@Override
	public boolean isMissionReady() {
		return super.isMissionReady() && payloadKg > 0 && payloadKg <= 5;
	}

	@Override
	public double calculateMissionCost() {
		return baseCost + payloadKg * 25;
	}
}

public class DroneFleetPlanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Drone ID: ");
		String id = sc.nextLine();

		System.out.print("Battery percentage: ");
		double battery = sc.nextDouble();

		System.out.print("One-way distance (km): ");
		double distance = sc.nextDouble();

		System.out.print("Base mission cost: ");
		double cost = sc.nextDouble();

		System.out.print("Cargo weight (kg): ");
		double payload = sc.nextDouble();

		if (battery < 0 || battery > 100 || distance <= 0 || cost < 0 || payload < 0) {
			System.out.println("Invalid mission details.");
		} else {
			Drone drone = new CargoDrone(id, battery, distance, cost, payload);

			drone.displayMission();

			if (!drone.isMissionReady()) {
				System.out.println("Review battery, distance, " + "or payload before dispatch.");
			}
		}

		sc.close();
	}
}
