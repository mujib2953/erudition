package com.learning.Days005;

public class PrimitiveTypeChallenge {
    public static void main(String[] args) {

        byte myByte = 15;
        short myShort = 25;
        int myInt = 50;

        long myLong = 5000L + 10L * (myByte + myShort + myInt);

        System.out.println("Output is = " + myLong);

    }
}
