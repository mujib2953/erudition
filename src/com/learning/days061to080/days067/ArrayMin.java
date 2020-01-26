package com.learning.days061to080.days067;

import java.util.Scanner;

public class ArrayMin {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        int arraySize = scanner.nextInt();
        int[] myIntegers = readIntegers(arraySize);

        int minValueInArray = findMin(myIntegers);

        System.out.println("Minimum value is " + minValueInArray);

    }

    private static int[] readIntegers(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for " + (i + 1) + " position : ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }
}
