package com.learning.days041to060.days048;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter number #" + (count + 1) + " : ");
            if (scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }

            if (count == 10) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
