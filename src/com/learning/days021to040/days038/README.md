Even Digit Sum Challenge
--

#### Problem statement:

- Write a method named **getEvenDigitSum** with one parameter of type **int** called **number**.
- The method should **return the sum of the even digits** within the number.
- If the number is **negative**, the method should **return -1 to indicate an invalid value**.

```
- Example
	- getEvenDigitSum(123456789)    => 20
	- getEvenDigitSum(252)          => 4
	- getEvenDigitSum(-22)          => -1
```

#### Solution:
**EvenDigitSum.java**
```java
package com.learning.days021to040.days038;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int givenNumber = number;

        while (givenNumber != 0) {
            int leastSignificatntDigit = givenNumber % 10;

            if(isEven(leastSignificatntDigit)) {
                sum += leastSignificatntDigit;
            }

            givenNumber /= 10;
        }

        return sum;
    }

    public static boolean isEven(
        final int number
    ) {
        return (number % 2 == 0);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
20
4
-1
```