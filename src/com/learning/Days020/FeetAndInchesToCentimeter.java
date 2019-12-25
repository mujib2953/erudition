package com.learning.Days020;

public class FeetAndInchesToCentimeter {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(102);
        calcFeetAndInchesToCentimeters(200);
    }

    private static double calcFeetAndInchesToCentimeters(
        final double feet,
        final double inches
    ) {
        boolean isFeetValid = (feet > 0);
        boolean isInchesValid = (inches >= 0 && inches <= 12);

        if (isFeetValid && isInchesValid) {
            double cm = (feet * 12) * 2.54;
            cm += (inches * 2.54);

            System.out.println(
                feet + " feet, " +
                inches + " inches = " +
                cm + " centimeters"
            );
            return cm;
        } else {
            System.out.println("Invalid feet or inches parameter.");
        }

        return -1;
    }

    private static double calcFeetAndInchesToCentimeters(
        final double inches
    ) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);

        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
