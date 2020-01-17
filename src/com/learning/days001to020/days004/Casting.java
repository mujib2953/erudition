package com.learning.days001to020.days004;

public class Casting {
    public static void main(String[] args) {

        byte myMinByte = Byte.MIN_VALUE;
        short myMinShort = Short.MIN_VALUE;
        int myMinInt = Integer.MIN_VALUE;

        int myInt = (myMinInt / 2); // --- does not throw any error

        // byte myByte = (myMinByte / 2); // --- will throws an error, like require byte but getting int
        byte myByte = (byte) (myMinByte / 2); // -- this is casting the output

        // short myShort = (myMinShort / 2); // --- will throws an error, like require short but getting int
        short myShort = (short) (myMinShort / 2); // --this casting

    }
}
