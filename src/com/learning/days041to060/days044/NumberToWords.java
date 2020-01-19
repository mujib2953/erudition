package com.learning.days041to060.days044;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static int reverse(
        final int number
    ) {
        int givenNumber = number;
        int reverseNumber = 0;

        while (givenNumber != 0) {
            int leastSignificantDigit = givenNumber % 10;

            reverseNumber = (reverseNumber * 10) + leastSignificantDigit;
            givenNumber /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        int givenNumber = number;
        while (givenNumber != 0) {
            digitCount++;
            givenNumber /= 10;
        }

        return digitCount;
    }

    public static void numberToWords(
        final int number
    ) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println(getWords(number));
            return;
        }

        int reversedNumber = reverse(number);
        int numbersCount = getDigitCount(number);
        int reversedNumberCount = getDigitCount(reversedNumber);
        String valueInWords = "";

        while (reversedNumber != 0) {
            int leastSignificantDigit = reversedNumber % 10;
            valueInWords += (" " + getWords(leastSignificantDigit));

            reversedNumber /= 10;
        }

        if (numbersCount != reversedNumberCount) {
            while ((numbersCount - reversedNumberCount) != 0) {
                valueInWords += (" " + getWords(0));
                numbersCount--;
            }
        }

        System.out.println(valueInWords);

    }

    public static String getWords(
        final int number
    ) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return  "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid Value";
        }
    }
}
