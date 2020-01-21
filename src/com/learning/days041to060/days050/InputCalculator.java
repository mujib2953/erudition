package com.learning.days041to060.days050;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg;
        int count = 0;

        while (true) {

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                count++;

                sum += input;
            } else {
                break;
            }
        }
        avg = Math.round((double) sum /(double) count);

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) avg));
    }
}
