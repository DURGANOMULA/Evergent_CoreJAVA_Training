package com.evergent.corejava.nomula.Application4;

import java.util.Scanner;

class Membership implements MembershipModule {
    static int membershipCost;
    static double membershipDiscountPercentage;
    static String membershipBenefits;
    static int membershipDiscountAmount;

    @Override
    public void selectMembership() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Membership Module");
        System.out.println("======================");
        System.out.println("B - Basic Membership (Rs100/month)");
        System.out.println("P - Premium Membership (Rs200/month)");
        System.out.println("V - VIP Membership (Rs300/month)");
        System.out.println("======================");
        System.out.println("Enter your Membership option (B, P, V): ");
        String option = scanner.nextLine().toUpperCase(); // Convert input to uppercase
        switch (option) {
            case "B":
                membershipCost = 100;
                membershipDiscountPercentage = 0.05; // 5% discount
                membershipBenefits = "Access to gym and swimming pool.";
                break;
            case "P":
                membershipCost = 200;
                membershipDiscountPercentage = 0.10; // 10% discount
                membershipBenefits = "Includes gym, swimming pool, and sauna access.";
                break;
            case "V":
                membershipCost = 300;
                membershipDiscountPercentage = 0.15; // 15% discount
                membershipBenefits = "All facilities access, personal trainer, and diet consultation.";
                break;
            default:
                System.out.println("Invalid option. Defaulting to Basic Membership.");
                membershipCost = 100;
                membershipDiscountPercentage = 0.05;
                membershipBenefits = "Access to gym and swimming pool.";
        }
        membershipDiscountAmount = (int) (membershipCost * membershipDiscountPercentage);
        System.out.println("Selected Membership Cost: Rs" + membershipCost);
        System.out.println("Membership Benefits: " + membershipBenefits);
        System.out.println("Discount: " + (int) (membershipDiscountPercentage * 100) + "%");
        System.out.println("Cost after discount: Rs" + (membershipCost - membershipDiscountAmount));
    }
}
