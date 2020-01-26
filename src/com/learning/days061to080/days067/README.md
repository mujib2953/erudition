Array Min Element Challenge
--

#### Problem statement:

Write a method called **readIntegers()** with a parameter called **count** that represents how many **integers** the user needs to enter.

The method needs to **read** from the **console** until all the numbers are entered, and then **return an array** containing the numbers entered.

Write a method **findMin()** with the **array** as a parameter. The method needs to return the **minimum** value in the array.

In the **main()** method read the **count** from the console and call the method **readIntegers()** with the count parameter. 

Then call the **findMin()** method passing the array returned from the call to the **readIntegers()** method.

Finally, print the **minimum** element in the array.


#### Solution:
**ArrayMin.java**
```java
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
```

#### Explanation:

- Code is self explanatory.

#### Output
 ```
Enter the size of an array : 5
Enter value for 1 position : 48
Enter value for 2 position : 26
Enter value for 3 position : 28
Enter value for 4 position : 47
Enter value for 5 position : 82
Minimum value is 26
```