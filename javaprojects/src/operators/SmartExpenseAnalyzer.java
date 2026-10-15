package operators;

import java.util.Scanner;

public class SmartExpenseAnalyzer {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SMART EXPENSE ANALYZER =====");

        System.out.print("Enter your monthly budget: ");
        double budget = sc.nextDouble();

        System.out.print("Enter food expenses: ");
        double food = sc.nextDouble();

        System.out.print("Enter travel expenses: ");
        double travel = sc.nextDouble();

        System.out.print("Enter shopping expenses: ");
        double shopping = sc.nextDouble();

        System.out.print("Enter other expenses: ");
        double other = sc.nextDouble();

        // Addition (+)
        double totalExpenses = food + travel + shopping + other;

        // Subtraction (-)
        double remaining = budget - totalExpenses;

        // Multiplication (*)
        double annualBudget = budget * 12;

        // Division (/)
        double averageExpense = totalExpenses / 4;

        // Modulus (%) — demonstrate remainder with whole rupees
        long wholeRupees = (long) totalExpenses;
        long remainder = wholeRupees % 100;

        System.out.println("\n===== MONTHLY REPORT =====");

        System.out.println("Monthly Budget: Rs. " + budget);
        System.out.println("Total Expenses: Rs. " + totalExpenses);
        System.out.println("Remaining Budget: Rs. " + remaining);
        System.out.println("Annual Budget: Rs. " + annualBudget);
        System.out.println("Average Category Expense: Rs. " + averageExpense);
        System.out.println("Remainder after grouping whole rupees by 100: Rs. "
                + remainder);

        if (remaining > 0) {
            System.out.println("Status: You are within your budget.");
        } else if (remaining == 0) {
            System.out.println("Status: You used your entire budget.");
        } else {
            System.out.println("Status: You exceeded your budget.");
        }

        sc.close();
    }
}