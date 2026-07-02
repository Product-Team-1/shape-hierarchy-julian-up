package com.example.project;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        // Edge case: negative dimensions are treated as 0
        this.base = Math.max(0, base);
        this.height = Math.max(0, height);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
