package com.joysistvi.day5.operator;

public class Activity3_Dellima {
    public static void main(String[] args) {
        // Activity 3 Java Logical and Ternary Operators

        int age = 15;
        boolean hasValidID = true;

        String result1 = (age >= 18 && hasValidID)
                ? "You are allowed to enter the event."
                : "You are not allowed to enter the event.";

        System.out.println(result1);

        // Activity 4: Logical OR Operator

        boolean isWeekend = true;
        boolean isHoliday = false;

        String result2 = (isWeekend || isHoliday)
                ? "No classes today."
                : "There are classes today.";

        System.out.println(result2);

        // Activity 5: Ternary Operator

        int score = 88;

        String result3 = (score >= 75)
                ? "Passed"
                : "Failed";

        System.out.println(result3);

        // Activity 6: Ternary Operator

        int num = 35;
        int num2 = 50;

        String result4 = (num > num2)
                ? num + " is the larger number."
                : (num2 > num)
                ? num2 + " is the larger number."
                : "Both numbers are equal.";

        System.out.println(result4);
    }
    }

