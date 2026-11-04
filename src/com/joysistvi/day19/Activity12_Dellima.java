package com.joysistvi.day19;
import java.util.Scanner;
public class Activity12_Dellima {
    static Scanner sc = new Scanner(System.in);
    static double balance = 100.0;

    public static void main(String[] args) {

        System.out.println("Dial *143# to access Sun Services");
        System.out.print("Enter USSD Code: ");
        String ussd = sc.nextLine();

        if (!ussd.equals("*143#")) {
            System.out.println("Invalid USSD Code.");
            return;
        }

        int choice;

        do {
            System.out.println("\n** Load Registration **");
            System.out.println("[1] Unli Text");
            System.out.println("[2] Unli Call");
            System.out.println("[3] Unli Call N Text");
            System.out.println("[4] Check Balance");
            System.out.println("[5] Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    unliText();
                    break;

                case 2:
                    unliCall();
                    break;

                case 3:
                    unliCallAndText();
                    break;

                case 4:
                    System.out.println("\nCurrent Load Balance: P" + balance);
                    break;

                case 5:
                    System.out.println("\nThank you for using our service!");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 5);
    }

    public static void unliText() {

        System.out.println("\n** Enjoy Unli Text **");
        System.out.println("[1] 1 Day for P10");
        System.out.println("[2] 3 Days for P30");
        System.out.println("[3] 5 Days for P50");
        System.out.println("[4] Back");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                subscribePromo("Unli Text", "1 day/s", 10);
                break;

            case 2:
                subscribePromo("Unli Text", "3 day/s", 30);
                break;

            case 3:
                subscribePromo("Unli Text", "5 day/s", 50);
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void unliCall() {

        System.out.println("\n** Enjoy Unli Call **");
        System.out.println("[1] 1 Day for P20");
        System.out.println("[2] 3 Days for P50");
        System.out.println("[3] 5 Days for P80");
        System.out.println("[4] Back");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                subscribePromo("Unli Call", "1 day/s", 20);
                break;

            case 2:
                subscribePromo("Unli Call", "3 day/s", 50);
                break;

            case 3:
                subscribePromo("Unli Call", "5 day/s", 80);
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void unliCallAndText() {

        System.out.println("\n** Enjoy Unli Call N Text **");
        System.out.println("[1] 1 Day for P30");
        System.out.println("[2] 3 Days for P60");
        System.out.println("[3] 5 Days for P100");
        System.out.println("[4] Back");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                subscribePromo("Unli Call N Text", "1 day/s", 30);
                break;

            case 2:
                subscribePromo("Unli Call N Text", "3 day/s", 60);
                break;

            case 3:
                subscribePromo("Unli Call N Text", "5 day/s", 100);
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void subscribePromo(String promo, String duration, double cost) {

        System.out.println("\n[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                if (balance >= cost) {

                    balance -= cost;

                    System.out.println("\nYou have successfully registered to "
                            + promo + ".");
                    System.out.println("Promo duration: " + duration);
                    System.out.println("Remaining load balance: P" + balance);
                    System.out.println("Thank you for using our service!");

                } else {

                    System.out.println("\nInsufficient balance.");
                }

                break;

            case 2:
                return;

            case 3:
                System.out.println("Thank you for using our service!");
                System.exit(0);

            default:
                System.out.println("Invalid choice.");
        }
    }
}
