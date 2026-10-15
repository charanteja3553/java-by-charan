package operators;

public class GamingScore {
	public static void main(String[] args) {

		int score = 500;

		score += 200; // Bonus points
		System.out.println("After bonus: " + score);

		score *= 2; // Double points
		System.out.println("After multiplier: " + score);

		score -= 150; // Penalty
		System.out.println("After penalty: " + score);
	}
}
