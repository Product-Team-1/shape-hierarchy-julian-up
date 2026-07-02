package com.example.project;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        // Edge case: negative dimensions are treated as 0
        this.radius = Math.max(0, radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
