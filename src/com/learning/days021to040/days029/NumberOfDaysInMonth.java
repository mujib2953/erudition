package com.learning.days021to040.days029;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(
        final int year
    ) {
        boolean isYearValid = (year >= 1 && year <= 9999);
        boolean isItLeapYear = false;

        if (!isYearValid) {
            return isItLeapYear;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isItLeapYear = true;
                }
            } else {
                isItLeapYear = true;
            }
        }
        return isItLeapYear;
    }

    public static int getDaysInMonth(
        final int month,
        final int year
    ) {
        boolean isMonthValid = (month >= 1 && month <= 12);
        boolean isYearValid = (year >= 1 && year <= 9999);

        if (!isMonthValid || !isYearValid) {
            return -1;
        }

        boolean isItLeapYear = isLeapYear(year);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return (isItLeapYear) ? 29 : 28;

            default:
                return -1;
        }
    }
}
