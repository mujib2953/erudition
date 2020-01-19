package com.learning.days021to040.days035;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(1));
        System.out.println(sumDigit(-125));
        System.out.println(sumDigit(32123));
    }

    public static int sumDigit(
        final int number
    ) {
        if (number < 10) {
            return -1;
        }

        int givenNumber = number;
        int sum = 0;

        while(givenNumber != 0) {
            int leastSignificantDigit = givenNumber % 10;
            sum += leastSignificantDigit;
            givenNumber /= 10;
        }
        return sum;
    }
}
