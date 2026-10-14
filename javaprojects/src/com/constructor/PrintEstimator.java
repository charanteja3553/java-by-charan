package com.constructor;

public class PrintEstimator {

    String material;
    double weight;
    double printingHours;
    double materialRate;
    double electricityRate;

    PrintEstimator() {
        this("PLA", 100, 2);
    }

    PrintEstimator(String material, double weight,
                   double printingHours) {

        this(material, weight, printingHours, 2.5, 8);
    }

    PrintEstimator(String material, double weight,
                   double printingHours, double materialRate,
                   double electricityRate) {

        this.material = material;
        this.weight = Math.max(weight, 0);
        this.printingHours = Math.max(printingHours, 0);
        this.materialRate = Math.max(materialRate, 0);
        this.electricityRate = Math.max(electricityRate, 0);
    }

    double calculateMaterialCost() {
        return weight * materialRate;
    }

    double calculateElectricityCost() {
        return printingHours * 0.2 * electricityRate;
    }

    double calculateTotal() {
        return calculateMaterialCost()
                + calculateElectricityCost();
    }

    void generateQuote() {
        System.out.println("Material: " + material);
        System.out.println("Material Cost: " + calculateMaterialCost());
        System.out.println("Electricity Cost: "
                + calculateElectricityCost());
        System.out.println("Total Quote: " + calculateTotal());
    }

    public static void main(String[] args) {
        PrintEstimator p =
                new PrintEstimator("PLA", 250, 5);

        p.generateQuote();
    }
}