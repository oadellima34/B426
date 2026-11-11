package com.joysistvi.day23.Activity;

public class Pen {
    private String brand;
    private String color;
    private double weightInGrams;

    public Pen(String brand, String color, double weightInGrams) {
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void write() {
        System.out.println("Writing with a pen.");
    }

    // NEW METHOD
    public void refill() {
        System.out.println("Refilling the pen.");
    }

    // OVERLOADED METHODS
    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for(int i = 0; i < times; i++) {
            write(text);
        }
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                "\nColor: " + color +
                "\nWeight in Grams: " + weightInGrams;
    }
}
