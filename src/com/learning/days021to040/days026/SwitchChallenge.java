package com.learning.days021to040.days026;

public class SwitchChallenge {

    private static String NOT_FOUND = "Not Found.";

    public static void main(String[] args) {
        char inputChar = 'A';

        switch (inputChar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(inputChar + " is Found.");
            break;
            default:
                System.out.println(NOT_FOUND);
        }
    }
}
