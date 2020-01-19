package com.learning.days021to040.days040;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(1, 1, 2));
    }

    public static boolean isValid(
        final int number
    ) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(
        final int number1,
        final int number2,
        final int number3
    ) {

        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number3LastDigit = number3 % 10;

        return (
            number1LastDigit == number2LastDigit ||
            number2LastDigit == number3LastDigit ||
            number3LastDigit == number1LastDigit
        );
    }
}
