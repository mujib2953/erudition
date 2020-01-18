package com.learning.days021to040.days023;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(
        final long minutes
    ) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / (365 * 24 * 60);
            long remainingYears = minutes % (365 * 24 * 60);

            long remainingDays = remainingYears / (24 * 60);

            System.out.println(
                minutes + " min = " +
                year + " y and " +
                remainingDays + " d"
            );
        }
    }
}
