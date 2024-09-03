package com.evergent.corejava.nomula.Application4;

import java.util.Scanner;

class Nutrition implements NutritionModule {
    static int nutritionPlanCost;
    static int nutritionDiscountAmount;
    static int nutritionWeight;

    @Override
    public void selectNutritionPlan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nutrition Plans Module");
        System.out.println("======================");
        System.out.println("V - Vegan Plan (Rs70/month)");
        System.out.println("K - Keto Plan (Rs90/month)");
        System.out.println("P - Paleo Plan (Rs80/month)");
        System.out.println("======================");
        System.out.println("Enter your Nutrition Plan (V, K, P): ");
        String option = scanner.nextLine().toUpperCase(); // Convert input to uppercase
        switch (option) {
            case "V":
                nutritionPlanCost = 70;
                break;
            case "K":
                nutritionPlanCost = 90;
                break;
            case "P":
                nutritionPlanCost = 80;
                break;
            default:
                System.out.println("Invalid option. Defaulting to Vegan Plan.");
                nutritionPlanCost = 70;
        }
        System.out.println("Selected Nutrition Plan Cost: Rs" + nutritionPlanCost);
        System.out.println("Enter the amount of nutrition in kilograms: ");
        nutritionWeight = Integer.parseInt(scanner.nextLine());
        if (nutritionWeight >= 1 && nutritionWeight <= 5) {
            nutritionDiscountAmount = (int) (nutritionPlanCost * 0.05);
        } else if (nutritionWeight >= 6 && nutritionWeight <= 10) {
            nutritionDiscountAmount = (int) (nutritionPlanCost * 0.10);
        } else if (nutritionWeight > 10) {
            nutritionDiscountAmount = (int) (nutritionPlanCost * 0.15);
        } else {
            nutritionDiscountAmount = 0;
        }
        nutritionPlanCost -= nutritionDiscountAmount;
        System.out.println("Nutrition Discount: Rs" + nutritionDiscountAmount);
        System.out.println("Nutrition Cost after Discount: Rs" + nutritionPlanCost);
    }
}
