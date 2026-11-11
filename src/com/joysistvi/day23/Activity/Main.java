package com.joysistvi.day23.Activity;

public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Pen pen1 = new Pen(
                "Generic",
                "Blue",
                15
        );

        Pen pen2 = new Ballpen(
                "Pilot",
                "Black",
                0.7,
                20
        );

        Pen pen3 = new Marker(
                "Sharpie",
                "Red",
                25,
                true
        );

        System.out.println("----- Pen -----");
        pen1.write();
        pen1.refill();

        System.out.println("\n----- Ballpen -----");
        pen2.write();
        pen2.refill();

        System.out.println("\n----- Marker -----");
        pen3.write();
        pen3.refill();

        System.out.println("\n========================");
        System.out.println("Testing testPen Method");
        System.out.println("========================");

        testPen(pen1);
        testPen(pen2);
        testPen(pen3);

        System.out.println("\n========================");
        System.out.println("Method Overloading Demo");
        System.out.println("========================");

        pen2.write("Hello");

        System.out.println();

        pen2.write("Hello", 3);
    }

    public static void testPen(Pen pen) {

        System.out.println("\n--------------------");
        System.out.println(pen);
        pen.write();
        pen.refill();
    }

    /*
     * Method Overloading occurs when methods have
     * the same name but different parameter lists.
     * It is resolved during compile time.
     *
     * Method Overriding occurs when a child class
     * provides its own implementation of a parent
     * class method. It is resolved during runtime.
     */
}
