package operators;

import java.util.Scanner;

public class ExamEligibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student marks: ");
		int marks = sc.nextInt();

		System.out.print("Enter attendance percentage: ");
		int attendance = sc.nextInt();

		System.out.print("Enter practical marks: ");
		int practical = sc.nextInt();

		System.out.println("\n===== ELIGIBILITY CHECK =====");

		System.out.println("Marks equal to 100: " + (marks == 100));
		System.out.println("Marks not equal to 0: " + (marks != 0));
		System.out.println("Marks greater than 40: " + (marks > 40));
		System.out.println("Marks less than 35: " + (marks < 35));
		System.out.println("Attendance at least 75: " + (attendance >= 75));
		System.out.println("Practical marks at most 100: " + (practical <= 100));

		if (marks >= 40 && attendance >= 75 && practical >= 35) {
			System.out.println("Result: Eligible");
		} else {
			System.out.println("Result: Not eligible");
		}

		sc.close();
	}
}
