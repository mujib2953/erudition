Sum Odd Challenge
--

#### Problem statement:

- Write a method called **isOdd** with an **int** parameter and call it **number**.
- The method need to **return a boolean**.
- Check that **number** is **0 <**, if it is not **return false**
- If **number** is **odd** return **true**, otherwise return **false**.
- Write second method called **sumOdd** that has **2 int** parameters **start** and **end**, which represent a **range of numbers**.
- The method should use a **for loop** to **sum all odd numbers** in that range including the end and **return the sum**.
- It should call the method **isOdd** to check if each number is odd
- The parameter end needs to be **greater than or equal to the start** and both **start and end parameter have to be greater that 0**.
- If those conditions are not satisfied **return -1** from the method indicate **invalid value**.

```
- Example
	- sumOdd(1, 100)		=> 2500
	- sumOdd(-1, 100)		=> -1
	- sumOdd(100, 100)		=> 0
	- sumOdd(13, 13)		=> 13
	- sumOdd(100, -100)		=> -1
	- sumOdd(100, 1000)		=> 247500
```

#### Solution:
**SumOdd.java**
```java
package com.learning.days021to040.days033;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(
        final int number
    ) {
        if (number > 0) {
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd(
        final int start,
        final int end
    ) {
        if (start < 0 || end < 0) {
            return -1;
        }

        if (end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
2500
-1
0
13
-1
247500
```