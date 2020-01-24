package com.learning.days041to060.days060;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
