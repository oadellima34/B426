package com.joysistvi.day10;
import java.util.Scanner;
public class Activity7_Dellima1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter the multiplication table you want to display: ");
        int number = input.nextInt();

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        input.close();
    }
}
