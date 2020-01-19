package com.learning.days021to040.days038;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int givenNumber = number;

        while (givenNumber != 0) {
            int leastSignificantDigit = givenNumber % 10;

            if(isEven(leastSignificantDigit)) {
                sum += leastSignificantDigit;
            }

            givenNumber /= 10;
        }

        return sum;
    }

    public static boolean isEven(
        final int number
    ) {
        return (number % 2 == 0);
    }
}
