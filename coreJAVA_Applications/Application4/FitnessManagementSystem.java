package com.evergent.corejava.nomula.Application4;
import java.util.*;

public class FitnessManagementSystem extends BaseModule {
    // Static block to display the welcome message
    static {
        System.out.println("\n\t\tWelcome To FITNESS MANAGEMENT SYSTEM");
    }

    // Static final method for calculating tax
    private static final double tax = 0.18;

    public static double calculateTax(double amount) {
        return amount * tax;
    }

    @Override
    public void showMenu() {
        System.out.println("======================");
        System.out.println(" FMS Main Menu");
        System.out.println("======================");
        System.out.println("M - Membership Module");
        System.out.println("W - Workout lans Module");
        System.out.println("N - Nutrition Plans Module");
        System.out.println("P - Payment Module");
        System.out.println("E - Quit Module");
        System.out.println("======================");
        System.out.println("Enter your Module (M, W, N, P, E): ");
    }

    public static void main(String[] args) {
        FitnessManagementSystem fms = new FitnessManagementSystem();
        Scanner scanner = new Scanner(System.in);
        Membership membership = new Membership();
        Workout workout = new Workout();
        Nutrition nutrition = new Nutrition();
        Payment payment = new Payment();

        while (true) {
            fms.showMenu();
            String module = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            System.out.println("You entered module: " + module);
            switch (module) {
                case "M":
                    membership.selectMembership();
                    break;
                case "W":
                    workout.selectWorkoutPlan();
                    break;
                case "N":
                    nutrition.selectNutritionPlan();
                    break;
                case "P":
                    System.out.println(" Payment Module");
                    System.out.println("======================");
                    System.out.println("V - View Total Amount to be Paid");
                    System.out.println("P - Make Payment");
                    System.out.println("======================");
                    System.out.println("Enter your Payment option (V, P): ");
                    String paymentOption = scanner.nextLine().toUpperCase(); // Convert input to uppercase
                    switch (paymentOption) {
                        case "V":
                            payment.viewTotalAmount();
                            break;
                        case "P":
                            payment.makePayment();
                            System.out.println("Thank you for your payment.");
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case "E":
                    System.out.println("Quit Module");
                    new Thanku(); // Instantiate Thanku class
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid module. Please try again.");
            }
        }
    }
}
