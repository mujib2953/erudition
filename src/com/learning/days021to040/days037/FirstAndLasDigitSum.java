package com.learning.days021to040.days037;

public class FirstAndLasDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;
        int inputNumber = number;

        while (inputNumber != 0) {
            lastDigit = inputNumber % 10;
            inputNumber /= 10;
        }

        return (firstDigit + lastDigit);
    }
}
