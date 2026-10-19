package operators;

import java.util.Scanner;

public class BoardingValidator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Is ticket valid? (true/false): ");
		boolean ticket = sc.nextBoolean();

		System.out.print("Is security cleared? (true/false): ");
		boolean security = sc.nextBoolean();

		System.out.print("Is boarding open? (true/false): ");
		boolean boardingOpen = sc.nextBoolean();

		System.out.print("Is baggage restricted? (true/false): ");
		boolean restrictedBaggage = sc.nextBoolean();

		boolean ready = ticket && security && boardingOpen;
		boolean needsAttention = !ticket || !security || restrictedBaggage;

		System.out.println("\n===== BOARDING STATUS =====");

		if (ready && !restrictedBaggage) {
			System.out.println("Passenger may proceed to boarding.");
		} else if (needsAttention || !boardingOpen) {
			System.out.println("Boarding blocked or requires attention.");
		} else {
			System.out.println("Please check boarding requirements.");
		}

		System.out.println("Ready: " + ready);
		System.out.println("Needs attention: " + needsAttention);

		sc.close();
	}
}
