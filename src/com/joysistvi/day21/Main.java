package com.joysistvi.day21;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String address;
        String email;
        String password;

        System.out.println("===== USER ACCOUNT REGISTRATION =====");

        System.out.print("First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Address: ");
        address = scanner.nextLine();

        UserAccount account = null;

        while (account == null) {

            try {

                System.out.print("Email: ");
                email = scanner.nextLine();

                System.out.print("Password: ");
                password = scanner.nextLine();

                // Create object using constructor
                account = new UserAccount(
                        firstName,
                        middleName,
                        lastName,
                        address,
                        email,
                        password
                );

            } catch (IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        // Uses toString() automatically
        System.out.println(account);

        scanner.close();
    }
}
