package at.ac.hcw.exampreparation.exam01.example01;

public class Example01 {
    public static void main(String[] args) {
        System.out.println(String.format("Costs Zone A, 8 kg: %.0f €",
                calculateShippingCosts(8.0, 'A')));
        System.out.printf("Costs Zone A, 12 kg (with Surcharge): %.0f €%n",
                calculateShippingCosts(12.0, 'A'));
        System.out.println(String.format("Costs Zone B, 65 kg (with Surcharge): %.0f €",
                calculateShippingCosts(65.0, 'B')));
        System.out.printf("Costs Zone C, 20 kg:  %.0f €",
                calculateShippingCosts(20.0, 'C'));
    }

    public static double calculateShippingCosts(double weight, char zone) {
        final double BASE_ZONE_A = 5.0;
        final double BASE_ZONE_B = 10.0;
        final double BASE_ZONE_C = 25.0;

        double costs = 0.0;

        if (zone == 'A') {
            costs = BASE_ZONE_A;

            if (weight > 10.0) {
                costs += costs * 0.20;
            }
        } else if (zone == 'B') {
            costs = BASE_ZONE_B;

            if (weight > 50.0) {
                costs += 15.00;
            }
        } else if (zone == 'C') {
            costs = BASE_ZONE_C;
        } else {
            System.out.println("Error: Invalid Zone '" + zone + "'.");
            costs = 0.0;
        }

        return costs;
    }
}