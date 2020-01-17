package com.learning.days001to020.days003;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println(" ------------- Byte -------------- ");
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte MIN Value \t= " + myMinByteValue);
        System.out.println("Byte MAX Value \t= " + myMaxByteValue);

        System.out.println("Byte Busted MIN Value \t= " + (myMinByteValue - 1));
        System.out.println("Byte Busted MAX Value \t= " + (myMaxByteValue + 1));

        System.out.println(" ----------- Short ---------------- ");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short MIN Value \t= " + myMinShortValue);
        System.out.println("Short MAX Value \t= " + myMaxShortValue);

        System.out.println("Short Busted MIN Value \t= " + (myMinShortValue - 1));
        System.out.println("Short Busted MAX Value \t= " + (myMaxShortValue + 1));

        System.out.println(" ------------ Integer --------------- ");

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN Value \t= " + myMinIntValue);
        System.out.println("Integer MAX Value \t= " + myMaxIntValue);

        System.out.println("Integer Busted MIN Value \t= " + (myMinIntValue - 1));
        System.out.println("Integer Busted MAX Value \t= " + (myMaxIntValue + 1));

        int myMaxInt = 2_147_483_647; // --- if we just add one in the value to make it 2_147_483_648, we will get compiler error "Integer number too large."

        System.out.println(" -------------- Long ------------- ");

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long MIN Value \t= " + myMinLongValue);
        System.out.println("Long MAX Value \t= " + myMaxLongValue);

        System.out.println("Long Busted MIN Value \t= " + (myMinLongValue - 1));
        System.out.println("Long Busted MAX Value \t= " + (myMaxLongValue + 1));

        System.out.println(" -------------------------------- ");


    }
}
