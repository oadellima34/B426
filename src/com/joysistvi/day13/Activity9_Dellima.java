package com.joysistvi.day13;
import java.util.Scanner;
public class Activity9_Dellima {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays
        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];

        // Input subject names
        System.out.println("\nEnter Subject Names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = sc.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < students; i++) {
            System.out.print("\nEnter student name: ");
            studentNames[i] = sc.nextLine();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Grade in " + subjectNames[j] + ": ");
                grades[i][j] = sc.nextDouble();
            }
            sc.nextLine(); // consume newline
        }

        // Display Grades Report
        System.out.println("\n========== GRADES REPORT ==========");

        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        // Calculate and display averages
        for (int i = 0; i < students; i++) {
            double total = 0;

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12.2f", grades[i][j]);
                total += grades[i][j];
            }

            double average = total / subjects;
            System.out.printf("%-10.2f%n", average);
        }

        sc.close();
    }
}
