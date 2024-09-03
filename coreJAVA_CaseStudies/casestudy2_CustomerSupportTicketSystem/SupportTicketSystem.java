package com.evergent.corejava.casestudy2_CustomerSupportTicketSystem;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SupportTicketSystem {

    // Initialize the ticket queue
    ArrayDeque<String> ticketQueue = new ArrayDeque<>();

    // Method to add a ticket
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    // Method to process the next ticket
    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            String ticket = ticketQueue.poll();
            System.out.println("Processing ticket: " + ticket);
        }
    }

    // Method to peek at the next ticket
    public void peekNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            String ticket = ticketQueue.peek();
            System.out.println("Next ticket in line: " + ticket);
        }
    }

    // Method to display all tickets
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            System.out.println("Current tickets in the queue: " + ticketQueue);
        }
    }

    public static void main(String[] args) {
        SupportTicketSystem system = new SupportTicketSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        while (true) 
        {
        	System.out.println("\n--- Customer Support Ticketing System ---");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Peek Next Ticket");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice)
            {
                case 1:
                    System.out.print("Enter the ticket description: ");
                    String ticket = scanner.nextLine();
                    system.addTicket(ticket);
                    break;
                case 2:
                    system.processNextTicket();
                    break;
                case 3:
                    system.peekNextTicket();
                    break;
                case 4:
                    system.displayQueue();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
       

        
		}
            
    }
}