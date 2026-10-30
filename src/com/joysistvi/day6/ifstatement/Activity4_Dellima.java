package com.joysistvi.day6.ifstatement;

import java.util.Scanner;

public class Activity4_Dellima {
    public  static void main(String args[]) {
        //AGE CATEGORIZER

        int age = 23;

        // Validate age identifier

        if (age < 0 || age > 100) {
            System.out.println("Invalid Age");
            return;
        }

        // Age Categories

        if (age >= 0 && age <= 2) {
            System.out.println("Age: " + age);
            System.out.println("Category: Baby");
        } else if (age >= 3 && age <= 12) {
            System.out.println("Age: " + age);
            System.out.println("Category: Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Age: " + age);
            System.out.println("Category: Teenager");
        } else if (age >= 20 && age <= 29) {
            System.out.println("Age: " + age);
            System.out.println("Category: Young Adult");
        } else if (age >= 30 && age <= 59) {
            System.out.println("Age: " + age);
            System.out.println("Category: Adult");
        } else {
            System.out.println("Age: " + age);
            System.out.println("Category: Senior");
        }
    }
}
