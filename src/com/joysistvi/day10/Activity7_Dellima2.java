package com.joysistvi.day10;

public class Activity7_Dellima2 {
    public static void main(String[] args) {

        // Outer loop for the table number
        for (int table = 1; table <= 10; table++) {

            System.out.println("Multiplication Table of " + table);

            // Inner loop for the multiplier
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(table + " x " + multiplier + " = " + (table * multiplier));
            }

            // Blank line between tables
            System.out.println();
        }
    }
}
