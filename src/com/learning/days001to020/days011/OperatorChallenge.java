package com.learning.days001to020.days011;

public class OperatorChallenge {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 40.00d;

        double result = (firstDouble + secondDouble) * 100.00d;

        double reminder = result % 40.00d;
        boolean isZeroReminder = (reminder == 0);

        if (!isZeroReminder) {
            System.out.println("Got Some Reminder");
        } else {
            System.out.println("Yippee, We Got NO Reminder");
        }
    }
}
