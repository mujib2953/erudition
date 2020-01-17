package com.learning.days001to020.days008;

public class StringDataType {
    public static void main(String[] args) {

        String myString = "This is a String..";
        System.out.println("My string is = " + myString);

        myString += ", this is more string.";

        myString += " \u00A9 2019";
        System.out.println("My string is = " + myString);

        // --- numbers in the string formats
        String myNumberString = "250.55";
        myNumberString += "49.45";
        System.out.println("My Number string is = " + myNumberString);

        int myInt = 10;
        String lastString = "50";

        lastString += myInt;
        System.out.println("My last string is = " + lastString);

    }
}
