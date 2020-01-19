First And Last Digit Sum Challenge
--

#### Problem statement:

- Write a method named **sumFirstAndLastDigit** with **one parameter** of type **int** called **number**.
- The method needs to find the **first** and the **last** digit of the parameter **number** passed to the method, using a **loop** and **return** the sum of the first and the last digit of that number.
- If the number is **negative** the method needs to **return -1** to indicate an **invalid value**.

```
- Example
	- sumFirstAndLastDigit(252)		=> 4
	- sumFirstAndLastDigit(257)		=> 9
	- sumFirstAndLastDigit(0)		=> 0
	- sumFirstAndLastDigit(5)		=> 10
	- sumFirstAndLastDigit(-10)		=> -1
```

#### Solution:
**FirstAndLastDigitSum.java**
```java
package com.learning.days021to040.days037;

public class FirstAndLasDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;
        int inputNumber = number;

        while (inputNumber != 0) {
            lastDigit = inputNumber % 10;
            inputNumber /= 10;
        }

        return (firstDigit + lastDigit);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
4
9
0
10
-1
```