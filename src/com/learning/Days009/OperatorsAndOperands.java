package com.learning.Days009;

public class OperatorsAndOperands {
    public static void main(String[] args) {

        int result = 1 + 2; // --- 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result is = " + previousResult);

        result -= 1; // --- 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        System.out.println("Previous result is = " + previousResult);

        result *= 10; // --- 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result /= 5; // --- 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result %= 3; // --- 4 % 3 = 1
        System.out.println("4 % 3 = " + result);
    }
}
