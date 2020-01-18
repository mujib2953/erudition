package com.learning.days021to040.days031;

public class FindPrimeNumber {
    public static void main(String[] args) {
        for (
            int i = 1;
            i <= 100;
            i++
        ) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(
        final int number
    ) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number /2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
