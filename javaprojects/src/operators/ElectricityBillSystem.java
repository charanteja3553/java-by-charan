package operators;

import java.util.Scanner;

class ElectricityCustomer {
	private final String customerName;
	private final int consumerNumber;
	private final double unitsConsumed;

	static int billsGenerated = 0;

	public ElectricityCustomer(String customerName, int consumerNumber, double unitsConsumed) {
		this.customerName = customerName;
		this.consumerNumber = consumerNumber;
		this.unitsConsumed = unitsConsumed;
		billsGenerated++;
	}

	public double calculateEnergyCharge() {
		double units = unitsConsumed;
		double charge = 0;

		if (units > 300) {
			charge += (units - 300) * 8;
			units = 300;
		}

		if (units > 200) {
			charge += (units - 200) * 6;
			units = 200;
		}

		if (units > 100) {
			charge += (units - 100) * 4;
			units = 100;
		}

		charge += units * 2;

		return charge;
	}

	public double calculateTotal(boolean latePayment) {
		double total = calculateEnergyCharge() + 75;
		total += latePayment ? 100 : 0;
		return total;
	}

	public void printBill(boolean latePayment) {
		System.out.println("\n----- ELECTRICITY BILL -----");
		System.out.println("Customer: " + customerName);
		System.out.println("Consumer number: " + consumerNumber);
		System.out.println("Units consumed: " + unitsConsumed);

		System.out.printf("Energy charge: Rs. %.2f%n", calculateEnergyCharge());

		System.out.println("Fixed charge: Rs. 75.00");

		System.out.printf("Late fee: Rs. %.2f%n", latePayment ? 100.0 : 0.0);

		System.out.printf("Total bill: Rs. %.2f%n", calculateTotal(latePayment));

		System.out.println("Bills generated: " + billsGenerated);
	}
}

public class ElectricityBillSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Customer name: ");
		String name = sc.nextLine();

		System.out.print("Consumer number: ");
		int number = sc.nextInt();

		System.out.print("Units consumed: ");
		double units = sc.nextDouble();

		System.out.print("Payment late? (true/false): ");
		boolean late = sc.nextBoolean();

		if (number <= 0 || units < 0) {
			System.out.println("Invalid customer or unit details.");
		} else {
			ElectricityCustomer customer = new ElectricityCustomer(name, number, units);

			customer.printBill(late);
		}

		sc.close();
	}
}
