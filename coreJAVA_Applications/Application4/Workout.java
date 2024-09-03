package com.evergent.corejava.nomula.Application4;

import java.util.Scanner;

class Workout implements WorkoutModule {
    static int workoutPlanCost;

    @Override
    public void selectWorkoutPlan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Workout Plans Module");
        System.out.println("======================");
        System.out.println("A - Aerobics Plan (Rs50/month)");
        System.out.println("W - Weights Plan (Rs75/month)");
        System.out.println("Y - Yoga Plan (Rs60/month)");
        System.out.println("======================");
        System.out.println("Enter your Workout Plan (A, W, Y): ");
        String option = scanner.nextLine().toUpperCase(); // Convert input to uppercase
        switch (option) {
            case "A":
                workoutPlanCost = 50;
                break;
            case "W":
                workoutPlanCost = 75;
                break;
            case "Y":
                workoutPlanCost = 60;
                break;
            default:
                System.out.println("Invalid option. Defaulting to Aerobics Plan.");
                workoutPlanCost = 50;
        }
        System.out.println("Selected Workout Plan Cost: Rs" + workoutPlanCost);
    }
}