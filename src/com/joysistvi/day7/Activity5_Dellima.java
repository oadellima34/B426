package com.joysistvi.day7;
import java.util.Scanner;
public class Activity5_Dellima {
            static Scanner sc = new Scanner(System.in);
            public static void main(String[] args) {
                String ussdCode;
                // USSD Validation
                while (true) {
                    System.out.println("Dial *143# to access Globe Services");
                    System.out.print("Enter USSD Code: ");
                    ussdCode = sc.nextLine();
                    if (ussdCode.equals("*143#")) {
                        break;
                    } else {
                        System.out.println("Invalid USSD Code! Please try again.\n");
                    }
                }
                showMainMenu();
            }
            public static void showMainMenu() {
                System.out.println("\n* Load Registration ");
                System.out.println("[1] Go+");
                System.out.println("[2] Go");
                System.out.println("[3] GoEXTRA");
                System.out.println("[4] UNLI 5G");
                System.out.println("[5] ALLNET");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        goPlusMenu();
                        break;
                    case 2:
                        goMenu();
                        break;
                    case 3:
                        goExtraMenu();
                        break;
                    case 4:
                        unli5GMenu();
                        break;
                    case 5:
                        allNetMenu();
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            public static void goPlusMenu() {
                System.out.println("\n Go+ Promos ");
                System.out.println("[1] Go+99");
                System.out.println("[2] Go+129");
                System.out.println("[3] Go+149");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        promoDetails("Go+99", "Get 8GB for all sites + 8GB");
                        break;
                    case 2:
                        promoDetails("Go+129", "Get 10GB for all sites + 10GB");
                        break;
                    case 3:
                        promoDetails("Go+149", "Get 12GB for all sites + 12GB");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            public static void goMenu() {
                System.out.println("\n Go Promos ");
                System.out.println("[1] Go50");
                System.out.println("[2] Go90");
                System.out.println("[3] Go120");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        promoDetails("Go50", "Enjoy mobile data package");
                        break;
                    case 2:
                        promoDetails("Go90", "Enjoy mobile data package");
                        break;
                    case 3:
                        promoDetails("Go120", "Enjoy mobile data package");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            public static void goExtraMenu() {
                System.out.println("\n GoEXTRA Promos ");
                System.out.println("[1] GoEXTRA99");
                System.out.println("[2] GoEXTRA129");
                System.out.println("[3] GoEXTRA149");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        promoDetails("GoEXTRA99", "Data + Extra Benefits");
                        break;
                    case 2:
                        promoDetails("GoEXTRA129", "Data + Extra Benefits");
                        break;
                    case 3:
                        promoDetails("GoEXTRA149", "Data + Extra Benefits");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            public static void unli5GMenu() {
                System.out.println("\n UNLI 5G Promos ");
                System.out.println("[1] UNLI 5G 99");
                System.out.println("[2] UNLI 5G 149");
                System.out.println("[3] UNLI 5G 199");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        promoDetails("UNLI 5G 99", "Unlimited 5G Access");
                        break;
                    case 2:
                        promoDetails("UNLI 5G 149", "Unlimited 5G Access");
                        break;
                    case 3:
                        promoDetails("UNLI 5G 199", "Unlimited 5G Access");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            public static void allNetMenu() {
                System.out.println("\n ALLNET Promos ");
                System.out.println("[1] ALLNET99");
                System.out.println("[2] ALLNET149");
                System.out.println("[3] ALLNET199");
                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        promoDetails("ALLNET99", "All Network Calls & Texts");
                        break;
                    case 2:
                        promoDetails("ALLNET149", "All Network Calls & Texts");
                        break;
                    case 3:
                        promoDetails("ALLNET199", "All Network Calls & Texts");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            public static void promoDetails(String promoName, String details) {
                System.out.println("\n " + promoName + " Promo ***");
                System.out.println("- " + details);
                System.out.println("[1] Subscribe");
                System.out.println("[2] Exit");
                System.out.print("Choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You are now subscribed to " + promoName);
                        break;
                    case 2:
                        System.out.println("Program terminated.");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }


}
