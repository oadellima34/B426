package com.joysistvi.day3.variable;

public class Activity2_Dellima {
    public static void main(String[] args) {
        // Given values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculate percentages relative to income
        double foodPercent = (foodAllowance / income) * 100;
        double transportPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Calculate total expenses and remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display results with rounding using printf
        System.out.printf("Income: %.2f%n", income);
        System.out.printf("Food Allowance: %.1f %% %n", foodPercent);
        System.out.printf("Transportation: %.1f %% %n", transportPercent);
        System.out.printf("Rent: %.1f %% %n", rentPercent);
        System.out.printf("Utility Bill: %.1f %% %n", utilityPercent);

        System.out.printf("Total Expenses: %.2f%n", totalExpenses);
        System.out.printf("Remaining Balance: %.2f%n", remainingBalance);

    }
}
