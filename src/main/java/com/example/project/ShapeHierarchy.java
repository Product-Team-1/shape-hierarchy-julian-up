package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class ShapeHierarchy {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2, 5));
        shapes.add(new Triangle(4, 6));

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
