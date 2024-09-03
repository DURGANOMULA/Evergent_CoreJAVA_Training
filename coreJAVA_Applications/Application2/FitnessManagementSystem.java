package com.evergent.corejava.nomula.Application2;

//package com.evergent.corejava.fitnessmanagementsystem;

import java.util.*;

public class FitnessManagementSystem {
    enum Module {M, W, N, P, R, E};
    enum MembershipOption {B, P, V};
    enum WorkoutPlan {A, W, Y};
    enum NutritionPlan {V, K, P};
    enum PaymentOption {V, P};
    enum ReportOption {I, S};

    static int membershipCost;
    static int workoutPlanCost;
    static int nutritionPlanCost;
    static int totalAmountBeforeDiscount;
    static int totalAmountAfterDiscount;
    static int membershipDiscountAmount;
    static int nutritionDiscountAmount;
    static double membershipDiscountPercentage;
    static String membershipBenefits;
    static int nutritionWeight; // Weight in kilograms for nutrition

    public static void main(String[] args) {
        String module = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\tWelcome To FITNESS MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println(" FMS Main Menu");
            System.out.println("======================");
            System.out.println("M - Membership Module");
            System.out.println("W - Workout Plans Module");
            System.out.println("N - Nutrition Plans Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Quit Module");
            System.out.println("======================");
            System.out.println("Enter your Module (M, W, N, P, R, E): ");

            module = scanner.nextLine().toUpperCase();
            System.out.println("You entered module: " + module);

            switch (Module.valueOf(module)) {
                case M:
                    System.out.println(" Membership Module");
                    System.out.println("======================");
                    System.out.println("B - Basic Membership (Rs100/month)");
                    System.out.println("P - Premium Membership (Rs200/month)");
                    System.out.println("V - VIP Membership (Rs300/month)");
                    System.out.println("======================");
                    System.out.println("Enter your Membership option (B, P, V): ");

                    module = scanner.nextLine().toUpperCase();
                    switch (MembershipOption.valueOf(module)) {
                        case B:
                            membershipCost = 100;
                            membershipDiscountPercentage = 0.05; // 5% discount
                            membershipBenefits = "Access to gym and swimming pool.";
                            break;
                        case P:
                            membershipCost = 200;
                            membershipDiscountPercentage = 0.10; // 10% discount
                            membershipBenefits = "Includes gym, swimming pool, and sauna access.";
                            break;
                        case V:
                            membershipCost = 300;
                            membershipDiscountPercentage = 0.15; // 15% discount
                            membershipBenefits = "All facilities access, personal trainer, and diet consultation.";
                            break;
                    }
                    membershipDiscountAmount = (int) (membershipCost * membershipDiscountPercentage);
                    System.out.println("Selected Membership Cost: Rs" + membershipCost);
                    System.out.println("Membership Benefits: " + membershipBenefits);
                    System.out.println("Discount: " + (int) (membershipDiscountPercentage * 100) + "%");
                    System.out.println("Cost after discount: Rs" + (membershipCost - membershipDiscountAmount));
                    break;

                case W:
                    System.out.println(" Workout Plans Module");
                    System.out.println("======================");
                    System.out.println("A - Aerobics Plan (Rs50/month)");
                    System.out.println("W - Weights Plan (Rs75/month)");
                    System.out.println("Y - Yoga Plan (Rs60/month)");
                    System.out.println("======================");
                    System.out.println("Enter your Workout Plan (A, W, Y): ");

                    module = scanner.nextLine().toUpperCase();
                    switch (WorkoutPlan.valueOf(module)) {
                        case A:
                            workoutPlanCost = 50;
                            break;
                        case W:
                            workoutPlanCost = 75;
                            break;
                        case Y:
                            workoutPlanCost = 60;
                            break;
                    }
                    System.out.println("Selected Workout Plan Cost: Rs" + workoutPlanCost);
                    break;

                case N:
                    System.out.println(" Nutrition Plans Module");
                    System.out.println("======================");
                    System.out.println("V - Vegan Plan (Rs70/month)");
                    System.out.println("K - Keto Plan (Rs90/month)");
                    System.out.println("P - Paleo Plan (Rs80/month)");
                    System.out.println("======================");
                    System.out.println("Enter your Nutrition Plan (V, K, P): ");

                    module = scanner.nextLine().toUpperCase();
                    switch (NutritionPlan.valueOf(module)) {
                        case V:
                            nutritionPlanCost = 70;
                            break;
                        case K:
                            nutritionPlanCost = 90;
                            break;
                        case P:
                            nutritionPlanCost = 80;
                            break;
                    }
                    System.out.println("Selected Nutrition Plan Cost: Rs" + nutritionPlanCost);

                    // Asking for the weight in kg for the nutrition plan
                    System.out.println("Enter the amount of nutrition in kilograms: ");
                    nutritionWeight = Integer.parseInt(scanner.nextLine());

                    // Apply discount based on the weight of nutrition purchased
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
                    break;

                case P:
                    System.out.println(" Payment Module");
                    System.out.println("======================");
                    System.out.println("V - View Total Amount to be Paid");
                    System.out.println("P - Make Payment");
                    System.out.println("======================");
                    System.out.println("Enter your Payment option (V, P): ");

                    module = scanner.nextLine().toUpperCase();
                    switch (PaymentOption.valueOf(module)) {
                        case V:
                            totalAmountBeforeDiscount = membershipCost + workoutPlanCost + (nutritionPlanCost + nutritionDiscountAmount);
                            totalAmountAfterDiscount = (membershipCost - membershipDiscountAmount) + workoutPlanCost + nutritionPlanCost;

                            System.out.println("Total Amount before Discount: Rs" + totalAmountBeforeDiscount);
                            System.out.println("Total Amount after Discount: Rs" + totalAmountAfterDiscount);
                            break;
                        case P:
                            totalAmountAfterDiscount = (membershipCost - membershipDiscountAmount) + workoutPlanCost + nutritionPlanCost;
                            System.out.println("Amount to be Paid after Discount: Rs" + totalAmountAfterDiscount);
                            break;
                    }
                    break;

                case R:
                    System.out.println(" Report Module");
                    System.out.println("======================");
                    System.out.println("I - Display Invoice");
                    System.out.println("S - Display Summary of Orders and Payments");
                    System.out.println("======================");
                    System.out.println("Enter your Report option (I, S): ");

                    module = scanner.nextLine().toUpperCase();
                    switch (ReportOption.valueOf(module)) {
                        case I:
                            System.out.println("Invoice Display");
                            System.out.println("==================");
                            System.out.println("Membership Cost: Rs" + membershipCost);
                            System.out.println("Workout Plan Cost: Rs" + workoutPlanCost);
                            System.out.println("Nutrition Plan Cost: Rs" + nutritionPlanCost);
                            System.out.println("Total Amount before Discount: Rs" + totalAmountBeforeDiscount);
                            System.out.println("Total Amount after Discount: Rs" + totalAmountAfterDiscount);
                            break;
                        case S:
                            System.out.println("Summary of Order");
                            System.out.println("======================");
                            System.out.println("Membership Cost: Rs" + membershipCost);
                            System.out.println("Workout Plan Cost: Rs" + workoutPlanCost);
                            System.out.println("Nutrition Plan Cost: Rs" + nutritionPlanCost);
                            System.out.println("Total Amount before Discount: Rs" + totalAmountBeforeDiscount);
                            System.out.println("Total Amount after Discount: Rs" + totalAmountAfterDiscount);
                            break;
                    }
                    break;

                case E:
                    System.out.println("Quit Module");
                    System.exit(0);
                    break;
            }
        }
    }
}
