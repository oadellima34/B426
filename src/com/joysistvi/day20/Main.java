package com.joysistvi.day20;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserAccount user = new UserAccount();

        System.out.println("=== USER ACCOUNT REGISTRATION ===");

        System.out.print("Enter First Name: ");
        user.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        user.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        user.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        user.setAddress(scanner.nextLine());

        // Email Validation Loop
        while (true) {
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            if (user.setEmail(email)) {
                break;
            } else {
                System.out.println("Invalid email format. Try again.");
            }
        }

        // Password Validation Loop
        while (true) {
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (user.setPassword(password)) {
                break;
            } else {
                System.out.println("\nPassword must contain:");
                System.out.println("- At least 8 characters");
                System.out.println("- At least 1 uppercase letter");
                System.out.println("- At least 1 lowercase letter");
                System.out.println("- At least 1 digit");
                System.out.println("Please try again.\n");
            }
        }

        // Display Account Information
        user.displayInfo();

        scanner.close();
    }
}
