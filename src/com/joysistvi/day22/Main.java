package com.joysistvi.day22;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        String email;

        while (true) {
            System.out.print("Enter Email: ");
            email = sc.nextLine();

            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                break;
            }

            System.out.println("Invalid Email Format!");
        }

        String password;

        while (true) {
            System.out.print("Enter Password: ");
            password = sc.nextLine();

            if (password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*\\d.*")) {

                break;
            }

            System.out.println("Invalid Password!");
            System.out.println("Password must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- At least 1 uppercase letter");
            System.out.println("- At least 1 lowercase letter");
            System.out.println("- At least 1 number");
        }

        // Create object using Constructor
        UserAccount account = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        // Display account using toString()
        System.out.println(account);

        sc.close();
    }
}
