package com.logicalstatements;

import java.util.Scanner;

public class LoginRiskDetector {

	private String username;
	private int failedAttempts;
	private boolean unknownLocation;
	private boolean unusualTime;

	public LoginRiskDetector(String username, int failedAttempts, boolean unknownLocation, boolean unusualTime) {
		this.username = username;
		this.failedAttempts = failedAttempts;
		this.unknownLocation = unknownLocation;
		this.unusualTime = unusualTime;
	}

	public boolean isHighRisk() {
		return failedAttempts >= 3 || (unknownLocation && unusualTime);
	}

	public boolean shouldRequireVerification() {
		return failedAttempts >= 2 || unknownLocation || unusualTime;
	}

	public void displayReport() {
		System.out.println("\n--- LOGIN RISK REPORT ---");
		System.out.println("Username: " + username);

		if (isHighRisk()) {
			System.out.println("Risk: HIGH");
		} else if (shouldRequireVerification()) {
			System.out.println("Risk: MEDIUM");
		} else {
			System.out.println("Risk: LOW");
		}

		System.out.println("Require additional verification: " + (shouldRequireVerification() ? "Yes" : "No"));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Username: ");
		String username = sc.nextLine();

		System.out.print("Failed login attempts: ");
		int attempts = sc.nextInt();

		System.out.print("Unknown location? (true/false): ");
		boolean location = sc.nextBoolean();

		System.out.print("Unusual login time? (true/false): ");
		boolean time = sc.nextBoolean();

		if (attempts < 0) {
			System.out.println("Invalid attempt count.");
		} else {
			LoginRiskDetector detector = new LoginRiskDetector(username, attempts, location, time);
			detector.displayReport();
		}

		sc.close();
	}
}
