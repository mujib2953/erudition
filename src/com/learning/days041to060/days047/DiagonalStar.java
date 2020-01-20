package com.learning.days041to060.days047;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
    }

    public static void printSquareStar(
        final int number
    ) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                int limit = (number - 1);
                if (
                    (row == 0 || row == limit) ||
                    (col == 0 || col == limit) ||
                    (row == col) ||
                    (limit - row ) == col
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
