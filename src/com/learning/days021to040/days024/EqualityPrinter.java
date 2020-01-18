package com.learning.days021to040.days024;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(
        final int a,
        final int b,
        final int c
    ) {
        String message;
        if (a < 0 || b < 0 || c < 0) {
            message = "Invalid Value";
        } else if(a == b && b == c) {
            message = "All numbers are equal";
        } else if (a != b && b != c) {
            message = "All numbers are different";
        } else {
            message = "Neither all are equal or different";
        }

        System.out.println(message);
    }
}
