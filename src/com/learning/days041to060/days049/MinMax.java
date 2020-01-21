package com.learning.days041to060.days049;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter Number : ");

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                min = Math.min(input, min);
                max = Math.max(input, max);
            } else {
                System.out.println("MIN = " + min);
                System.out.println("MAX = " + max);
                break;
            }

        }
    }
}
