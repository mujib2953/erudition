package com.learning.days001to020.days002;

public class Expression {
    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("My Total is  = " + myTotal);

        int myLastNumber = 1000 - myTotal;
        System.out.println("My Last Number is = " + myLastNumber);

    }
}
