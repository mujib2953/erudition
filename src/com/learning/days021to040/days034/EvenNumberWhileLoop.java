package com.learning.days021to040.days034;

public class EvenNumberWhileLoop {
    public static void main(String[] args) {
        System.out.println(sumEven(1, 100));
        System.out.println(sumEven(-1, 100));
        System.out.println(sumEven(100, 100));
        System.out.println(sumEven(13, 13));
        System.out.println(sumEven(100, -100));
        System.out.println(sumEven(100, 1000));
    }

    public static boolean isEven(
        final int number
    ) {
        if (number < 0) {
            return false;
        }
        return (number % 2 == 0);
    }

    public static int sumEven(
        final int start,
        final int end
    ) {
        if (start < 0 || end < 0) {
            return -1;
        }

        if (start > end) {
            return -1;
        }

        int sum = 0;
        int count = 0;

        int startingPoint = start;

        while (startingPoint <= end) {

            if (isEven(startingPoint)) {
                sum += startingPoint;
                count++;
            }
            startingPoint++;
        }

        System.out.println("Found " + count + " even numbers.");
        return sum;
    }
}
