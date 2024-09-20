package com.evergent.coreJava.Controller;

import java.util.Scanner;

public class MetroManagementController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, continueChoice = 1;

        MetroManagementService metroService = new MetroManagementService();

        System.out.println("---------- WELCOME TO METRO MANAGEMENT SYSTEM ----------");
        while (continueChoice != 0) {
            System.out.println("1. Add New Metro Service");
            System.out.println("2. View Service Details");
            System.out.println("3. Book Ticket");
            System.out.println("4. View All Bookings");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Service ID:");
                    int serviceId = scanner.nextInt();
                    System.out.println("Enter Service Name:");
                    String serviceName = scanner.next();
                    System.out.println("Enter Service Price:");
                    double price = scanner.nextDouble();
                    int result = metroService.addService(serviceId, serviceName, price);
                    System.out.println(result + " Service Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Service ID:");
                    serviceId = scanner.nextInt();
                    String serviceDetails = metroService.viewService(serviceId);
                    System.out.println(serviceDetails);
                    break;
                case 3:
                    System.out.println("Enter Ticket ID:");
                    int ticketId = scanner.nextInt();
                    System.out.println("Enter Passenger Name:");
                    String passengerName = scanner.next();
                    System.out.println("Enter Service Name:");
                    String ticketService = scanner.next();
                    System.out.println("Enter Travel Date:");
                    String travelDate = scanner.next();
                    result = metroService.bookTicket(ticketId, passengerName, ticketService, travelDate);
                    System.out.println(result + " Ticket Booked Successfully");
                    break;
                case 4:
                    String allBookings = metroService.viewAllBookings();
                    System.out.println("All Bookings:\n" + allBookings);
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
            System.out.println("\nEnter 1 to perform More Operations and 0 for Exit :");
            continueChoice = scanner.nextInt();
        }
        scanner.close();
    }
}
