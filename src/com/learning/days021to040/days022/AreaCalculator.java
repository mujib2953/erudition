package com.learning.days021to040.days022;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(
        final double radius
    ) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * area(radius, radius);
    }

    public static double area(
        final double x,
        final double y
    ) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
