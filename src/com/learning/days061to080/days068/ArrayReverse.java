package com.learning.days061to080.days068;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};

        System.out.println("Before reverse method array is \n");
        printArray(array);

        reverse(array);

        System.out.println("After reverse method array is \n");
        printArray(array);
    }

    private static void reverse(int[] array) {

        int halfSize = array.length / 2;
        int maxIndex = array.length - 1;
        int temp;

        for (int i = 0; i < halfSize; i++) {
            temp = array[i];
            array[i] = array[maxIndex- i];
            array[maxIndex - i] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at " + (i + 1) + " is " + array[i]);
        }
        System.out.println();
    }
}
