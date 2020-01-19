Sum Odd Challenge
--

#### Problem statement:

- Write a method called **isEven** with an **int** parameter and call it **number**.
- The method need to **return a boolean**.
- Check that **number** is **0 <**, if it is not **return false**
- If **number** is **even** return **true**, otherwise return **false**.
- Write second method called **sumEven** that has **2 int** parameters **start** and **end**, which represent a **range of numbers**.
- The method should use a **while loop** to **sum all even numbers** in that range including the end and **return the sum**.
- It should call the method **isEven** to check if each number is even
- The parameter end needs to be **greater than or equal to the start** and both **start and end parameter have to be greater that 0**.
- If those conditions are not satisfied **return -1** from the method indicate **invalid value**.
- Also print the **count** of all even number found.

#### Solution:
**EvenNumberWhileLoop.java**
```java
package com.learning.days021to040.days034;

public class EvenNumberWhileLoop {
    public static void main(String[] args) {
        System.out.println(sumEven(1, 100));
        System.out.println(sumEven(-1, 100));
        System.out.println(sumEven(100, 100));
        System.out.println(sumEven(13, 13));
        System.out.println(sumEven(100, -100));
        System.out.println(sumEven(100, 1000));
    }

    public static boolean isEven(
        final int number
    ) {
        if (number < 0) {
            return false;
        }
        return (number % 2 == 0);
    }

    public static int sumEven(
        final int start,
        final int end
    ) {
        if (start < 0 || end < 0) {
            return -1;
        }

        if (start > end) {
            return -1;
        }

        int sum = 0;
        int count = 0;

        int startingPoint = start;

        while (startingPoint <= end) {

            if (isEven(startingPoint)) {
                sum += startingPoint;
                count++;
            }
            startingPoint++;
        }

        System.out.println("Found " + count + " even numbers.");
        return sum;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
Found 50 even numbers.
2550

-1

Found 1 even numbers.
100

Found 0 even numbers.
0

-1

Found 451 even numbers.
248050
```