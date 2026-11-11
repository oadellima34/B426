package com.joysistvi.day22.Inheritance;

public class Ballpen extends Pen{
    private double pointSize;

    public Ballpen(String brand, String color,
                   double pointSize, double weightInGrams) {

        super(brand, color, weightInGrams);
        this.pointSize = pointSize;
    }

    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing smoothly with a ballpen.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nType: Ballpen" +
                "\nPoint Size: " + pointSize;
    }
}
