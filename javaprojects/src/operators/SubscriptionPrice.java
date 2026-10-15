package operators;

public class SubscriptionPrice {

	public static void main(String[] args) {

		double price = 999;

		price *= 3; // Three months
		System.out.println("Three-month price: " + price);

		price -= 200; // Discount
		System.out.println("After discount: " + price);

		price /= 3; // Average monthly cost
		System.out.println("Monthly average: " + price);

		price += 50; // Additional monthly fee
		System.out.println("Final monthly cost: " + price);
	}
}