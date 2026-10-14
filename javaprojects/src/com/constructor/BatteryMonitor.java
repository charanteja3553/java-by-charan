package com.constructor;

public class BatteryMonitor {

    String deviceName;
    double capacity;
    double charge;
    double health;

    BatteryMonitor() {
        this("Unknown", 5000, 100, 100);
    }

    BatteryMonitor(String name, double charge) {
        this(name, 5000, charge, 100);
    }

    BatteryMonitor(String name, double capacity,
                   double charge, double health) {

        this.deviceName = name;
        this.capacity = Math.max(capacity, 0);
        this.charge = Math.max(0, Math.min(charge, 100));
        this.health = Math.max(0, Math.min(health, 100));
    }

    double getEffectiveCapacity() {
        return capacity * health / 100;
    }

    double estimateUsageHours(double consumptionPerHour) {
        if (consumptionPerHour <= 0) {
            return 0;
        }

        return getEffectiveCapacity()
                * charge / 100 / consumptionPerHour;
    }

    String getHealthStatus() {
        if (health >= 80) {
            return "Good";
        } else if (health >= 60) {
            return "Fair";
        }

        return "Needs attention";
    }

    void displayReport() {
        System.out.println("Device: " + deviceName);
        System.out.println("Battery Health: " + health + "%");
        System.out.println("Effective Capacity: "
                + getEffectiveCapacity() + " mAh");
        System.out.println("Condition: " + getHealthStatus());
        System.out.println("Estimated Hours: "
                + estimateUsageHours(500));
    }

    public static void main(String[] args) {
        BatteryMonitor b =
                new BatteryMonitor("My Phone", 5000, 80, 90);

        b.displayReport();
    }
}