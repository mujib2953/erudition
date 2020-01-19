Greatest Common Divisor Challenge
--

#### Problem statement:

- Write a method named **getGreatestCommonDivisor** with **two parameters** of type **int** named **first** & **second**.
- If one of the parameter is **< 10**, the method should **return -1** to indicate an **invalid value**.
- The method should return the **greatest common divisor** of the two numbers.
- The greatest common divisor is the largest positive integer that can **fully divide each of the integers** (i.e. without leaving a reminder)
- For example **12** and **30**
	- 12 can be divided by 1, 2, 3, 4, **6**, 12
	- 30 can be divided by 1, 2, 3, 5, **6**, 10, 15, 30	
	- The greatest common divisor is **6** since both **12** and **30** can be divide by **6**, and there is no resulting reminder.

```
- Example
	- getGreatestCommonDivisor(25, 15)	=> 5
	- getGreatestCommonDivisor(12, 30)	=> 6
	- getGreatestCommonDivisor(9, 18)	=> -1
	- getGreatestCommonDivisor(18, 153)	=> 9
```

#### Solution:
**GreatestCommonDivisor.java**
```java
package com.learning.days041to060.days041;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(18, 153));
    }

    public static int getGreatestCommonDivisor(
        final int firstNumber,
        final int secondNumber
    ) {
        if (firstNumber < 10 || secondNumber < 10) {
            return -1;
        }

        int smallestNumber = firstNumber;
        int gcd = 1;

        if (smallestNumber > secondNumber) {
            smallestNumber = secondNumber;
        }

        for (int i = 2; i <= smallestNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
5
6
-1
9
```