package com.learning.days001to020.days006;

public class Pounds2Kgs {
    static final double onePoundToKgs = 0.45359237d;

    public static void main(String[] args) {
        double numberOfPounds = 200d;

        double convertedToKgs = numberOfPounds * Pounds2Kgs.onePoundToKgs;

        System.out.println( numberOfPounds + " pounds are equals to " + convertedToKgs);
    }
}
