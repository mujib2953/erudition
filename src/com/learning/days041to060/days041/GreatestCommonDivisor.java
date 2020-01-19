package com.learning.days041to060.days041;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(18, 153));
    }

    public static int getGreatestCommonDivisor(
        final int firstNumber,
        final int secondNumber
    ) {
        if (firstNumber < 10 || secondNumber < 10) {
            return -1;
        }

        int smallestNumber = firstNumber;
        int gcd = 1;

        if (smallestNumber > secondNumber) {
            smallestNumber = secondNumber;
        }

        for (int i = 2; i <= smallestNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
