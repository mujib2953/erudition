package com.learning.days041to060.days046;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        for (int i = number; i >= 2; i--) {
            if (isPrime(i) && (number % i == 0)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(
        final int number
    ) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
