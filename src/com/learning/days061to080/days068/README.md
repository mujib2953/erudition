Array Reverse Challenge
--

#### Problem statement:

Write a method called **reverse()** with an **int array** as a parameter.

The method should **not** return any value. In other words, the method is allowed to modify the array parameter.

In **main()** test the **reverse()** method and **print** the array both **reversed** and **non-reversed**.

To **reverse** the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

For example, if the array is **{1, 2, 3, 4, 5}**, then the **reversed** array is **{5, 4, 3, 2, 1}**.


#### Solution:
**ArrayReverse.java**
```java
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
```

#### Explanation:

- Code is self explanatory.

#### Output
 ```
Before reverse method array is 

Element at 1 is 1
Element at 2 is 5
Element at 3 is 3
Element at 4 is 7
Element at 5 is 11
Element at 6 is 9
Element at 7 is 15

After reverse method array is 

Element at 1 is 15
Element at 2 is 9
Element at 3 is 11
Element at 4 is 7
Element at 5 is 3
Element at 6 is 5
Element at 7 is 1
```