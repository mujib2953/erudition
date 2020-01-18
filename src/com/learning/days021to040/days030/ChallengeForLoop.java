package com.learning.days021to040.days030;

public class ChallengeForLoop {

    private static final double AMOUNT = 10000d;

    public static void main(String[] args) {
        for (int i = 2; i <= 8; i++) {
            System.out.println(
                "10, 000 at " +
                i + "% interest = " +
                String.format("%.2f", calculateInterest(AMOUNT, (double) i))
            );
        }
    }

    public static double calculateInterest(
        final double amount,
        final double interestRate
    ) {
        return amount * (interestRate / 100);
    }
}
