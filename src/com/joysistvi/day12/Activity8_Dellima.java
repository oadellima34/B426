package com.joysistvi.day12;
import java.util.Scanner;
public class Activity8_Dellima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];

        int sum = 0;
        double average;

        // Ask the user to input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Display all the numbers entered
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Compute and display the sum and average
        average = (double) sum / numbers.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}
