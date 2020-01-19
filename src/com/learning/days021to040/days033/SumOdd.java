package com.learning.days021to040.days033;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(
        final int number
    ) {
        if (number > 0) {
            return false;
        }

        return (number % 2 != 0);
    }

    public static int sumOdd(
        final int start,
        final int end
    ) {
        if (start < 0 || end < 0) {
            return -1;
        }

        if (end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
