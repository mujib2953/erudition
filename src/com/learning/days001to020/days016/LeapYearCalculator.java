package com.learning.days001to020.days016;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        boolean isYearWithinRange = year > 0 && year <= 9999;
        boolean isLeapYearBoolean = false;

        if (
            isYearWithinRange &&
            year % 4 == 0
        ) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYearBoolean = true;
                }
            } else {
                isLeapYearBoolean = true;
            }
        }
        return isLeapYearBoolean;
    }
}
