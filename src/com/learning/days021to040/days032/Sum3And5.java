package com.learning.days021to040.days032;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (count >= 5) {
                System.out.println("Sum = " + sum);
                break;
            }
        }
    }
}
