Sum Of Digit Challenge
--

#### Problem statement:

- Write a method with the name **sumDigit** that has one **int** parameter called **number**.
- If parameter is **>= 10** then the method should process the number and return **sum of the all digits**, otherwise return **-1** to indicate **invalid value**.
- The numbers from **0-9** have **1 digit** so we don't want to process them, also we don't want to process negative numbers, so also return **-1** for negative numbers.
- For example calling the method **sumDigit(125)** should return **8** since **1 + 2 + 5 = 8**.
- Calling the method **sumDigit(1)** should return **-1** as per requirements described above.

```
- Example
    - sumDigit(125)     => 8
    - sumDigit(1)       => -1
    - sumDigit(-125)    => -1
    - sumDigit(32123)   => 11
```

#### Solution:
**SUmOfDigit.java**
```java
package com.learning.days021to040.days035;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(1));
        System.out.println(sumDigit(-125));
        System.out.println(sumDigit(32123));
    }

    public static int sumDigit(
        final int number
    ) {
        if (number < 10) {
            return -1;
        }

        int givenNumber = number;
        int sum = 0;

        while(givenNumber != 0) {
            int leastSignificantDigit = givenNumber % 10;
            sum += leastSignificantDigit;
            givenNumber /= 10;
        }
        return sum;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
8
-1
-1
11
```