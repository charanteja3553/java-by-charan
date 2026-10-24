package operators;

import java.util.Scanner;

public class CropProfitPredictor {

    private String farmerName;
    private String cropName;
    private double landInAcres;
    private double yieldPerAcre;
    private double pricePerQuintal;
    private double expensePerAcre;

    private final char seasonCode;
    private boolean irrigationAvailable;

    static int farmsAnalyzed = 0;

    // No-argument constructor
    public CropProfitPredictor() {
        this("Unknown Farmer", "Rice", 1.0, 20.0,
                2500.0, 15000.0, 'K', true);
    }

    // Overloaded constructor
    public CropProfitPredictor(
            String farmerName,
            String cropName,
            double landInAcres,
            double yieldPerAcre,
            double pricePerQuintal,
            double expensePerAcre,
            char seasonCode,
            boolean irrigationAvailable) {

        this.farmerName = farmerName;
        this.cropName = cropName;
        this.landInAcres = landInAcres;
        this.yieldPerAcre = yieldPerAcre;
        this.pricePerQuintal = pricePerQuintal;
        this.expensePerAcre = expensePerAcre;
        this.seasonCode = seasonCode;
        this.irrigationAvailable = irrigationAvailable;

        farmsAnalyzed++;
    }

    // Calculate total crop production
    public double calculateTotalYield() {
        return landInAcres * yieldPerAcre;
    }

    // Calculate expected income
    public double calculateIncome() {
        return calculateTotalYield() * pricePerQuintal;
    }

    // Calculate total farming expenses
    public double calculateExpenses() {
        return landInAcres * expensePerAcre;
    }

    // Calculate profit or loss
    public double calculateProfit() {
        return calculateIncome() - calculateExpenses();
    }

    // Calculate profit per acre
    public double calculateProfitPerAcre() {
        return calculateProfit() / landInAcres;
    }

    // Generate a recommendation
    public String getRecommendation() {
        double profit = calculateProfit();

        if (!irrigationAvailable && yieldPerAcre > 25) {
            return "Review water availability and yield assumptions.";
        } else if (profit < 0) {
            return "Expected loss: review costs and selling price.";
        } else if (profit == 0) {
            return "Break-even: income equals expenses.";
        } else {
            return "Expected profit: plan harvesting and selling.";
        }
    }

    // Display complete farm report
    public void displayReport() {
        System.out.println("\n===== CROP PROFIT REPORT =====");
        System.out.println("Farmer: " + farmerName);
        System.out.println("Crop: " + cropName);
        System.out.println("Season code: " + seasonCode);
        System.out.println("Irrigation available: "
                + irrigationAvailable);
        System.out.println("Land: " + landInAcres + " acres");

        System.out.printf("Total yield: %.2f quintals%n",
                calculateTotalYield());

        System.out.printf("Expected income: Rs. %.2f%n",
                calculateIncome());

        System.out.printf("Total expenses: Rs. %.2f%n",
                calculateExpenses());

        System.out.printf("Profit/Loss: Rs. %.2f%n",
                calculateProfit());

        System.out.printf("Profit per acre: Rs. %.2f%n",
                calculateProfitPerAcre());

        String result = calculateProfit() >= 0
                ? "PROFIT" : "LOSS";

        System.out.println("Result: " + result);
        System.out.println("Recommendation: " + getRecommendation());
        System.out.println("Farms analyzed: " + farmsAnalyzed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter farmer name: ");
        String name = sc.nextLine();

        System.out.print("Enter crop name: ");
        String crop = sc.nextLine();

        System.out.print("Enter land in acres: ");
        double land = sc.nextDouble();

        System.out.print("Enter expected yield per acre (quintals): ");
        double yield = sc.nextDouble();

        System.out.print("Enter selling price per quintal: ");
        double price = sc.nextDouble();

        System.out.print("Enter farming expense per acre: ");
        double expense = sc.nextDouble();

        System.out.print("Enter season code (K/R/S): ");
        char season = sc.next().charAt(0);

        System.out.print("Irrigation available? (true/false): ");
        boolean irrigation = sc.nextBoolean();

        if (land <= 0 || yield < 0 || price <= 0 || expense < 0) {
            System.out.println("Invalid farm details.");
        } else {
            CropProfitPredictor farm = new CropProfitPredictor(
                    name, crop, land, yield, price,
                    expense, season, irrigation);

            farm.displayReport();
        }

        sc.close();
    }
}
