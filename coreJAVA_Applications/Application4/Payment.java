package com.evergent.corejava.nomula.Application4;

class Payment implements PaymentModule {
    static int totalAmountBeforeDiscount;
    static int totalAmountAfterDiscount;
    static double taxAmount;
    static double totalAmountAfterTax;

    @Override
    public void viewTotalAmount() {
        totalAmountBeforeDiscount = Membership.membershipCost + Workout.workoutPlanCost + (Nutrition.nutritionPlanCost + Nutrition.nutritionDiscountAmount);
        totalAmountAfterDiscount = (Membership.membershipCost - Membership.membershipDiscountAmount) + Workout.workoutPlanCost + Nutrition.nutritionPlanCost;
        // Calculate the tax based on the amount after discount
        taxAmount = FitnessManagementSystem.calculateTax(totalAmountAfterDiscount);
        totalAmountAfterTax = totalAmountAfterDiscount + taxAmount;
        System.out.println("Total Amount before Discount: Rs" + totalAmountBeforeDiscount);
        System.out.println("Total Amount after Discount: Rs" + totalAmountAfterDiscount);
        System.out.println("Tax Amount: Rs" + taxAmount);
        System.out.println("Total Amount after Tax: Rs" + totalAmountAfterTax);
    }

    @Override
    public void makePayment() {
        totalAmountAfterDiscount = (Membership.membershipCost - Membership.membershipDiscountAmount) + Workout.workoutPlanCost + Nutrition.nutritionPlanCost;
        // Calculate the tax based on the amount after discount
        taxAmount = FitnessManagementSystem.calculateTax(totalAmountAfterDiscount);
        totalAmountAfterTax = totalAmountAfterDiscount + taxAmount;
        System.out.println("Amount to be Paid after Discount: Rs" + totalAmountAfterDiscount);
        System.out.println("Tax Amount: Rs" + taxAmount);
        System.out.println("Total Amount to be Paid after Tax: Rs" + totalAmountAfterTax);
    }
}
