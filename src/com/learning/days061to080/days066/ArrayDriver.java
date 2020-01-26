package com.learning.days061to080.days066;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDriver {

    private static Scanner scanner = new Scanner(System.in);
    private static final int CAPACITY = 5;

    public static void main(String[] args) {

        // --- we can read the capacity from user but for now reading from constant
        int[] myIntegers = getIntegers(CAPACITY);
        printArray(myIntegers);

        System.out.println("===Performing Sort===");
        int[] sortedIntegers = sortArray(myIntegers);
        printArray(sortedIntegers);

    }

    private static int[] getIntegers(int capacity) {
        int[] integers = new int[capacity];

        System.out.println("Enter " + capacity + " integers value. \r");

        for (int i = 0; i < integers.length; i++) {
            System.out.print("Enter " + (i + 1) + " value : ");
            integers[i] = scanner.nextInt();
        }

        return integers;
    }

    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + (i + 1) + " is " + array[i]);
        }
    }

    private static int[] sortArray(int[] array) {
        // --- created copy
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean iterate = true;
        int temp;

        while (iterate) {
            iterate = false;

            for (int i = 0; i < (sortedArray.length - 1); i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {

                    // --- swapping of data
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;

                    iterate = true;
                }
            }
        }

        return sortedArray;
    }
}
