Array Challenge
--

#### Problem statement:

Create a program using **arrays** that **sort** a list of **integers** in **descending order**. Descending order means highest value to lowest value.

In other words, if the array had the values in it **106, 26, 81, 5, 15** your program should ultimately have an **array** with **106, 81, 26, 15, 4** in it.

Set up a program so that numbers to **sort** are read in from **keyboard**.

Implement the following methods:
- **getInteger** returns an array of entered **integers** from **keyboard**.
- **printArray** prints out the **content of the array**.
- and **sortIntegers** should **sort** the array and **return a new array** containing a sorted numbers.

#### Solution:
**ArrayDriver.java**
```java
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
```

#### Explanation:

- Code is self explanatory.

#### Output
 ```
Enter 5 integers value. 
Enter 1 value : 50
Enter 2 value : 160
Enter 3 value : 40
Enter 4 value : 23
Enter 5 value : 200
Element at 1 is 50
Element at 2 is 160
Element at 3 is 40
Element at 4 is 23
Element at 5 is 200
===Performing Sort===
Element at 1 is 200
Element at 2 is 160
Element at 3 is 50
Element at 4 is 40
Element at 5 is 23
```