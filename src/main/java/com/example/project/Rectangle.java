package com.example.project;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // Edge case: negative dimensions are treated as 0
        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
