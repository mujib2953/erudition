package com.learning.Days017;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(
        double number_1,
        double number_2
    ) {
        int number1 = (int) (number_1 * 1000);
        int number2 = (int) (number_2 * 1000);

        return (number1 == number2);
    }
}
