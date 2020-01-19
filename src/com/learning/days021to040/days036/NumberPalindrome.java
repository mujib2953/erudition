package com.learning.days021to040.days036;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(
        final int number
    ) {
        return (reverseNumber(number) == number);
    }

    public static int reverseNumber(
        final int number
    ) {
        int givenNumber = number;
        int reversedNumber = 0;

        while (givenNumber != 0) {

            int leastSignificantDigit = givenNumber % 10;
            reversedNumber = (reversedNumber * 10) + leastSignificantDigit;

            givenNumber /= 10;
        }

        return reversedNumber;
    }
}
