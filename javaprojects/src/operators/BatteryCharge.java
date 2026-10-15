package operators;

public class BatteryCharge {
	public static void main(String[] args) {

		double battery = 20;

		battery += 30; // Charging
		System.out.println("Charging: " + battery + "%");

		battery *= 1.2; // Simulate a multiplier
		System.out.println("After multiplier: " + battery + "%");

		battery -= 10; // Power consumed
		System.out.println("After usage: " + battery + "%");

		battery /= 2; // Divide for a calculation
		System.out.println("Half value: " + battery + "%");
	}
}