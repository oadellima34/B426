package com.joysistvi.day22.Inheritance;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println(" PEN INFORMATION SYSTEM");
        System.out.println("==================================");

        // BALLPEN INPUT
        System.out.println("\nEnter Ballpen Details");

        System.out.print("Brand: ");
        String bpBrand = scanner.nextLine();

        System.out.print("Color: ");
        String bpColor = scanner.nextLine();

        System.out.print("Point Size: ");
        double pointSize = scanner.nextDouble();

        System.out.print("Weight in Grams: ");
        double bpWeight = scanner.nextDouble();
        scanner.nextLine();

        Ballpen ballpen = new Ballpen(
                bpBrand,
                bpColor,
                pointSize,
                bpWeight
        );

        // MARKER INPUT
        System.out.println("\nEnter Marker Details");

        System.out.print("Brand: ");
        String markerBrand = scanner.nextLine();

        System.out.print("Color: ");
        String markerColor = scanner.nextLine();

        System.out.print("Weight in Grams: ");
        double markerWeight = scanner.nextDouble();

        System.out.print("Permanent (true/false): ");
        boolean permanent = scanner.nextBoolean();

        Marker marker = new Marker(
                markerBrand,
                markerColor,
                markerWeight,
                permanent
        );

        // OUTPUT
        System.out.println("\n==================================");
        System.out.println(" BALLPEN INFORMATION");
        System.out.println("==================================");
        System.out.println(ballpen);
        ballpen.write();

        System.out.println("\n==================================");
        System.out.println(" MARKER INFORMATION");
        System.out.println("==================================");
        System.out.println(marker);
        marker.write();

        // POLYMORPHISM DEMONSTRATION
        System.out.println("\n==================================");
        System.out.println(" POLYMORPHISM DEMONSTRATION");
        System.out.println("==================================");

        Pen[] pens = {ballpen, marker};

        for (Pen pen : pens) {
            System.out.println("\n" + pen);
            pen.write();
        }

        scanner.close();
    }
}
