package Orientaatio1;

import java.util.LinkedList;
import java.util.Scanner;

public class Customer {
    private static int nextId = 1;
    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime) {
        this.id = nextId++;
        this.startTime = startTime;
    }
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpentInQueue() {
        return endTime - startTime;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a customer to the queue");
            System.out.println("2. Remove a customer from the queue");
            System.out.println("3. Exit?");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    long startTime = System.nanoTime();
                    Customer customer = new Customer(startTime);
                    queue.addFirst(customer);
                    System.out.println("Customer " + customer.getId() + " added to the queue.\n");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        Customer removedCustomer = queue.removeLast();
                        removedCustomer.setEndTime(System.nanoTime());
                        System.out.println("Customer " + removedCustomer.getId() + " removed from the queue.");
                        System.out.println("Time spent in queue: " + removedCustomer.getTimeSpentInQueue() / 1000 + " ms\n");
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}
