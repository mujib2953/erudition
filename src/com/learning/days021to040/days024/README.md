Equality Printer Challenge
--

#### Problem statement:

- Write a method **printEqual** with **3 params** of type **int**. The method should **not return** anything.
- If **one of the params** is **less than 0**, print **Invalid Value**
- If **all numbers** are **equal**, print **All numbers are equal**
- If **all numbers** are **different**, print **All numbers are different**
- Otherwise, print **Neither all are equal or different**
    
```
- Example
	- printEqual(1, 1, 1)	=> All numbers are equal
	- printEqual(1, 1, 2)	=> Neither all are equal or different
	- printEqual(-1, -1, -1)=> Invalid Value
	- printEqual(1, 2, 3)	=> All numbers are different
```

#### Solution:
**EqualityPrinter.java**
```java
package com.learning.days021to040.days024;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(
        final int a,
        final int b,
        final int c
    ) {
        String message;
        if (a < 0 || b < 0 || c < 0) {
            message = "Invalid Value";
        } else if(a == b && b == c) {
            message = "All numbers are equal";
        } else if (a != b && b != c) {
            message = "All numbers are different";
        } else {
            message = "Neither all are equal or different";
        }

        System.out.println(message);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
All numbers are equal
Neither all are equal or different
Invalid Value
All numbers are different
```